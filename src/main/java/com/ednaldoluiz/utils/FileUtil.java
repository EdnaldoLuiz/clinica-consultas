package com.ednaldoluiz.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil {
    public static List<String> lerLinhasArquivo(String nomeArquivo) throws IOException {
        return Files.readAllLines(Paths.get(nomeArquivo));
    }

    public static void escreverLinhasArquivo(List<String> linhas, String nomeArquivo) throws IOException {
        Files.write(Paths.get(nomeArquivo), linhas);
    }
}
