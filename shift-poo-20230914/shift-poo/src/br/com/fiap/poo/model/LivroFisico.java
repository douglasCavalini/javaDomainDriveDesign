package br.com.fiap.poo.model;

import br.com.fiap.poo.contrato.Oferta;

public class LivroFisico extends Livro implements Oferta {

    public double getTaxaImpressao() {
        return getPreco() * 0.08;
    }

    @Override
    public void exibir() {
        super.exibir();
        //System.out.println("- Taxa de impressão: " + getTaxaImpressao());
        String resultado = String.format("R$ %.2f", getTaxaImpressao());
        //String resultado = formatarValor(getTaxaImpressao());
        System.out.println("- Taxa de impressão: " + resultado);
    }

    @Override
    public String getTipo() {
        return "Livro Físico";
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual > 0.2) {
            System.out.println("Desconto não disponível");
        } else {
            preco = preco - (preco * percentual);
        }
    }

}
