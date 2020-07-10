package com.greydevelopments.petclinic.web.vet.showvets.infrastructure.controllers;

import com.greydevelopments.petclinic.person.vet.vet.domain.repositories.VetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class ShowVetsController {
    private final VetRepository vetService;

    public ShowVetsController(VetRepository vetService) {
        this.vetService = vetService;
    }

    @GetMapping("/vets")
    public String showVets(Model model) {
        model.addAttribute("vets", this.vetService.findAll());

        return "vets/index";
    }
}
