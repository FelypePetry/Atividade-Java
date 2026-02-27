package com.theo.sistema_estudantes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Aluno {
    private String nome;
    private String matricula;
    private Curso curso;
    private int periodo;
}
