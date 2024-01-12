package com.ednaldoluiz;

import com.ednaldoluiz.app.controller.ClinicaController;
import com.ednaldoluiz.core.impl.ConsultaServiceImpl;
import com.ednaldoluiz.core.impl.PacienteServiceImpl;
import com.ednaldoluiz.core.service.ConsultaService;
import com.ednaldoluiz.core.service.PacienteService;

public class ClinicaConsultas {
    public static void main(String[] args) {
        PacienteService pacienteService = new PacienteServiceImpl();
        ConsultaService consultaService = new ConsultaServiceImpl();
        ClinicaController sistema = new ClinicaController(pacienteService, consultaService);

        sistema.iniciarSistema();
    }
}
