package com.nambong.compos.controller;

import com.nambong.compos.model.Profile;
import com.nambong.compos.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class profileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping("/profile")
    public String getprofiles(Model model){
        model.addAttribute("profiles", profileService.getProfile());

        return "profiles";
    }

    @PostMapping("/profiles/addNew")
    public String addNew(Profile profile){
        profileService.save(profile);
        return"redirect:/profiles";
    }

    @RequestMapping("/profiles/findById")
    @ResponseBody
    public Optional<Profile> findById(int id){
        return profileService.findById(id);
    }

    @RequestMapping(value = "/profiles/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Profile profile){
        profileService.save(profile);
        return "redirect:/profiles";
    }

    @RequestMapping(value = "/profiles/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(int id){
        profileService.delete(id);
        return "redirect:/profiles";
    }
}
