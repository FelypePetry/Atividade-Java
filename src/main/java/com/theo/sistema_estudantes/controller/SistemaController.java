package com.theo.sistema_estudantes.controller;

import ch.qos.logback.core.model.Model;
import com.theo.sistema_estudantes.service.SistemaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/sistema")

public class SistemaController {
    public final SistemaService service;

    public SistemaController(SistemaService service) {
        this.service = service;
    }

    @GetMapping("/info")
    public String info(){
        return "sistema/info";
    }
}
