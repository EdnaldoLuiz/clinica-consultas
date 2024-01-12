package com.ednaldoluiz.app.controller;

import java.util.Scanner;

import com.ednaldoluiz.core.service.ConsultaService;
import com.ednaldoluiz.core.service.PacienteService;

public class ClinicaController {

    private static final Scanner scanner = new Scanner(System.in);
    private final PacienteService pacienteService;
    private final ConsultaService consultaService;

    public ClinicaController(PacienteService pacienteService, ConsultaService consultaService) {
        this.pacienteService = pacienteService;
        this.consultaService = consultaService;
    }

    public void iniciarSistema() {}
}