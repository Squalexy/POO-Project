package com.jetbrains;

import java.io.Serializable;

/**
 * <b>Classe de uma data.</b>
 */

public class Data implements Serializable {

    private int dia, mes, ano;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain Data}.
     */

    public Data(){};

    /**
     * Construtor da classe {@linkplain Data}.
     * @param dia Dia da data.
     * @param mes Mês da data.
     * @param ano Ano da data.
     */

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que devolve o dia da data.
     * @return Dia da data.
     */

    public int getDia() {
        return dia;
    }

    /**
     * Método get que devolve o mês da data.
     * @return Mês da data.
     */

    public int getMes() {
        return mes;
    }

    /**
     * Método get que devolve o ano da data.
     * @return Ano da data.
     */

    public int getAno() {
        return ano;
    }

    /**
     * Método set que substitui o atual dia da data por um dia dado como argumento.
     * @param dia Dia da data.
     */

    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Método set que substitui o atual mês da data por um mês dado como argumento.
     * @param mes Mês da data.
     */

    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Método set que substitui o atual ano da data por um ano dado como argumento.
     * @param ano Ano da data.
     */

    public void setAno(int ano) {
        this.ano = ano;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método que escreve as informações da data.</b>
     * @return A String de uma data no formato dia/mes/ano.
     */

    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
}
