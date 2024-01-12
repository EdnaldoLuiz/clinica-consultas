package com.ednaldoluiz.core.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ednaldoluiz.app.model.Consulta;
import com.ednaldoluiz.core.service.ConsultaService;

public class ConsultaServiceImpl implements ConsultaService {
    private List<Consulta> consultas;

    public ConsultaServiceImpl() {
        this.consultas = new ArrayList<>();
    }

    @Override
    public List<Consulta> listarConsultas() {
        return new ArrayList<>(consultas);
    }

    @Override
    public void marcarConsulta(int numeroPaciente, LocalDateTime dataHora, String especialidade) {
        // Implementação da marcação de consulta
    }

    @Override
    public void cancelarConsulta(int numeroConsulta) {
        // Implementação do cancelamento de consulta
    }

    @Override
    public boolean consultaExistente(LocalDateTime dataHora) {
        // Verifica se a consulta já existe na lista
        return consultas.stream().anyMatch(c -> c.getDataHora().equals(dataHora));
    }
}

