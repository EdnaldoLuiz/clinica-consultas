package com.ednaldoluiz.core.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.ednaldoluiz.app.model.Paciente;
import com.ednaldoluiz.core.service.PacienteService;
import com.ednaldoluiz.core.validator.PacienteValidator;
import com.ednaldoluiz.utils.FileUtil;
import com.ednaldoluiz.utils.TerminalUtil;

public class PacienteServiceImpl implements PacienteService {

    @Override
    public void adicionarPaciente() {
        Scanner scanner = new Scanner(System.in);
        UUID id = UUID.randomUUID();

        System.out.print("\nDigite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Digite o número de telefone do paciente: ");
        String telefonePaciente = scanner.nextLine();

        String nomeArquivo = "pacientes.csv";

        try {

            List<String> pacientes = FileUtil.lerArquivo(nomeArquivo);

            if (PacienteValidator.pacienteDuplicado(telefonePaciente, pacientes)) {
                TerminalUtil.mensagemFormatada(TerminalUtil.RED, "Paciente já cadastrado!");
                return;
            }

            FileWriter fileWriter = new FileWriter(nomeArquivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Paciente paciente = new Paciente(id, nomePaciente, telefonePaciente);

            bufferedWriter.write(paciente.getId() + ", " + paciente.getNome() + ", " + paciente.getTelefone());
            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("ID do paciente: " + id);
            TerminalUtil.mensagemFormatada(TerminalUtil.GREEN, "Paciente adicionado com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

