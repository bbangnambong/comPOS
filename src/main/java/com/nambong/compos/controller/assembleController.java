package com.nambong.compos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class assembleController {
    @GetMapping("/assembles")
    public String goAssemble() {
        return "assemble";
    }
}
