package com.jetbrains;

/**
 * <b>Classe descendente da classe "Investigador" do tipo "Membro efetivo".</b>
 */

public class MembroEfetivo extends Investigador{

    private int numeroGabinete, numeroTelefoneDEI;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain MembroEfetivo}.
     */

    public MembroEfetivo() {
        this.categoria = "Membro Efetivo";
    }

    /**
     * Construtor da classe {@linkplain MembroEfetivo}.
     * @param nome Nome do membro efetivo.
     * @param email Email do membro efetivo.
     * @param grupoInvestigacao Grupo de investigação do membro efetivo.
     * @param numeroGabinete Nº do gabinete do nembro efetivo.
     * @param numeroTelefoneDEI Nº de telefone do DEI do membro efetivo.
     */

    public MembroEfetivo(String nome, String email, String grupoInvestigacao, int numeroGabinete, int numeroTelefoneDEI) {
        super(nome, email, grupoInvestigacao);
        this.numeroGabinete = numeroGabinete;
        this.numeroTelefoneDEI = numeroTelefoneDEI;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que retorna o nº do gabinete do membro efetivo.
     * @return Nº do gabinete.
     */

    public int getNumeroGabinete() {
        return numeroGabinete;
    }

    /**
     * Método get que retorna o nº de telefone do DEI do membro efetivo.
     * @return Nº de telefone.
     */

    public int getNumeroTelefoneDEI() {
        return numeroTelefoneDEI;
    }

    /**
     * Método set que substitui o nº do gabinete atual do membro efetivo por um nº dado como argumento.
     * @param numeroGabinete Nº do gabinete
     */

    public void setNumeroGabinete(int numeroGabinete) {
        this.numeroGabinete = numeroGabinete;
    }

    /**
     * Método set que substitui o nº de telefone do DEI atual do membro efetivo por um nº dado como argumento.
     * @param numeroTelefoneDEI Nº de telefone do DEI.
     */

    public void setNumeroTelefoneDEI(int numeroTelefoneDEI) {
        this.numeroTelefoneDEI = numeroTelefoneDEI;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * Método toString() que escreve as informações do membro efetivo.
     * @return Informações do membro efetivo.
     */

    @Override
    public String toString() {

        return super.toString() + " --- Nº gabinete: " + numeroGabinete + " --- NºDEI: " + numeroTelefoneDEI;
    }

    /**
     *<b>Método que modifica o nome do investigador consoante o seu tipo.</b>
     * @return "Charles Robert Darwin" -> "Professor Charles Darwin"
     */

    @Override
    public String outputInvestigador() {
        String[] nameToList = nome.split(" ");
        String primeiroNome = "";
        String pronome = "";

        for (int i = 0; i < nameToList.length; i++) {
            if (i == 0) {
                primeiroNome = nameToList[i];
            } else if (i == nameToList.length - 1) {
                pronome = nameToList[i];
            }
        }
        return "Professor " + primeiroNome + " " + pronome;
    }
}
