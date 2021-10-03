package com.jetbrains;

/**
 * <b>Classe relativa ao grupo de investigação SSE.</b>
 */

public class SSE extends GrupoInvestigacao{

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #SSE}.
     */

    public SSE(){
        this.nome = "Software and Systems Engineering";
        this.acronimo = "SSE";
        this.investigadorResponsavel = "Henrique Madeira";
    }

    /**
     * Construtor da classe {@linkplain #SSE}
     * @param nome Nome do grupo de investigação.
     * @param acronimo Acrónimo do grupo de investigação.
     * @param investigadorResponsavel Investigador responsável do grupo de investigação.
     * @param numeroEstudantes Número de estudantes do grupo de investigação.
     * @param numeroMembrosEfetivos Número de membros efetivos do grupo de investigação.
     */

    public SSE(String nome, String acronimo, String investigadorResponsavel, int numeroEstudantes, int numeroMembrosEfetivos) {
        super(nome, acronimo, investigadorResponsavel, numeroEstudantes, numeroMembrosEfetivos);
    }
}
