package com.ednaldoluiz.core.validator;

import java.util.List;

public class PacienteValidator {

    public static boolean pacienteDuplicado(String telefone, List<String> pacientes) {
        for (String paciente : pacientes) {
            String[] pacienteInfo = paciente.split(", ");
            String telefoneExistente = pacienteInfo[2].trim();
            if (telefoneExistente.equals(telefone)) {
                return true;
            }
        }
        return false;
    }
}
