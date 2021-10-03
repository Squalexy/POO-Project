package com.jetbrains;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * <b>Classe abstrata de uma publicação.</b>
 */

public abstract class Publicacao implements Serializable {

    protected ArrayList<Investigador> autores;
    protected String titulo, palavrasChave, resumo, tipoPublicacao;
    protected int anoPublicacao, dimensaoAudiencia;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain Publicacao}
     */

    public Publicacao(){
        autores = new ArrayList<>();
    }

    /**
     * Construtor da classe {@linkplain Publicacao}
     * @param titulo Título da publicação.
     * @param palavrasChave Palavras-chave da publicação.
     * @param resumo Resumo da publicação.
     * @param tipoPublicacao Tipo de publicação.
     * @param anoPublicacao Ano de publicação.
     * @param dimensaoAudiencia Dimensão da audiência da publicação.
     */

    public Publicacao(String titulo, String palavrasChave, String resumo, String tipoPublicacao, int anoPublicacao, int dimensaoAudiencia) {
        this.titulo = titulo;
        this.palavrasChave = palavrasChave;
        this.resumo = resumo;
        this.anoPublicacao = anoPublicacao;
        this.tipoPublicacao = tipoPublicacao;
        this.dimensaoAudiencia = dimensaoAudiencia;
    }

    /**
     *
     * @param titulo Título da publicação.
     * @param palavrasChave Palavras-chave da publicação.
     * @param resumo Resumo da publicação.
     * @param anoPublicacao Ano de publicação.
     * @param dimensaoAudiencia Dimensão da audiência da publicação.
     */

    public Publicacao(String titulo, String palavrasChave, String resumo, int anoPublicacao, int dimensaoAudiencia) {
        this.titulo = titulo;
        this.palavrasChave = palavrasChave;
        this.resumo = resumo;
        this.anoPublicacao = anoPublicacao;
        this.dimensaoAudiencia = dimensaoAudiencia;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que devolve o título da publicação.
     * @return Título da publicação
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Método get que devolve as palavras-chave da publicação.
     * @return Palavras-chave da publicação
     */

    public String getPalavrasChave() {
        return palavrasChave;
    }

    /**
     * Método get que devolve o ano de publicação.
     * @return Ano de publicação.
     */

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * Método get que devolve a dimensão da audiência da publicação.
     * @return Dimensão da audiência da publicação
     */

    public int getDimensaoAudiencia() {
        return dimensaoAudiencia;
    }

    /**
     * Método get que devolve o resumo da publicação.
     * @return Resumo da publicação
     */

    public String getResumo() {
        return resumo;
    }

    /**
     * Método get que devolve o tipo de publicação.
     * @return Tipo de publicação
     */

    public String getTipoPublicacao() {
        return tipoPublicacao;
    }

    /**
     * Método get que devolve os autores publicação.
     * @return Autores da publicação
     */

    public ArrayList<Investigador> getAutores() {
        return autores;
    }

    /**
     * Método set que substitui o título atual da publicação por um título dado como argumento.
     * @param titulo Título da publicação.
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método set que substitui as palavras-chave atuais da publicação por umas dadas como argumento.
     * @param palavrasChave Palavras-chave da publicação.
     */

    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    /**
     * Método set que substitui o ano de publicação por um ano dado como argumento.
     * @param anoPublicacao Ano de publicação.
     */

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * Método set que substitui a dimensão da audiência da publicação por uma audiência dada como argumento.
     * @param dimensaoAudiencia Dimensão da audiência da publicação.
     */

    public void setDimensaoAudiencia(int dimensaoAudiencia) {
        this.dimensaoAudiencia = dimensaoAudiencia;
    }

    /**
     * Método set que substitui o resumo atual da publicação por um resumo dado como argumento.
     * @param resumo Resumo da publicação.
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    /**
     * Método set que substitui o tipo atual da publicação por um tipo dado como argumento.
     * @param tipoPublicacao Tipo da publicação.
     */

    public void setTipoPublicacao(String tipoPublicacao) {
        this.tipoPublicacao = tipoPublicacao;
    }

    /**
     * Método set que substitui os autores atuais da publicação por uns dados como argumento.
     * @param autores Autores da publicação.
     */

    public void setAutores(ArrayList<Investigador> autores) {
        this.autores = autores;
    }

//----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método <u>abstrato</u> que calcula o fator de impacto da publicação.</b>
     * <p>
     * O fator de impacto depende do tipo de publicação e da dimensão da audiência.
     * </p>
     */

    public abstract String fatorImpacto();

    /**
     * <b>Método que escreve as informações da publicação.</b>
     * @return String com as informações da publicação.
     */

    @Override
    public String toString() {

        ArrayList<String> novosAutores = new ArrayList<>();
        for (Investigador inv : getAutores()){
            novosAutores.add(inv.outputInvestigador());
        }
        return anoPublicacao + " | "
                + tipoPublicacao
                + " | Impacto " + fatorImpacto() + " | " + "'"
                + titulo + "' | "
                + novosAutores
                + " | Resumo: " + resumo
                + " | Palavras-Chave: " + palavrasChave
                + " | Dimensão da audiência: " + dimensaoAudiencia;
    }
}
