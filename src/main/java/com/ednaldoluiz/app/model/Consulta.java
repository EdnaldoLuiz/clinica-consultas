package com.ednaldoluiz.app.model;

import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private LocalDateTime dataHora;
    private String especialidade;

    public Consulta(Paciente paciente, LocalDateTime dataHora, String especialidade) {
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.especialidade = especialidade;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}