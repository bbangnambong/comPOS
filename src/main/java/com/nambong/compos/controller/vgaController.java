package com.nambong.compos.controller;

import com.nambong.compos.model.Vga;
import com.nambong.compos.model.VgaChipset;
import com.nambong.compos.service.VgaChipsetService;
import com.nambong.compos.service.VgaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class vgaController {
    @Autowired
    private VgaService vgaService;
    @Autowired
    private VgaChipsetService vgaChipsetService;

    @GetMapping("/vgas")
    public String getvgas(Model model){
        model.addAttribute("vgas", vgaService.getVga());
        model.addAttribute("vgaChipsets", vgaChipsetService.getVgaChipset());
        return "vgas";
    }

    @PostMapping("/vgas/addNew")
    public String addNew(Vga vga){
        vgaService.save(vga);
        return"redirect:/vgas";
    }

    @PostMapping("/vgaschipset/addNew")
    public String addNew(VgaChipset vgaChipset){
        vgaChipsetService.save(vgaChipset);
        return"redirect:/vgas";
    }

    @RequestMapping("/vgas/findById")
    @ResponseBody
    public Optional<Vga> findById(int id){
        return vgaService.findById(id);
    }

    @RequestMapping(value = "/vgas/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Vga vga){
        vgaService.save(vga);
        return "redirect:/vgas";
    }

    @RequestMapping(value = "/vgas/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        vgaService.delete(id);
        return "redirect:/vgas";
    }
}
