package com.jetbrains;

/**
 * <b>Classe relativa ao grupo de investigação ECOS.</b>
 */

public class ECOS extends GrupoInvestigacao{

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #ECOS}.
     */

    public ECOS(){
        this.nome = "Evolutionary and Complex Systems";
        this.acronimo = "ECOS";
        this.investigadorResponsavel = "Nuno Lourenco";
    }

    /**
     * Construtor da classe {@linkplain #ECOS}
     * @param nome Nome do grupo de investigação.
     * @param acronimo Acrónimo do grupo de investigação.
     * @param investigadorResponsavel Investigador responsável do grupo de investigação.
     * @param numeroEstudantes Número de estudantes do grupo de investigação.
     * @param numeroMembrosEfetivos Número de membros efetivos do grupo de investigação.
     */

    public ECOS(String nome, String acronimo, String investigadorResponsavel, int numeroEstudantes, int numeroMembrosEfetivos) {
        super(nome, acronimo, investigadorResponsavel, numeroEstudantes, numeroMembrosEfetivos);
    }

}
