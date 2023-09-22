package br.com.fiap.poo.model;

public class CarrinhoCompra {

    private double total;

    public void exibirTotal() {
        System.out.println("Total: R$ " + total);
    }

    //POLIMORFISMO
    public void adicionar(Livro livro) {
        System.out.println("Adicionado ao carrinho: "+ livro.getTipo());
        total = total + livro.getPreco();
    }

}
