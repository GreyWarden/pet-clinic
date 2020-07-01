package com.greywarden.petclinic.web.owner.showowners.infrastructure.controllers;

import com.greywarden.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class ShowOwnersController {

    private OwnerService ownerService;

    public ShowOwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/owners")
    public String showOwners(Model model)
    {
        model.addAttribute("owners", this.ownerService.findAll());

        return "owners/index";
    }
}
