package com.jetbrains;

/**
 * <b>Classe relativa ao grupo de investigacao AC.</b>
 */

public class AC extends GrupoInvestigacao{

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #AC}.
     */

    public AC(){
        this.nome = "Adaptive Computation";
        this.acronimo = "AC";
        this.investigadorResponsavel = "Jorge Henriques";
    }

    /**
     * Construtor da classe {@linkplain #AC}
     * @param nome Nome do grupo de investigação.
     * @param acronimo Acrónimo do grupo de investigação.
     * @param investigadorResponsavel Investigador responsável do grupo de investigação.
     * @param numeroEstudantes Número de estudantes do grupo de investigação.
     * @param numeroMembrosEfetivos Número de membros efetivos do grupo de investigação.
     */

    public AC(String nome, String acronimo, String investigadorResponsavel, int numeroEstudantes, int numeroMembrosEfetivos) {
        super(nome, acronimo, investigadorResponsavel, numeroEstudantes, numeroMembrosEfetivos);
    }

}
