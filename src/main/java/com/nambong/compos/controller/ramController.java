package com.nambong.compos.controller;

import com.nambong.compos.model.Ddr;
import com.nambong.compos.model.Ram;
import com.nambong.compos.model.Vol;
import com.nambong.compos.service.DdrService;
import com.nambong.compos.service.RamService;
import com.nambong.compos.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ramController {
    @Autowired
    private RamService ramService;
    @Autowired
    private VolService volService;
    @Autowired
    private DdrService ddrService;

    @GetMapping("/rams")
    public String getrams(Model model){
        model.addAttribute("rams", ramService.getRam());
        model.addAttribute("ddrs", ddrService.getDdr());
        model.addAttribute("vols", volService.getVol());

        return "rams";
    }

    @PostMapping("/rams/addNew")
    public String addNew(Ram ram){
        ramService.save(ram);
        return"redirect:/rams";
    }
    @PostMapping("/ddrs/addNew")
    public String addNewDdr(Ddr ddr){
        ddrService.save(ddr);
        return"redirect:/rams";
    }
    @PostMapping("/vols/addNew")
    public String addNewVol(Vol vol){
        volService.save(vol);
        return"redirect:/rams";
    }

    @RequestMapping("/rams/findById")
    @ResponseBody
    public Optional<Ram> findById(int id){
        return ramService.findById(id);
    }

    @RequestMapping(value = "/rams/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Ram ram){
        ramService.save(ram);
        return "redirect:/rams";
    }

    @RequestMapping(value = "/rams/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        ramService.delete(id);
        return "redirect:/rams";
    }
}
