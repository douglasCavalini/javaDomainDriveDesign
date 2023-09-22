package br.com.fiap.poo.model;

public class LivroBolso extends Livro {

    @Override
    public String getTipo() {
        return "Livro de Bolso";
    }

    @Override
    public void aplicarDesconto(double percentual) {
        System.out.println("Desconto não disponível");
    }

}
