package com.jetbrains;

/**
 * <b>Classe do tipo "Estudante" descendente da classe "Investigador"</b>
 */

public class Estudante extends Investigador {

    private String tituloTese, investigadorOrientador;
    private Data dataConclusao;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain Estudante}.
     */

    public Estudante() {
        this.categoria = "Estudante";
    }

    /**
     * Construtor da classe {@linkplain Estudante}.
     * @param tituloTese Título da tese do estudante.
     * @param investigadorOrientador Investigador orientador do estudante.
     * @param dataConclusao Data de conclusão da tese do estudante.
     */

    public Estudante(String tituloTese, String investigadorOrientador, Data dataConclusao) {
        this.tituloTese = tituloTese;
        this.investigadorOrientador = investigadorOrientador;
        this.dataConclusao = dataConclusao;
    }

    /**
     * Construtor da classe {@linkplain Estudante}.
     * @param nome Nome do estudante.
     * @param email Email do estudante.
     * @param grupoInvestigacao Grupo de investigação do estudante.
     * @param tituloTese Título da tese do estudante.
     * @param investigadorOrientador Nome do investigador orientador do estudante.
     * @param dataConclusao Data de conclusão da tese do estudante.
     */

    public Estudante(String nome, String email, String grupoInvestigacao, String tituloTese, String investigadorOrientador, Data dataConclusao) {
        super(nome, email, grupoInvestigacao);
        this.tituloTese = tituloTese;
        this.investigadorOrientador = investigadorOrientador;
        this.dataConclusao = dataConclusao;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que retorna o título da tese do estudante.
     * @return Título da tese.
     */

    public String getTituloTese() {
        return tituloTese;
    }

    /**
     * Método get que retorna o nome do investigador orientador do estudante.
     * @return Nome do investigador orientador.
     */

    public String getInvestigadorOrientador() {
        return investigadorOrientador;
    }

    /**
     * Método get que retorna o data de conclusão da tese do estudante.
     * @return Data de conclusão da tese.
     */

    public Data getDataConclusao() {
        return dataConclusao;
    }

    /**
     * Método set que substitui o atual título da tese do estudante por um título dado como argumento.
     * @param tituloTese Título da tese.
     */

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }

    /**
     * Método set que substitui o atual investigador orientador do estudante por um investigador dado como argumento.
     * @param investigadorOrientador Nome do investigador orientador.
     */

    public void setInvestigadorOrientador(String investigadorOrientador) {
        this.investigadorOrientador = investigadorOrientador;
    }

    /**
     * Método set que substitui a atual data de conclusão da tese do estudante por uma data dada como argumento.
     * @param dataConclusao Data de conclusão da tese.
     */

    public void setDataConclusao(Data dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método que escreve as informações do estudante.</b>
     * @return String com as informações do estudante.
     */

    @Override
    public String toString() {
        return super.toString() + " --- Tese: " + tituloTese + " --- Orientador: " + investigadorOrientador + " --- Conclusão: " + dataConclusao;
    }

    /**
     *<b>Método que modifica o nome do investigador consoante o seu tipo.</b>
     * @return "Alexy de Almeida -> A. Almeida"
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
        return primeiroNome.charAt(0) + ". " + pronome;
    }
}
