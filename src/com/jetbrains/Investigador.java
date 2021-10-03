package com.jetbrains;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * <b>Classe abstrata de um investigador.</b>
 */

public abstract class Investigador implements Serializable {

    protected String nome, email, grupoInvestigacao, categoria;
    protected ArrayList<Publicacao> publicacoes;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain Investigador}.
     */

    public Investigador(){
        publicacoes = new ArrayList<>();
    }

    /**
     * Construtor da classe {@linkplain Investigador}.
     * @param nome Nome do investigador.
     * @param email Email do investigador.
     * @param grupoInvestigacao Grupo de investigação do investigador.
     */

    public Investigador(String nome, String email, String grupoInvestigacao) {
    }

    /**
     * * Construtor da classe {@linkplain Investigador}.
     * @param nome Nome do investigador.
     * @param email Email do investigador.
     * @param grupoInvestigacao Grupo de investigação do investigador.
     * @param categoria Categoria do investigador.
     */

    public Investigador(String nome, String email, String grupoInvestigacao, String categoria) {
        this.nome = nome;
        this.email = email;
        this.grupoInvestigacao = grupoInvestigacao;
        this.categoria = categoria;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//


    /**
     * Método get que retorna o nome do investigador.
     * @return Nome do investigador.
     */

    public String getNome() {
        return nome;
    }

    /**
     * Método get que retorna o nome do investigador.
     * @return Nome do investigador.
     */

    public String getEmail() {
        return email;
    }

    /**
     * Método get que retorna o nome do grupo de investigação do investigador.
     * @return Nome grupo de investigação do investigador.
     */

    public String getGrupoInvestigacao() {
        return grupoInvestigacao;
    }

    /**
     * Método get que retorna a categoria do investigador.
     * @return Categoria do investigador.
     */

    public String getCategoria() {
        return categoria;
    }

    /**
     * Método get que retorna a lista de publicações do investigador.
     * @return Lista de publicações do investigador.
     */

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    /**
     * Método set que substitui o nome do investigador por um nome dado como argumento.
     * @param nome Nome do investigador.
     */


    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método set que substitui o email do investigador por um email dado como argumento.
     * @param email Email do investigador.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método set que substitui o grupo de investigação do investigador por um grupo dado como argumento.
     * @param grupoInvestigacao Grupo de investigação do investigador.
     */

    public void setGrupoInvestigacao(String grupoInvestigacao) {
        this.grupoInvestigacao = grupoInvestigacao;
    }

    /**
     * Método set que substitui a categoria do investigador por uma categoria dada como argumento.
     * @param categoria Categoria do investigador.
     */

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método set que substitui a lista de publicações do investigador por uma lista dada como argumento.
     * @param publicacoes Lista de publicações do investigador.
     */

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método que escreve as informações do investigador.</b>
     * @return String com as informações do investigador.
     */

    public String toString(){
        return "Nome: " + nome + " --- Email: " + email + " --- Grupo de investigação: " + grupoInvestigacao;
    }

    /**
     * <b>Método que modifica o nome do investigador consoante o seu tipo.</b>
     */

    public abstract String outputInvestigador();
}
