package br.com.fiap.poo.model;

public class Editora {
    private String nome;
    private String email;
    private String site;
    private String fone;

    public Editora(String nome) {
        this.nome = nome;
    }

    // GET -> Recuperar o valor
    // SET -> Alterar o valor

    public String getNome() {
        return nome;
    }

}
