package com.project.app.rest.Application.Models;

import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class FuncionarioDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int Id;

    @NotEmpty(message = "O campo não pode ser nulo")
    @Column
    public String nome;

    @NotEmpty(message = "O campo não pode ser nulo")
    @Column
    public String foto;

    @NotNull(message = "O campo não pode ser nulo")
    @Column
    public long rg;

    @NotNull(message = "O campo não pode ser nulo")
    @Column
    public int id_departamento;

}
