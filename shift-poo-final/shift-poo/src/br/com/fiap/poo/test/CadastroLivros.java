package br.com.fiap.poo.test;

import br.com.fiap.poo.enums.TipoCapaEnum;
import br.com.fiap.poo.exception.DescontoIndisponivelException;
import br.com.fiap.poo.exception.PaginaInvalidaException;
import br.com.fiap.poo.model.*;
import br.com.fiap.poo.util.LogUtil;

public class CadastroLivros {

    public static void main(String[] args) {
        try {
            LogUtil.gravar("Início da aplicação");

            CarrinhoCompra carrinho1309 = new CarrinhoCompra();
            LogUtil.gravar("CarrinhoCompra criado");

            LivroBrinde umLivro = new LivroBrinde();
            umLivro.setTitulo("O Hobbit");
            umLivro.setAutor("J.R.R. Tolkien");
            umLivro.setEditora(new Editora("Editora 1"));
            umLivro.setPaginas(352);
            umLivro.setPreco(100);
            umLivro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
            umLivro.setResumo("resumo do livro");
            umLivro.exibir();
            LogUtil.gravar("LivroBrinde criado");

            carrinho1309.adicionar(umLivro);
            carrinho1309.exibirTotal();
            LogUtil.gravar("LivroBrinde adicionado ao carrinho");

            LivroFisico livroFavorito = new LivroFisico();
            livroFavorito.setTitulo("Anjos e Demônios");
            livroFavorito.setAutor("Dan Brown");
            livroFavorito.setTipoCapa(TipoCapaEnum.COMUM);
            livroFavorito.setEditora(new Editora("Sextante"));
            livroFavorito.setPaginas(125);
            livroFavorito.setPreco(25.99);
            livroFavorito.aplicarDesconto(0.1);
            livroFavorito.exibir();
            LogUtil.gravar("LivroFisico criado");

            carrinho1309.adicionar(livroFavorito);
            carrinho1309.exibirTotal();
            LogUtil.gravar("LivroFisico adicionado ao carrinho");

            LivroDigital livroDigital = new LivroDigital();
            livroDigital.setTitulo("O Hobbit");
            livroDigital.setAutor("J.R.R. Tolkien");
            livroDigital.setEditora(new Editora("Editora 1"));
            livroDigital.setPaginas(352);
            livroDigital.setPreco(100);
            livroDigital.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
            livroDigital.setResumo("resumo do livro");
            livroDigital.setMarcaDAgua("rogerio.morais@test.com.br");
            livroDigital.aplicarDesconto(0.10);
            livroDigital.exibir();
            LogUtil.gravar("LivroDigital criado");

            carrinho1309.adicionar(livroDigital);
            carrinho1309.exibirTotal();
            LogUtil.gravar("LivroDigital adicionado ao carrinho");

            Revista umaRevista = new Revista();
            umaRevista.setTitulo("Super Interessante");
            umaRevista.setPaginas(-10);
            umaRevista.setPreco(20.99);
            umaRevista.aplicarDesconto(0.05);
            LogUtil.gravar("Revista criada");

            carrinho1309.adicionar(umaRevista);
            carrinho1309.exibirTotal();
            LogUtil.gravar("Revista adicionada ao carrinho");

        } catch (DescontoIndisponivelException e) {
            LogUtil.gravar("Falha de operação: " + e.getMessage());
        } catch (PaginaInvalidaException e) {
            LogUtil.gravar("Falha na inclusão de páginas");
        } catch (Exception e) {
            LogUtil.gravar("Erro inesperado");
        } finally {
            LogUtil.gravar("Programa encerrado");
        }
    }

}
