package com.jetbrains;

/**
 * <b>Classe relativa ao grupo de investigação CMS.</b>
 */

public class CMS extends GrupoInvestigacao{

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #CMS}.
     */

    public CMS(){
        this.nome = "Cognitive and Media Systems";
        this.acronimo = "CMS";
        this.investigadorResponsavel = "Penousal Machado";
    }

    /**
     * Construtor da classe {@linkplain #CMS}
     * @param nome Nome do grupo de investigação.
     * @param acronimo Acrónimo do grupo de investigação.
     * @param investigadorResponsavel Investigador responsável do grupo de investigação.
     * @param numeroEstudantes Número de estudantes do grupo de investigação.
     * @param numeroMembrosEfetivos Número de membros efetivos do grupo de investigação.
     */

    public CMS(String nome, String acronimo, String investigadorResponsavel, int numeroEstudantes, int numeroMembrosEfetivos) {
        super(nome, acronimo, investigadorResponsavel, numeroEstudantes, numeroMembrosEfetivos);
    }

}
