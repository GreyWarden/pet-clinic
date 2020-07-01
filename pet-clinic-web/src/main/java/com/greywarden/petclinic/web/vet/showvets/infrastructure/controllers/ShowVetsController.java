package com.greywarden.petclinic.web.vet.showvets.infrastructure.controllers;

import com.greywarden.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class ShowVetsController {
    private final VetService vetService;

    public ShowVetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping("/vets")
    public String showVets(Model model) {
        model.addAttribute("vets", this.vetService.findAll());

        return "vets/index";
    }
}
