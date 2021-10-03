package com.jetbrains;

/**
 * <b>Classe descendente da classe "Livro" do tipo "Livro de artigos de conferência".</b>
 */

public class ArtigoConferenciaLivro extends Livro{

    private String nomeConferencia;
    private int numeroArtigos;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//


    /**
     * Construtor da classe {@linkplain ArtigoConferenciaLivro}
     */

    public ArtigoConferenciaLivro(){
        this.tipoPublicacao = "Livro de artigos de conferência";
    }


    /**
     * Construtor da classe {@linkplain ArtigoConferenciaLivro}.
     * @param nomeConferencia Nome da conferência do livro de artigos de conferência.
     * @param numeroArtigos Número de artigos do livro de artigos de conferência.
     */

    public ArtigoConferenciaLivro(String nomeConferencia, int numeroArtigos) {
        this.nomeConferencia = nomeConferencia;
        this.numeroArtigos = numeroArtigos;
    }

    /**
     * Construtor da classe {@linkplain ArtigoConferenciaLivro}.
     * @param titulo Título do livro de artigos de conferência.
     * @param palavrasChave Palavras-chave do livro de artigos de conferência.
     * @param resumo Resumo do livro de artigos de conferência.
     * @param anoPublicacao Ano de publicação do livro de artigos de conferência.
     * @param dimensaoAudiencia Dimensão da audiência do livro de artigos de conferência.
     * @param editora Editora do livro de artigos de conferência.
     * @param ISBN ISBN do livro de artigos de conferência.
     * @param nomeConferencia Nome da conferência do livro de artigos de conferência.
     * @param numeroArtigos Número de artigos do livro de artigos de conferência.
     */

    public ArtigoConferenciaLivro(String titulo, String palavrasChave, String resumo, int anoPublicacao, int dimensaoAudiencia, String editora, String ISBN, String nomeConferencia, int numeroArtigos) {
        super(titulo, palavrasChave, resumo, anoPublicacao, dimensaoAudiencia, editora, ISBN);
        this.nomeConferencia = nomeConferencia;
        this.numeroArtigos = numeroArtigos;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que devolve o nome da conferência.
     * @return Nome da conferência.
     */

    public String getNomeConferencia() {
        return nomeConferencia;
    }

    /**
     * Método get que devolve o número de artigos.
     * @return Número de artigos.
     */

    public int getNumeroArtigos() {
        return numeroArtigos;
    }

    /**
     * Método set que substitui o nome da conferência pelo nome dado como argumento.
     * @param nomeConferencia Novo nome da conferência.
     */

    public void setNomeConferencia(String nomeConferencia) {
        this.nomeConferencia = nomeConferencia;
    }

    /**
     * Método set que substitui o número de artigos pelo nome número como argumento.
     * @param numeroArtigos Novo nome da conferência.
     */

    public void setNumeroArtigos(int numeroArtigos) {
        this.numeroArtigos = numeroArtigos;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método <u>abstrato</u> que calcula o fator de impacto do livro de artigos de conferências.</b>
     * @return "A", "B" ou "C"
     */

    @Override
    public String fatorImpacto() {
        if (this.dimensaoAudiencia < 2500){
            return "C";
        }
        else if (this.dimensaoAudiencia < 7500){
            return "B";
        }
        else if (this.dimensaoAudiencia > 7500){
            return "A";
        }
        else{
            return "Dimensão inválida";
        }
    }

    /**
     * <b>Método que escreve as informações do livro de artigos de conferência.</b>
     * @return String com as informações do livro de artigos de conferência.
     */

    @Override
    public String toString() {
        return super.toString()
                + "\nNome da conferência: " + nomeConferencia
                + " | Nº de artigos: " + numeroArtigos;
    }
}
