package br.com.fiap.poo.model;

import br.com.fiap.poo.contrato.Oferta;
import br.com.fiap.poo.exception.DescontoIndisponivelException;

public class LivroDigital extends Livro implements Oferta {

    private String marcaDAgua;

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    @Override
    public void aplicarDesconto(double percentual) throws DescontoIndisponivelException { // percentual = 0.10
        if (percentual > 0.1) {
            throw new DescontoIndisponivelException("Desconto maior que 10% não disponível");
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
