package br.com.fiap.myassist.model;

import br.com.fiap.myassist.enums.TipoClienteEnum;

public class Cliente extends Pessoa {

    private String documento;
    private TipoClienteEnum tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoClienteEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoClienteEnum tipo) {
        this.tipo = tipo;
    }
}
