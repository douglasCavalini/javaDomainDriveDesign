package br.com.fiap.poo.contrato;

/**
 * Modelo que deve ser implementado,
 * especificando o seu tipo e preço.
 *
 * @author Rogério de Morais
 */
public interface Exemplar {

    /**
     * Obtém o tipo de exemplar. Ex. Livro físico, revista, etc.
     *
     * @return string contendo o tipo específico
     */
    String getTipo();
    double getPreco();

}
