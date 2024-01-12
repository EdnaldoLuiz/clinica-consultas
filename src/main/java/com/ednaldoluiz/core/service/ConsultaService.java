package com.ednaldoluiz.core.service;

import java.time.LocalDateTime;
import java.util.List;

import com.ednaldoluiz.app.model.Consulta;

public interface ConsultaService {
    List<Consulta> listarConsultas();
    void marcarConsulta(int numeroPaciente, LocalDateTime dataHora, String especialidade);
    void cancelarConsulta(int numeroConsulta);
    boolean consultaExistente(LocalDateTime dataHora);
}
