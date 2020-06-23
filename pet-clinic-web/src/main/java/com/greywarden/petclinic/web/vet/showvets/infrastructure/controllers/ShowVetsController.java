package com.greywarden.petclinic.web.vet.showvets.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class ShowVetsController {

    @GetMapping("/vets")
    public String showVets()
    {
        return "vets/index";
    }
}
