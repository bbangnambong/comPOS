package com.nambong.compos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class blankController {
    @GetMapping("/blank")
    public String goBlank() {
        return "standard";
    }
}
