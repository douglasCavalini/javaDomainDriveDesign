package br.com.fiap.poo.model;

public class LivroBrinde extends Livro {

    @Override
    public String getTipo() {
        return "Livro Gratuíto";
    }

    @Override
    public double getPreco() {
        return 0;
    }

}
