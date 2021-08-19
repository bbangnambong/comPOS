package com.nambong.compos.controller;

import com.nambong.compos.model.Format;
import com.nambong.compos.model.SsdVol;
import com.nambong.compos.model.Ssdhdd;
import com.nambong.compos.service.FormatService;
import com.nambong.compos.service.SsdVolService;
import com.nambong.compos.service.SsdhddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ssdhddController {
    @Autowired
    private SsdhddService ssdhddService;
    @Autowired
    private SsdVolService ssdVolService;
    @Autowired
    private FormatService formatService;


    @GetMapping("/ssdhdds")
    public String getssdhdds(Model model){
        model.addAttribute("ssdhdds", ssdhddService.getSsdhdd());
        model.addAttribute("ssdvols", ssdVolService.getSsdVol());
        model.addAttribute("formats", formatService.getFormat());
        return "ssdhdds";
    }

    @PostMapping("/ssdhdds/addNew")
    public String addNew(Ssdhdd ssdhdd){
        ssdhddService.save(ssdhdd);
        return"redirect:/ssdhdds";
    }
    @PostMapping("/ssdvols/addNew")
    public String addNew(SsdVol ssdVol){
        ssdVolService.save(ssdVol);
        return"redirect:/ssdhdds";
    }
    @PostMapping("/formats/addNew")
    public String addNew(Format format){
        formatService.save(format);
        return"redirect:/ssdhdds";
    }

    @RequestMapping("/ssdhdds/findById")
    @ResponseBody
    public Optional<Ssdhdd> findById(int id){
        return ssdhddService.findById(id);
    }

    @RequestMapping(value = "/ssdhdds/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Ssdhdd ssdhdd){
        ssdhddService.save(ssdhdd);
        return "redirect:/ssdhdds";
    }

    @RequestMapping(value = "/ssdhdds/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        ssdhddService.delete(id);
        return "redirect:/ssdhdds";
    }
}
