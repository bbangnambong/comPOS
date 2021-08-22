package com.nambong.compos.controller;

import com.nambong.compos.model.*;
import com.nambong.compos.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class assembleController {
    @Autowired
    AccessoryService accessoryService;
    @Autowired
    CpuService cpuService;
    @Autowired
    MotherboardService motherboardService;
    @Autowired
    PowerService powerService;
    @Autowired
    RamService ramService;
    @Autowired
    SsdhddService ssdhddService;
    @Autowired
    VgaService vgaService;

    List<Cpu> cartedCpu = new ArrayList<>();
    List<Motherboard> cartedMotherboard = new ArrayList<>();
    List<Ram> cartedRam = new ArrayList<>();
    List<Vga> cartedVga = new ArrayList<>();
    List<Power> cartedPower = new ArrayList<>();
    List<Ssdhdd> cartedSsdhdd = new ArrayList<>();
    List<Accessory> cartedAccessory = new ArrayList<>();

    @GetMapping("/assembles")
    public String goAssemble(Model model) {
        model.addAttribute("accessories", accessoryService.getAccessoriesSorted());
        model.addAttribute("cpus", cpuService.getCpuMost());
        model.addAttribute("motherboards", motherboardService.getMotherboard());
        model.addAttribute("powers", powerService.getPowerSorted());
        model.addAttribute("rams", ramService.getRamSorted());
        model.addAttribute("ssdhdds", ssdhddService.getSsdhddSorted());
        model.addAttribute("vgas", vgaService.getVgaMost());
        model.addAttribute("cartedCpus", cartedCpu);
        model.addAttribute("cartedMotherboards", cartedMotherboard);
        model.addAttribute("cartedRams", cartedRam);
        model.addAttribute("cartedPowers", cartedPower);
        model.addAttribute("cartedSsdhdds", cartedSsdhdd);
        model.addAttribute("cartedVgas", cartedVga);
        model.addAttribute("cartedAccessories", cartedAccessory);
        return "assemble";
    }

    @GetMapping("/assembles/addcpu/")
    public String cartCpu(int id) {
        cartedCpu.add(cpuService.findById(id).get());
        return "redirect:/assembles";
    }
    @GetMapping("/assembles/addmotherboard/")
    public String cartMotherboard(int id) {
        cartedMotherboard.add(motherboardService.findById(id).get());
        return "redirect:/assembles";
    }
    @GetMapping("/assembles/addram/")
    public String cartram(int id) {
        cartedRam.add(ramService.findById(id).get());
        return "redirect:/assembles";
    }
    @GetMapping("/assembles/addvga/")
    public String cartvga(int id) {
        cartedVga.add(vgaService.findById(id).get());
        return "redirect:/assembles";
    }
    @GetMapping("/assembles/addssdhdd/")
    public String cartssdhdd(int id) {
        cartedSsdhdd.add(ssdhddService.findById(id).get());
        return "redirect:/assembles";
    }
    @GetMapping("/assembles/addpower/")
    public String cartpower(int id) {
        cartedPower.add(powerService.findById(id).get());
        return "redirect:/assembles";
    }
    @GetMapping("/assembles/addaccessory/")
    public String cartaccessory(int id) {
        cartedAccessory.add(accessoryService.findById(id).get());
        return "redirect:/assembles";
    }

    @GetMapping("/assembles/emptycart")
    public String emptyCart(){
        cartedCpu.clear();
        cartedMotherboard.clear();
        cartedRam.clear();
        cartedPower.clear();
        cartedSsdhdd.clear();
        cartedVga.clear();
        cartedAccessory.clear();
        return "redirect:/assembles";
    }
}
