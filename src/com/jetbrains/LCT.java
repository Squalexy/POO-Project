package com.jetbrains;

/**
 * <b>Classe relativa ao grupo de investigação LCT.</b>
 */

public class LCT extends GrupoInvestigacao{

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #LCT}.
     */

    public LCT(){
        this.nome = "Communications and Telematics";
        this.acronimo = "LCT";
        this.investigadorResponsavel = "Paulo Simoes";
    }

    /**
     * Construtor da classe {@linkplain #LCT}
     * @param nome Nome do grupo de investigação.
     * @param acronimo Acrónimo do grupo de investigação.
     * @param investigadorResponsavel Investigador responsável do grupo de investigação.
     * @param numeroEstudantes Número de estudantes do grupo de investigação.
     * @param numeroMembrosEfetivos Número de membros efetivos do grupo de investigação.
     */

    public LCT(String nome, String acronimo, String investigadorResponsavel, int numeroEstudantes, int numeroMembrosEfetivos) {
        super(nome, acronimo, investigadorResponsavel, numeroEstudantes, numeroMembrosEfetivos);
    }

}
