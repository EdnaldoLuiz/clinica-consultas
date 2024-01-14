package com.ednaldoluiz.app.model;

import java.util.UUID;

public class Consulta {

    private UUID id;
    private Paciente paciente;
    private String dia;
    private String hora;
    private String especialidade;

    public Consulta(UUID id, Paciente paciente, String dia, String hora, String especialidade) {
        this.id = id;
        this.paciente = paciente;
        this.dia = dia;
        this.hora = hora;
        this.especialidade = especialidade;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
