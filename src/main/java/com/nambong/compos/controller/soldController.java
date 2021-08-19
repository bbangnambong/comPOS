package com.nambong.compos.controller;

import com.nambong.compos.model.Sold;
import com.nambong.compos.service.SoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class soldController {
    @Autowired
    private SoldService soldService;

    @GetMapping("/solds")
    public String getsolds(Model model){
        model.addAttribute("solds", soldService.getSold());

        return "sold";
    }

    @PostMapping("/solds/addNew")
    public String addNew(Sold sold){
        soldService.save(sold);
        return"redirect:/solds";
    }

    @RequestMapping("/solds/findById")
    @ResponseBody
    public Optional<Sold> findById(int id){
        return soldService.findById(id);
    }

    @RequestMapping(value = "/solds/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Sold sold){
        soldService.save(sold);
        return "redirect:/solds";
    }

    @RequestMapping(value = "/solds/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        soldService.delete(id);
        return "redirect:/solds";
    }
}
