package com.ednaldoluiz.core.service;

import java.util.List;

import com.ednaldoluiz.app.model.Paciente;

public interface PacienteService {
    List<Paciente> listarPacientes();
    void cadastrarPaciente(String nome, String telefone);
    boolean pacienteExiste(String telefone);
}
