package com.ednaldoluiz.app.controller;

import com.ednaldoluiz.core.impl.ConsultaServiceImpl;
import com.ednaldoluiz.core.impl.PacienteServiceImpl;

public class ClinicaController {

    private final PacienteServiceImpl pacienteService;
    private final ConsultaServiceImpl consultaService;

    public ClinicaController(PacienteServiceImpl pacienteService, ConsultaServiceImpl consultaService) {
        this.pacienteService = pacienteService;
        this.consultaService = consultaService;
    }

    public void adicionarPaciente() {
        pacienteService.adicionarPaciente();
    }

    public void listarPacientesEAgendarConsulta() {
        consultaService.agendarConsulta();
    }

    public void cancelarConsulta() {
        consultaService.cancelarConsulta();
    }
}
