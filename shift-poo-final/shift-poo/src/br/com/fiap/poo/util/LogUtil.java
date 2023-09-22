package br.com.fiap.poo.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class LogUtil {

    public static void gravar(String mensagem) {
        var caminho = Paths.get("log.txt");
        try {
            var dataHora = FormatadorUtil.formatarDataHora(LocalDateTime.now());
            var mensagemFormatada = String.format("%s - %s%s", dataHora, mensagem, System.lineSeparator());
            Files.writeString(caminho, mensagemFormatada, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exibir() {
        var caminho = Paths.get("log.txt");
        try (var stream = Files.lines(caminho)) {
            stream.forEach(i -> System.out.println(i));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
