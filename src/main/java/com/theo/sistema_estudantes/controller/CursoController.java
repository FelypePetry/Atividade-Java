package com.theo.sistema_estudantes.controller;

import com.theo.sistema_estudantes.model.Curso;
import com.theo.sistema_estudantes.service.CursoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")

public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Curso> listar() {

        return service.listarCursos();
    }

    @GetMapping("/cursos")
    public String listarCursos(Model model){
        model.addAttribute("cursos", service.listarCursos());
        return "/cursos";
    }

}
