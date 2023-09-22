package br.com.fiap.poo.contrato;

import br.com.fiap.poo.exception.DescontoIndisponivelException;

public interface Oferta {

    void aplicarDesconto(double percentual) throws DescontoIndisponivelException;

    default void aplicarDescontoDiaCriancas() throws DescontoIndisponivelException {
        aplicarDesconto(0.1);
    }

}
