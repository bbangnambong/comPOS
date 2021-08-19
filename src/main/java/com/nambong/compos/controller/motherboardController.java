package com.nambong.compos.controller;

import com.nambong.compos.model.Chipset;
import com.nambong.compos.model.Motherboard;
import com.nambong.compos.model.Socket;
import com.nambong.compos.service.ChipsetService;
import com.nambong.compos.service.MotherboardService;
import com.nambong.compos.service.SocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class motherboardController {
    @Autowired
    private MotherboardService motherboardService;
    @Autowired
    private SocketService socketService;
    @Autowired
    private ChipsetService chipsetService;

    @GetMapping("/motherboards")
    public String getMotherboards(Model model){
        model.addAttribute("motherboards", motherboardService.getMotherboard());
        model.addAttribute("sockets", socketService.getSocket());
        model.addAttribute("chipsets", chipsetService.getChipset());
        return "motherboards";
    }

    @PostMapping("/motherboards/addNew")
    public String addNew(Motherboard motherboard){
        motherboardService.save(motherboard);
        return"redirect:/motherboards";
    }
    @PostMapping("/chipsets/addNew")
    public String addNewChipset(Chipset chipset){
        chipsetService.save(chipset);
        return"redirect:/motherboards";
    }

    @RequestMapping("/motherboards/findById")
    @ResponseBody
    public Optional<Motherboard> findById(int id){
        return motherboardService.findById(id);
    }

    @RequestMapping(value = "/motherboards/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Motherboard motherboard){
        motherboardService.save(motherboard);
        return "redirect:/motherboards";
    }

    @RequestMapping(value = "/motherboards/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        motherboardService.delete(id);
        return "redirect:/motherboards";
    }
}
