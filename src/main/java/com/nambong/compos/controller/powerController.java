package com.nambong.compos.controller;

import com.nambong.compos.model.Power;
import com.nambong.compos.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class powerController {
    @Autowired
    private PowerService powerService;

    @GetMapping("/powers")
    public String getpowers(Model model){
        model.addAttribute("powers", powerService.getPower());
        return "powers";
    }

    @PostMapping("/powers/addNew")
    public String addNew(Power power){
        powerService.save(power);
        return"redirect:/powers";
    }

    @RequestMapping("/powers/findById")
    @ResponseBody
    public Optional<Power> findById(int id){
        return powerService.findById(id);
    }

    @RequestMapping(value = "/powers/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Power power){
        powerService.save(power);
        return "redirect:/powers";
    }

    @RequestMapping(value = "/powers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        powerService.delete(id);
        return "redirect:/powers";
    }
}
