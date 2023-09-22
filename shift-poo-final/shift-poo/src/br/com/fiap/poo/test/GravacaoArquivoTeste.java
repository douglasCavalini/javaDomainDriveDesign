package br.com.fiap.poo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GravacaoArquivoTeste {

    public static void main(String[] args) {
        var caminho = Paths.get("exemplo.txt");
        try {
            Files.writeString(caminho, "Escrevendo o texto Alô Mundo", StandardOpenOption.APPEND);
            Files.writeString(caminho, System.lineSeparator(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
