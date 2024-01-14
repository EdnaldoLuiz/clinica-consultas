package com.ednaldoluiz.core.validator;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.ednaldoluiz.utils.TerminalUtil;

public class ConsultaValidator {

    public static boolean isDataRetroativa(String diaConsulta) {
        try {
            int dia = Integer.parseInt(diaConsulta);

            if (dia < 1 || dia > 31) {
                return false;
            }

            LocalDate dataAtual = LocalDate.now();

            try {
                LocalDate dataConsulta = LocalDate.of(dataAtual.getYear(), dataAtual.getMonth(), dia);
                if (dataConsulta.isBefore(dataAtual)) {
                    return true;
                }
                return false;
            } catch (DateTimeException e) {
                System.out.println(TerminalUtil.RED + "Erro ao criar data." + TerminalUtil.RESET);
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println(TerminalUtil.RED + "Número inválido para o dia." + TerminalUtil.RESET);
            return false;
        }
    }

    public static boolean isConsultaAgendada(String diaConsulta, String horaConsulta, List<String> agendamentos) {
        for (String agendamento : agendamentos) {
            String[] agendamentoInfo = agendamento.split(", ");
            String diaAgendamento = agendamentoInfo[2];
            String horaAgendamento = agendamentoInfo[3];

            if (diaConsulta.equals(diaAgendamento) && horaConsulta.equals(horaAgendamento)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHoraValida(String horaConsulta) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime time = LocalTime.parse(horaConsulta, formatter);
            return true;
        } catch (DateTimeParseException e) {
            System.out
                    .println(TerminalUtil.RED + "Formato de hora inválido. Use o formato 00:00." + TerminalUtil.RESET);
            return false;
        }
    }
}
