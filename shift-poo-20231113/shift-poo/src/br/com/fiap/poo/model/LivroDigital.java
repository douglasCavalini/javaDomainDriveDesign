package br.com.fiap.poo.model;

public class LivroDigital extends Livro {

    private String marcaDAgua;

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    @Override
    public void aplicarDesconto(double percentual) { // percentual = 0.10
        if (percentual > 0.1) {
            System.out.println("Desconto não disponível");
        } else {
            preco = preco - (preco * percentual);
        }
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("- Marca d'água: " + marcaDAgua);
    }

    @Override
    public String getTipo() {
        return "Livro Digital";
    }

}
