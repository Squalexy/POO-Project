package com.jetbrains;

/**
 * <b>Classe relativa ao grupo de investigação IS.</b>
 */

public class IS extends GrupoInvestigacao{

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #IS}.
     */

    public IS(){
        this.nome = "Information Systems";
        this.acronimo = "IS";
        this.investigadorResponsavel = "Licinio Roque";
    }

    /**
     * Construtor da classe {@linkplain #IS}
     * @param nome Nome do grupo de investigação.
     * @param acronimo Acrónimo do grupo de investigação.
     * @param investigadorResponsavel Investigador responsável do grupo de investigação.
     * @param numeroEstudantes Número de estudantes do grupo de investigação.
     * @param numeroMembrosEfetivos Número de membros efetivos do grupo de investigação.
     */

    public IS(String nome, String acronimo, String investigadorResponsavel, int numeroEstudantes, int numeroMembrosEfetivos) {
        super(nome, acronimo, investigadorResponsavel, numeroEstudantes, numeroMembrosEfetivos);
    }

}
