package br.com.fiap.poo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorUtil {

    public static String formatarEmReais(double valor) {
        return String.format("R$ %.2f", valor);
    }

    public static String formatarDataHora(LocalDateTime date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

}
