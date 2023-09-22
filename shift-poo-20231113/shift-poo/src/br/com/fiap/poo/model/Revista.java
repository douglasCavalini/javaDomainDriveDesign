package br.com.fiap.poo.model;

import br.com.fiap.poo.contrato.Exemplar;

public class Revista implements Exemplar {

    private String titulo;
    private String resumo;
    private int paginas;
    private double preco;
    private Editora editora;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public double getPreco() {
        return 0;
    }
}
