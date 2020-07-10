package com.greydevelopments.petclinic.web.errors.getnotimplemented.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oups")
public final class NotImplementedErrorController {
    @GetMapping("")
    public String getNotImplementedError() {
        return "wip/notImplemented";
    }
}
