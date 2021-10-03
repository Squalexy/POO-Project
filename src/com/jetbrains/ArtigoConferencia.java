package com.jetbrains;

/**
 * <b>Classe descendente da classe "Publicacao" do tipo "Artigo de conferencia".</b>
 */

public class ArtigoConferencia extends Publicacao {

    private String nomeConferencia, localizacaoConferencia;
    private Data dataConferencia;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #ArtigoConferencia}.
     */

    public ArtigoConferencia() {
        this.tipoPublicacao = "Artigo de conferencia";
    }


    /**
     * Construtor da classe {@linkplain #ArtigoConferencia}
     * @param nomeConferencia Nome da conferência.
     * @param localizacaoConferencia Localização da conferência.
     * @param dataConferencia Data da conferência.
     */

    public ArtigoConferencia(String nomeConferencia, String localizacaoConferencia, Data dataConferencia) {
        this.nomeConferencia = nomeConferencia;
        this.localizacaoConferencia = localizacaoConferencia;
        this.dataConferencia = dataConferencia;
    }

    /**
     * Construtor da classe {@linkplain #ArtigoConferencia()}.
     * @param titulo Título do artigo de conferência.
     * @param palavrasChave Palavras-chave do artigo de conferência.
     * @param resumo Resumo do artigo de conferência.
     * @param anoPublicacao Ano de publicação do artigo de conferência.
     * @param dimensaoAudiencia Dimensão da audiência do artigo de conferência.
     * @param nomeConferencia Nome da conferência do artigo de conferência.
     * @param localizacaoConferencia Localização do artigo de conferência.
     * @param dataConferencia Data de realização do artigo de conferência.
     */

    public ArtigoConferencia(String titulo, String palavrasChave, String resumo, int anoPublicacao, int dimensaoAudiencia, String nomeConferencia, String localizacaoConferencia, Data dataConferencia) {
        super(titulo, palavrasChave, resumo, anoPublicacao, dimensaoAudiencia);
        this.nomeConferencia = nomeConferencia;
        this.localizacaoConferencia = localizacaoConferencia;
        this.dataConferencia = dataConferencia;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que devolve o nome da conferência.
     * @return Nome da conferência.
     */

    public String getNomeConferencia() {
        return nomeConferencia;
    }

    /**
     * Método get que devolve a localização da conferência.
     * @return Localização da conferência.
     */

    public String getLocalizacaoConferencia() {
        return localizacaoConferencia;
    }

    /**
     * Método get que devolve a data da conferência.
     * @return Data da conferência.
     */

    public Data getDataConferencia() {
        return dataConferencia;
    }

    /**
     * Método set que substitui o nome da conferência pelo nome dado como argumento.
     * @param nomeConferencia Novo nome da conferência.
     */

    public void setNomeConferencia(String nomeConferencia) {
        this.nomeConferencia = nomeConferencia;
    }

    /**
     * Método set que substitui a localização da conferência pela localização dado como argumento.
     * @param localizacaoConferencia Nova localização da conferência.
     */

    public void setLocalizacaoConferencia(String localizacaoConferencia) {
        this.localizacaoConferencia = localizacaoConferencia;
    }

    /**
     * Método set que substitui a data da conferência pela data dada como argumento.
     * @param dataConferencia Nova data da conferência.
     */

    public void setDataConferencia(Data dataConferencia) {
        this.dataConferencia = dataConferencia;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método <u>abstrato</u> que calcula o fator de impacto do artigo de conferencias.</b>
     * @return "A", "B" ou "C"
     */

    @Override
    public String fatorImpacto() {
        if (this.dimensaoAudiencia < 200){
            return "C";
        }
        else if (this.dimensaoAudiencia < 500){
            return "B";
        }
        else if (this.dimensaoAudiencia > 500){
            return "A";
        }
        else{
            return "Dimensão inválida";
        }
    }

    /**
     * <b>Método que escreve as informações do artigo de conferências.</b>
     * @return String com as informações do artigo de conferências.
     */

    @Override
    public String toString() {
        return super.toString()
                + "\nNome da conferência: " + nomeConferencia
                + " | Localização da conferência: " + localizacaoConferencia
                + " | Data da conferência: " + dataConferencia;
    }
}
