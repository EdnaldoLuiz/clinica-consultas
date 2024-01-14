package com.ednaldoluiz;

import com.ednaldoluiz.app.controller.ClinicaController;
import com.ednaldoluiz.core.impl.ConsultaServiceImpl;
import com.ednaldoluiz.core.impl.PacienteServiceImpl;
import com.ednaldoluiz.utils.TerminalUtil;

import java.util.Scanner;

public class ClinicaConsultas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PacienteServiceImpl pacienteService = new PacienteServiceImpl();
        ConsultaServiceImpl consultaService = new ConsultaServiceImpl();

        ClinicaController clinicaController = new ClinicaController(pacienteService, consultaService);

        while (true) {
            System.out.println("\n--------------------------------------------------");
            System.out.println("  Seja bem vindo(a) na Clínica de Consultas Ágil");
            System.out.println("--------------------------------------------------");
            System.out.println("\n1 - Adicionar paciente");
            System.out.println("2 - Marcações de consultas");
            System.out.println("3 - Cancelamento de consultas");
            System.out.println("4 - Sair");
            System.out.print("\nEscolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    clinicaController.adicionarPaciente();
                    break;
                case 2:
                    clinicaController.listarPacientesEAgendarConsulta();
                    break;
                case 3:
                    clinicaController.cancelarConsulta();
                    break;
                case 4:
                    TerminalUtil.mensagemFormatada(TerminalUtil.GREEN, "Obrigado por utilizar o sistema!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
