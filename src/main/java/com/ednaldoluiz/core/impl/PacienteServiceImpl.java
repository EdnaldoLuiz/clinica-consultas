package com.ednaldoluiz.core.impl;

import java.util.ArrayList;
import java.util.List;

import com.ednaldoluiz.app.model.Paciente;
import com.ednaldoluiz.core.service.PacienteService;

public class PacienteServiceImpl implements PacienteService {
    private List<Paciente> pacientes;

    public PacienteServiceImpl() {
        this.pacientes = new ArrayList<>();
    }

    @Override
    public List<Paciente> listarPacientes() {
        return new ArrayList<>(pacientes);
    }

    @Override
    public void cadastrarPaciente(String nome, String telefone) {
        // Implementação do cadastro de paciente
    }

    @Override
    public boolean pacienteExiste(String telefone) {
        // Verifica se o paciente já existe na lista
        return pacientes.stream().anyMatch(p -> p.getTelefone().equals(telefone));
    }
}

