package br.com.fiap.myassist.model;

import br.com.fiap.myassist.enums.TipoEquipamentoEnum;

public class Equipamento {

    private String marca;
    private String modelo;
    private String numeroSerie;
    private TipoEquipamentoEnum tipo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoEquipamentoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipamentoEnum tipo) {
        this.tipo = tipo;
    }
}
