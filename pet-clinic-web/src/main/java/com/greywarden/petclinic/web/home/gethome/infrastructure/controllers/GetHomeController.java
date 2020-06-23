package com.greywarden.petclinic.web.home.gethome.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class GetHomeController {
    @GetMapping({"", "/", "index", "index.html"})
    public String getHome() {
        return "index";
    }
}
