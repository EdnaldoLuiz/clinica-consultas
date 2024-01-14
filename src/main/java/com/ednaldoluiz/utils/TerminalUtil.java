package com.ednaldoluiz.utils;

public class TerminalUtil {
    
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";

    public static void mensagemFormatada(String cor, String mensagem) {
        System.out.println(cor + mensagem + RESET);
    }

}
