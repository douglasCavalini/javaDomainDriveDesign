package br.com.fiap.poo.model;

import br.com.fiap.poo.contrato.Exemplar;
import br.com.fiap.poo.enums.TipoCapaEnum;

public abstract class Livro implements Exemplar {

    private String titulo;
    private String autor;
    protected double preco;
    private Editora editora;
    private int paginas;
    private String resumo;
    private TipoCapaEnum tipoCapa;

    public void exibir() {
        System.out.println("Detalhes do livro: " + titulo);
        System.out.println("- Tipo: " + getTipo());
        System.out.println("- Título: " + titulo);
        System.out.println("- Autor: " + autor);
        System.out.println("- Qtde. páginas: " + paginas);
        System.out.println("- Preço: " + obterPrecoFormatado());
        System.out.println("- Capa: " + tipoCapa);
        if (editora != null) {
            System.out.println("- Editora: " + editora.getNome());
        }
    }

    public abstract String getTipo();

    //public abstract void aplicarDesconto(double percentual);

    String obterPrecoFormatado() {
        // Preço: R$ 33.54
        return String.format("R$ %.2f", getPreco());
        //return formatarValor(preco);
    }

    String formatarValor(double valor) {
        String resultado = String.format("R$ %.2f", valor);
        return resultado;
    }

    public Livro() {
        tipoCapa = TipoCapaEnum.COMUM;
        preco = 1.99;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

}
