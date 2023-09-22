public class CadastroLivros {

    public static void main(String[] args) {
        Livro umLivro = new Livro();
        umLivro.setTitulo("O Hobbit");
        umLivro.setAutor("J.R.R. Tolkien");
        umLivro.setEditora(new Editora("Editora 1"));
        umLivro.setPaginas(352);
        umLivro.setPreco(100);
        umLivro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        umLivro.setResumo("resumo do livro");
        umLivro.aplicarDesconto(0.10);
        umLivro.exibir();

        Livro livroFavorito = new Livro();
        livroFavorito.setTitulo("Anjos e Demônios");
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setTipoCapa(TipoCapaEnum.COMUM);
        livroFavorito.setEditora(new Editora("Sextante"));
        livroFavorito.setPaginas(125);
        livroFavorito.setPreco(25.99);
        livroFavorito.exibir();

        Livro outroLivro = new Livro();
        outroLivro.exibir();
    }

}
