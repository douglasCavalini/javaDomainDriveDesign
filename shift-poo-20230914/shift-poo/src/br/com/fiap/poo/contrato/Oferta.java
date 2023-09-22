package br.com.fiap.poo.contrato;

public interface Oferta {

    void aplicarDesconto(double percentual);

    default void aplicarDescontoDiaCriancas() {
        aplicarDesconto(0.1);
    }

}
