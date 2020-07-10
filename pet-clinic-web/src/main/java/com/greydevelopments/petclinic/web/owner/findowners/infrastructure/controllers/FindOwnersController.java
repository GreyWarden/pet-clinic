package com.greydevelopments.petclinic.web.owner.findowners.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners/find")
public final class FindOwnersController {
    @GetMapping("")
    public String findOwners(Model model) {
        return "wip/notImplemented";
    }
}
