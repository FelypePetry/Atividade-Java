package com.theo.sistema_estudantes.service;

import com.theo.sistema_estudantes.model.Aluno;
import com.theo.sistema_estudantes.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class SistemaService {

    private List<Aluno> alunos = new ArrayList<>();

    public SistemaService(CursoService cursoService){

        Curso ads = cursoService.buscarPorId(1);
        Curso es = cursoService.buscarPorId(2);
        Curso cc = cursoService.buscarPorId(3);

        alunos.add(new Aluno("João Silva", "1", ads, 2));
        alunos.add(new Aluno("Maria Souza", "2", es, 4));
        alunos.add(new Aluno("Carlos Lima", "3", cc, 1));
    }

    public List<Aluno> listarAlunos(){
        return alunos;
    }
}
