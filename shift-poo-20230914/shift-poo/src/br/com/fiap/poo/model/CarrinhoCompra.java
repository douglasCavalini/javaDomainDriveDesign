package br.com.fiap.poo.model;

import br.com.fiap.poo.contrato.Exemplar;
import br.com.fiap.poo.contrato.Oferta;

public class CarrinhoCompra {

    private double total;

    public void exibirTotal() {
        System.out.println("Total: R$ " + total);
    }

    //POLIMORFISMO
    public void adicionar(Exemplar exemplar) {
        System.out.println("Adicionado ao carrinho: " + exemplar.getTipo());

        if (exemplar instanceof Oferta) {
            System.out.println("Desconto promocional Dia das Crianças");
            ((Oferta) exemplar).aplicarDescontoDiaCriancas();
        }

        total = total + exemplar.getPreco();
    }

}
