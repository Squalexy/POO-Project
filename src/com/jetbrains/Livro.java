package com.jetbrains;

/**
 * <b>Classe do tipo "Livro" descendente da classe "Publicacao".</b>
 */

public class Livro extends Publicacao{

    protected String editora, ISBN;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain Livro}.
     */

    public Livro(){
        this.tipoPublicacao = "Livro";
    }

    /**
     * Construtor da classe {@linkplain Livro}.
     * @param editora Editora do livro.
     * @param ISBN ISBN do livro.
     */

    public Livro(String editora, String ISBN) {
        this.editora = editora;
        this.ISBN = ISBN;
    }

    /**
     * Construtor da classe {@linkplain Livro}.
     * @param titulo Título do livro.
     * @param palavrasChave Palavras-chave do livro.
     * @param resumo Resumo do livro.
     * @param anoPublicacao Ano de publicação do livro.
     * @param dimensaoAudiencia Dimensão da audiência do livro.
     * @param editora Editora do livro.
     * @param ISBN ISBN do livro.
     */

    public Livro(String titulo, String palavrasChave, String resumo, int anoPublicacao, int dimensaoAudiencia, String editora, String ISBN) {
        super(titulo, palavrasChave, resumo, anoPublicacao, dimensaoAudiencia);
        this.editora = editora;
        this.ISBN = ISBN;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que retorna o nome da editora do livro.
     * @return Editora do livro.
     */

    public String getEditora() {
        return editora;
    }

    /**
     * Método get que retorna o ISBN do livro.
     * @return ISBN do livro.
     */

    public String getISBN() {
        return ISBN;
    }

    /**
     * Método set que substitui a atual editora do livro por uma editora dada como argumento.
     * @param editora Editora do livro.
     */

    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * Método set que substitui o atual ISBN  do livro por um ISBN dada como argumento.
     * @param ISBN ISBN do livro.
     */

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método <u>abstrato</u> que calcula o fator de impacto de um livro.</b>
     * @return "A", "B" ou "C"
     */

    @Override
    public String fatorImpacto() {
        if (this.dimensaoAudiencia < 5000){
            return "C";
        }
        else if (this.dimensaoAudiencia < 10000){
            return "B";
        }
        else if (this.dimensaoAudiencia > 10000){
            return "A";
        }
        else{
            return "Dimensão inválida";
        }
    }

    /**
     * <b>Método que escreve as informações do livro.</b>
     * @return String com as informações do livro.
     */

    @Override
    public String toString() {
        return super.toString()
                + "\nEditora: " + editora + " | ISBN: " + ISBN;
    }
}
