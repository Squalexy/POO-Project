package com.jetbrains;

import java.util.ArrayList;

/**
 * <b>Classe de um grupo de investigação.</b>
 */

public class GrupoInvestigacao {

    protected String nome, acronimo, investigadorResponsavel;
    protected int numeroEstudantes, numeroMembrosEfetivos;
    protected ArrayList<Investigador> investigadores;
    protected ArrayList<Publicacao> publicacoes;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain GrupoInvestigacao}.
     */

    public GrupoInvestigacao(){
        investigadores = new ArrayList<>();
        publicacoes = new ArrayList<>();
    }

    /**
     * Construtor da classe {@linkplain GrupoInvestigacao}.
     * @param nome Nome do grupo de investigação.
     * @param acronimo Acrónimo do grupo de investigação.
     * @param investigadorResponsavel Investigador responsável pelo grupo de investigação.
     * @param numeroEstudantes Nº de estudantes do grupo de investigação.
     * @param numeroMembrosEfetivos Nº de membros efetivos do grupo de investigação.
     */

    public GrupoInvestigacao(String nome, String acronimo, String investigadorResponsavel, int numeroEstudantes, int numeroMembrosEfetivos) {
        this.nome = nome;
        this.acronimo = acronimo;
        this.investigadorResponsavel = investigadorResponsavel;
        this.numeroEstudantes = numeroEstudantes;
        this.numeroMembrosEfetivos = numeroMembrosEfetivos;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que retorna o nº de estudantes do grupo de investigação.
     * @return Nº de estudante.
     */

    public int getNumeroEstudantes() {
        return numeroEstudantes;
    }

    /**
     * Método get que retorna o nº de membros efetivos do grupo de investigação.
     * @return Nº de membros efetivos.
     */

    public int getNumeroMembrosEfetivos() {
        return numeroMembrosEfetivos;
    }

    /**
     * Método get que retorna o nome do grupo de investigação.
     * @return Nome do grupo de investigação.
     */

    public String getNome() {
        return nome;
    }

    /**
     * Método get que retorna o acrónimo do grupo de investigação.
     * @return Acrónimo do grupo de investigação.
     */

    public String getAcronimo() {
        return acronimo;
    }

    /**
     * Método get que retorna o investigador responsável pelo grupo de investigação.
     * @return Investigador responsável pelo grupo de investigação.
     */

    public String getInvestigadorResponsavel() {
        return investigadorResponsavel;
    }

    /**
     * Método get que retorna o array de publicações do grupo de investigação.
     * @return Lista de publicações.
     */

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    /**
     * Método get que retorna o array de investigadores do grupo de investigação.
     * @return Lista de investigadores.
     */

    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    /**
     * Método set que substitui o nº de estudantes do grupo de investigação por um nº dado como argumento.
     * @param numeroEstudantes Nº de estudantes.
     */

    public void setNumeroEstudantes(int numeroEstudantes) {
        this.numeroEstudantes = numeroEstudantes;
    }

    /**
     * Método set que substitui o nº de membros efetivos do grupo de investigação por um nº dado como argumento.
     * @param numeroMembrosEfetivos Nº de membros efetivos.
     */

    public void setNumeroMembrosEfetivos(int numeroMembrosEfetivos) {
        this.numeroMembrosEfetivos = numeroMembrosEfetivos;
    }

    /**
     * Método set que substitui o nome do grupo de investigação por um nome dado como argumento.
     * @param nome Nome do grupo.
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método set que substitui o acrónimo do grupo de investigação por um acrónimo dado como argumento.
     * @param acronimo Acrónimo do grupo.
     */

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    /**
     * Método set que substitui o investigador responsável pelo grupo de investigação por um investigador dado como argumento.
     * @param investigadorResponsavel Investigador responsável pelo grupo.
     */

    public void setInvestigadorResponsavel(String investigadorResponsavel) {
        this.investigadorResponsavel = investigadorResponsavel;
    }

    /**
     * Método set que substitui a atual lista de publicações do grupo de investigação por uma lista dada como argumento.
     * @param publicacoes Lista de publicações.
     */

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    /**
     * Método set que substitui a atua lista de investigadores do grupo de investigação por uma lista dada como argumento.
     * @param investigadores Lista de investigadores.
     */

    public void setInvestigadores(ArrayList<Investigador> investigadores) {
        this.investigadores = investigadores;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método que escreve as informações do grupo de investigação.</b>
     * @return String com as informações do grupo de investigação.
     */

    public String toString(){
        return "Nome: " + nome + " --- Acronimo: " + acronimo + " --- Investigador responsável: " + investigadorResponsavel;
    }
}
