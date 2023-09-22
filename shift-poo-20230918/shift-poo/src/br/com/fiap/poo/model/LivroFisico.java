package br.com.fiap.poo.model;

import br.com.fiap.poo.contrato.Oferta;
import br.com.fiap.poo.exception.DescontoIndisponivelException;
import br.com.fiap.poo.util.FormatadorUtil;

public class LivroFisico extends Livro implements Oferta {

    public double getTaxaImpressao() {
        return getPreco() * 0.08;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("- Taxa de impressão: " + FormatadorUtil.formatarEmReais(getTaxaImpressao()));
    }

    @Override
    public String getTipo() {
        return "Livro Físico";
    }

    @Override
    public void aplicarDesconto(double percentual) throws DescontoIndisponivelException {
        if (percentual > 0.2) {
            throw new DescontoIndisponivelException("Desconto maior que 20% não disponível");
        } else {
            preco = preco - (preco * percentual);
        }
    }

}
