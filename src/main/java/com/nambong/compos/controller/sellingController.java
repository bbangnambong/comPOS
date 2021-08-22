package com.nambong.compos.controller;

import com.nambong.compos.model.Selling;
import com.nambong.compos.model.Sold;
import com.nambong.compos.service.SellingService;
import com.nambong.compos.service.SoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class sellingController {
    @Autowired
    private SellingService sellingService;
    @Autowired
    private SoldService soldService;

    @GetMapping("/sellings")
    public String getsellings(Model model){
        model.addAttribute("sellings", sellingService.getSelling());

        return "selling";
    }

    @PostMapping("/sellings/addNew")
    public String addNew(Selling selling){
        selling.creatDate();
        sellingService.save(selling);
        return"redirect:/sellings";
    }

    @RequestMapping(value = "/sellings/selling", method = {RequestMethod.DELETE, RequestMethod.GET,RequestMethod.POST})
    public String sellingNew(Selling selling){
        soldService.save(new Sold(selling));
        sellingService.delete(selling.getId());
        return "redirect:/sellings";
    }

    @RequestMapping("/sellings/findById")
    @ResponseBody
    public Optional<Selling> findById(int id){
        return sellingService.findById(id);
    }

    @RequestMapping(value = "/sellings/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Selling selling){
        selling.setAddedDate(selling.getAddedDate());
        sellingService.save(selling);

        return "redirect:/sellings";
    }

    @RequestMapping(value = "/sellings/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        sellingService.delete(id);
        return "redirect:/sellings";
    }
}
