package com.ednaldoluiz.core.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.ednaldoluiz.core.service.ConsultaService;
import com.ednaldoluiz.utils.FileUtil;
import com.ednaldoluiz.utils.TerminalUtil;

public class ConsultaServiceImpl implements ConsultaService {
    
    public void agendarConsulta() {
        Scanner scanner = new Scanner(System.in);
        try {
            String nomeArquivoPacientes = "pacientes.csv";
            List<String> pacientes = FileUtil.lerArquivo(nomeArquivoPacientes);

            if (pacientes.isEmpty()) {
                System.out.println("Nenhum paciente cadastrado.");
                return;
            }

            System.out.println("\nLista de Pacientes:\n");
            System.out.println("+----+------------------+------------------------+");
            System.out.println("| Nº |       Nome       |        Telefone        |");
            System.out.println("+----+------------------+------------------------+");

            for (int numeroPaciente = 1; numeroPaciente < pacientes.size(); numeroPaciente++) {
                String[] pacienteInfo = pacientes.get(numeroPaciente).split(", ");
                String nome = pacienteInfo[1];
                String telefone = pacienteInfo[2];

                System.out.printf("| %-2d | %-16s | %-22s |\n", numeroPaciente, nome, telefone);
            }

            System.out.println("+----+------------------+------------------------+");

            System.out.print("\nEscolha o número correspondente ao paciente para agendar a consulta: ");
            int escolhaPaciente = scanner.nextInt();

            if (escolhaPaciente >= 1 && escolhaPaciente <= pacientes.size()) {
                String pacienteSelecionado = pacientes.get(escolhaPaciente);

                String[] pacienteSelecionadoInfo = pacienteSelecionado.split(", ");
                String nomePacienteSelecionado = pacienteSelecionadoInfo[1];

                System.out.print("Digite o dia da consulta: ");
                String diaConsulta = new Scanner(System.in).nextLine();

                System.out.print("Digite a hora da consulta: ");
                String horaConsulta = new Scanner(System.in).nextLine();

                System.out.print("Digite a especialidade da consulta: ");
                String especialidadeConsulta = new Scanner(System.in).nextLine();

                String nomeArquivoAgendamentos = "agendamentos.csv";
                try {
                    FileWriter fileWriter = new FileWriter(nomeArquivoAgendamentos, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                    bufferedWriter.write(UUID.randomUUID().toString() + ", " + nomePacienteSelecionado + ", "
                            + diaConsulta + ", " + horaConsulta + ", "
                            + especialidadeConsulta);
                    bufferedWriter.newLine();
                    bufferedWriter.close();

                    System.out.println(TerminalUtil.GREEN + "Consulta agendada com sucesso." + TerminalUtil.RESET);
                } catch (IOException e) {
                    System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
                }
            } else {
                System.out.println("Número inválido. Operação cancelada.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de pacientes: " + e.getMessage());
        }
    }

    @Override
    public void cancelarConsulta() {
        Scanner scanner = new Scanner(System.in);
        try {
            String nomeArquivoAgendamentos = "agendamentos.csv";
            List<String> agendamentos = FileUtil.lerArquivo(nomeArquivoAgendamentos);

            if (agendamentos.isEmpty()) {
                System.out.println("Nenhum agendamento cadastrado.");
                return;
            }

            System.out.println("\nLista de Agendamentos para Cancelamento:\n");
            System.out.println("+----+--------------+----------------+----------------------+");
            System.out.println("| Nº |   Paciente   |      Data      |         Hora         |");
            System.out.println("+----+--------------+----------------+----------------------+");

            for (int numeroAgendamento = 1; numeroAgendamento < agendamentos.size(); numeroAgendamento++) {
                String[] agendamentoInfo = agendamentos.get(numeroAgendamento).split(", ");
                String nomePaciente = agendamentoInfo[1];
                String diaConsulta = agendamentoInfo[2];
                String horaConsulta = agendamentoInfo[3];

                System.out.printf("| %-2d | %-12s | %-14s | %-20s |\n", numeroAgendamento, nomePaciente, diaConsulta,
                        horaConsulta);
            }

            System.out.println("+----+--------------+----------------+----------------------+");

            System.out.print("\nEscolha o número correspondente ao agendamento para cancelar: ");
            int escolhaAgendamento = scanner.nextInt();

            if (escolhaAgendamento >= 1 && escolhaAgendamento <= agendamentos.size()) {
                agendamentos.remove(escolhaAgendamento);

                FileUtil.atualizarListaConsultas(nomeArquivoAgendamentos, agendamentos);

                System.out.println(TerminalUtil.GREEN + "Consulta cancelada com sucesso." + TerminalUtil.RESET);
            } else {
                System.out.println("Número inválido. Operação cancelada.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de agendamentos: " + e.getMessage());
        }
    }
}
