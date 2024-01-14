package com.ednaldoluiz.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static List<String> lerArquivo(String nomeArquivo) throws IOException {
        List<String> linhas = new ArrayList<>();
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                linhas.add(linha);
            }
        }
        return linhas;
    }

    public static void atualizarListaConsultas(String nomeArquivo, List<String> linhas) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : linhas) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }
        }
    }
}
