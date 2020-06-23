package com.greywarden.petclinic.web.owner.showowners.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class ShowOwnersController {
    @GetMapping("/owners")
    public String showOwners()
    {
        return "owners/index";
    }
}
