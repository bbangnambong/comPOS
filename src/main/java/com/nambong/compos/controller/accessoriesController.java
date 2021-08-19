package com.nambong.compos.controller;

import com.nambong.compos.model.Accessory;
import com.nambong.compos.service.AccessoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class accessoriesController {
    @Autowired
    private AccessoryService accessoryService;

    @GetMapping("/accessories")
    public String getaccessories(Model model){
        model.addAttribute("accessories", accessoryService.getAccessories());

        return "accessories";
    }

    @PostMapping("/accessories/addNew")
    public String addNew(Accessory accessory){
        accessoryService.save(accessory);
        return"redirect:/accessories";
    }

    @RequestMapping("/accessories/findById")
    @ResponseBody
    public Optional<Accessory> findById(int id){
        return accessoryService.findById(id);
    }

    @RequestMapping(value = "/accessories/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Accessory accessory){
        accessoryService.save(accessory);
        return "redirect:/accessories";
    }

    @RequestMapping(value = "/accessories/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        accessoryService.delete(id);
        return "redirect:/accessories";
    }
}