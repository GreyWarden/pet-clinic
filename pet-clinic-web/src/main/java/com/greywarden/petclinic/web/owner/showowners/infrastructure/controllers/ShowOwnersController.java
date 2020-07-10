package com.greywarden.petclinic.web.owner.showowners.infrastructure.controllers;

import com.greywarden.petclinic.person.owner.domain.repositories.OwnerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class ShowOwnersController {

    private final OwnerRepository ownerService;

    public ShowOwnersController(OwnerRepository ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/owners")
    public String showOwners(Model model)
    {
        model.addAttribute("owners", this.ownerService.findAll());

        return "owners/index";
    }
}
