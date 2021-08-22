package com.nambong.compos.controller;

import com.nambong.compos.model.Brand;
import com.nambong.compos.model.Cpu;
import com.nambong.compos.model.Socket;
import com.nambong.compos.service.BrandService;
import com.nambong.compos.service.CpuService;
import com.nambong.compos.service.SocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Controller
public class cpuController {
    @Autowired
    private CpuService cpuService;
    @Autowired
    private SocketService socketService;
    @Autowired
    private BrandService brandService;

    @GetMapping("/cpus")
    public String getcpus(Model model){
        model.addAttribute("cpus", cpuService.getCpuSorted());
        model.addAttribute("sockets", socketService.getSocket());
        model.addAttribute("brands", brandService.getBrand());

        return "cpus";
    }

    @PostMapping("/cpus/addNew")
    public String addNew(Cpu cpu){
        cpuService.save(cpu);
        return "redirect:/cpus";
    }

    @PostMapping("/sockets/addNew")
    public String addNewSocket(Socket socket){
        socketService.save(socket);
        return "redirect:/cpus";
    }

    @PostMapping("/brands/addNew")
    public String addNewBrand(Brand brand){
        brandService.save(brand);
        return "redirect:/cpus";
    }

    @RequestMapping("/cpus/findById")
    @ResponseBody
    public Optional<Cpu> findById (int id){
        return cpuService.findById(id);
    }

    @RequestMapping(value = "/cpus/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Cpu cpu){
        cpuService.save(cpu);
        return "redirect:/cpus";
    }

    @RequestMapping(value = "/cpus/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        cpuService.delete(id);
        return "redirect:/cpus";
    }
}
