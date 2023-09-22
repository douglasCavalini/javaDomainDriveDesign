package br.com.fiap.poo.util;

public class FormatadorUtil {

    public static String formatarEmReais(double valor) {
        return String.format("R$ %.2f", valor);
    }

}
