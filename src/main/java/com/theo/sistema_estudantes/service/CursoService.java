package com.theo.sistema_estudantes.service;

import com.theo.sistema_estudantes.model.Curso;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CursoService {
    private List<Curso> cursos = new ArrayList<>();

    public CursoService() {
        cursos.add(new Curso("Análise e Desenvolvimento de Sistemas", 1));
        cursos.add(new Curso("Engenharia de Software", 2));
        cursos.add(new Curso("Ciência da Computação", 3));
        cursos.add(new Curso("Sistemas de Informação", 4));
        cursos.add(new Curso("Inteligência Artificial", 5));
    }

    public List<Curso> listarCursos() {
        return cursos;
    }

    public Curso buscarPorId(Integer id) {
        for (Curso c : cursos) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;

    }
}
