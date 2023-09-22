package br.com.fiap.poo.model;

import br.com.fiap.poo.contrato.Exemplar;
import br.com.fiap.poo.contrato.Oferta;
import br.com.fiap.poo.exception.DescontoIndisponivelException;
import br.com.fiap.poo.exception.PaginaInvalidaException;

public class Revista implements Exemplar, Oferta {

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
        if (paginas <= 0) {
            throw new PaginaInvalidaException();
        }
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
        return "Revista";
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void aplicarDesconto(double percentual) throws DescontoIndisponivelException {
        if (percentual > 0.1) {
            throw new DescontoIndisponivelException("Desconto maior que 10% não disponível");
        } else {
            preco = preco - (preco * percentual);
        }
    }

}
