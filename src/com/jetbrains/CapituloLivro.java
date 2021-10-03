package com.jetbrains;

/**
 * <b>Classe do tipo "Capítulo de livro" descendente da classe "Livro".</b>
 * <p>
 * Esta classe não contém nenhum método para calcular o fator de impacto dado que o cálculo é igual para a classe {@linkplain Livro}.
 * Sendo uma classe descendente, já herda o método.
 * </p>
 */

public class CapituloLivro extends Livro{

    private String nomeCapitulo;
    private int paginaInicio, paginaFim;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #CapituloLivro}.
     */

    public CapituloLivro(){
        this.tipoPublicacao = "Capitulo de livro";
    }

    /**
     * Construtor da classe {@linkplain #CapituloLivro}.
     * @param nomeCapitulo Nome do capítulo de livro.
     * @param paginaInicio Pagina inicial do capítulo de livro.
     * @param paginaFim Página final do capítulo de livro.
     */

    public CapituloLivro(String nomeCapitulo, int paginaInicio, int paginaFim) {
        this.nomeCapitulo = nomeCapitulo;
        this.paginaInicio = paginaInicio;
        this.paginaFim = paginaFim;
    }

    /**
     * Construtor da classe {@linkplain #CapituloLivro}.
     * @param editora Editora do livro.
     * @param ISBN ISBN do livro.
     * @param nomeCapitulo Nome do capítulo de livro.
     * @param paginaInicio Pagina inicial do capítulo de livro.
     * @param paginaFim Página final do capítulo de livro.
     */

    public CapituloLivro(String editora, String ISBN, String nomeCapitulo, int paginaInicio, int paginaFim) {
        super(editora, ISBN);
        this.nomeCapitulo = nomeCapitulo;
        this.paginaInicio = paginaInicio;
        this.paginaFim = paginaFim;
    }

    /**
     * Construtor da classe {@linkplain #CapituloLivro}.
     * @param titulo Título do livro.
     * @param palavrasChave Palavras-chave do livro.
     * @param resumo Resumo do livro.
     * @param anoPublicacao Ano de publicação do livro.
     * @param dimensaoAudiencia Dimensão da audiência do livro.
     * @param editora Editora do livro.
     * @param ISBN ISBN do livro.
     * @param nomeCapitulo Nome do capítulo de livro.
     * @param paginaInicio Pagina inicial do capítulo de livro.
     * @param paginaFim Página final do capítulo de livro.
     */

    public CapituloLivro(String titulo, String palavrasChave, String resumo, int anoPublicacao, int dimensaoAudiencia, String editora, String ISBN, String nomeCapitulo, int paginaInicio, int paginaFim) {
        super(titulo, palavrasChave, resumo, anoPublicacao, dimensaoAudiencia, editora, ISBN);
        this.nomeCapitulo = nomeCapitulo;
        this.paginaInicio = paginaInicio;
        this.paginaFim = paginaFim;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que devolve o nome do capítulo.
     * @return Nome do capítulo.
     */

    public String getNomeCapitulo() {
        return nomeCapitulo;
    }

    /**
     * Método get que devolve a página inicial do capítulo.
     * @return Página inicial do capítulo.
     */

    public int getPaginaInicio() {
        return paginaInicio;
    }

    /**
     * Método get que devolve a página final do capítulo.
     * @return Página final do capítulo.
     */

    public int getPaginaFim() {
        return paginaFim;
    }

    /**
     * Método set que substitui o nome do capítulo pelo nome dado como argumento.
     * @param nomeCapitulo Novo nome do capítulo.
     */

    public void setNomeCapitulo(String nomeCapitulo) {
        this.nomeCapitulo = nomeCapitulo;
    }

    /**
     * Método set que substitui a página inicial do capítulo pela página dado como argumento.
     * @param paginaInicio Nova página inicial do capítulo.
     */

    public void setPaginaInicio(int paginaInicio) {
        this.paginaInicio = paginaInicio;
    }

    /**
     * Método set que substitui a página final do capítulo pela página dado como argumento.
     * @param paginaFim Nova página final do capítulo.
     */

    public void setPaginaFim(int paginaFim) {
        this.paginaFim = paginaFim;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método que escreve as informações do capítulo de livro.</b>
     * @return String com as informações do capítulo de livro.
     */

    @Override
    public String toString() {
        return super.toString()
                +"\nNome do capítulo: " + nomeCapitulo
                + " | Página inicial: " + paginaInicio
                + " | Página final: " + paginaFim;
    }
}
