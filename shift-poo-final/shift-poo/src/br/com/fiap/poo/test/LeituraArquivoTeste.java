package br.com.fiap.poo.test;

import br.com.fiap.poo.util.LogUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LeituraArquivoTeste {

    public static void main(String[] args) {
        /*var caminho = Paths.get("exemplo.txt");
        try (var stream = Files.lines(caminho)) {
            stream.forEach(i -> System.out.println(i));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        LogUtil.exibir();
    }

}
