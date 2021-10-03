package com.jetbrains;

/**
 * <b>Classe do tipo "Artigo de revista" descendente da classe "Publicacao".</b>
 */

public class ArtigoRevista extends Publicacao{

    private String nomeRevista;
    private Data dataRevista;
    private int numeroRevista;

    //--------------------------------------------------CONSTRUTORES--------------------------------------------------//

    /**
     * Construtor da classe {@linkplain #ArtigoRevista}.
     */

    public ArtigoRevista(){
        this.tipoPublicacao = "Artigo de revista";
    }

    /**
     * Construtor da classe {@linkplain #ArtigoRevista}.
     * @param nomeRevista Nome da revista do artigo de revista.
     * @param dataRevista Data da revista do artigo de revista.
     * @param numeroRevista Número da revista do artigo de revista..
     */

    public ArtigoRevista(String nomeRevista, Data dataRevista, int numeroRevista) {
        this.nomeRevista = nomeRevista;
        this.dataRevista = dataRevista;
        this.numeroRevista = numeroRevista;
    }

    /**
     * Construtor da classe {@linkplain #ArtigoRevista}.
     * @param titulo Título do artigo de revista.
     * @param palavrasChave Palavras-chave do artigo de revista.
     * @param resumo Resumo do artigo de revista.
     * @param anoPublicacao Ano de publicação do artigo de revista.
     * @param dimensaoAudiencia Dimensão da audiência do artigo de revista.
     * @param nomeRevista Nome da revista do artigo de revista.
     * @param dataRevista Data da revista do artigo de revista.
     * @param numeroRevista Número da revista do artigo de revista.
     */

    public ArtigoRevista(String titulo, String palavrasChave, String resumo, int anoPublicacao, int dimensaoAudiencia, String nomeRevista, Data dataRevista, int numeroRevista) {
        super(titulo, palavrasChave, resumo, anoPublicacao, dimensaoAudiencia);
        this.nomeRevista = nomeRevista;
        this.dataRevista = dataRevista;
        this.numeroRevista = numeroRevista;
    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que devolve o nome da revista.
     * @return Nome da revista.
     */

    public String getNomeRevista() {
        return nomeRevista;
    }

    /**
     * Método get que devolve a data da revista.
     * @return Data da revista.
     */

    public Data getDataRevista() {
        return dataRevista;
    }

    /**
     * Método get que devolve o número da revista.
     * @return Número da revista.
     */

    public int getNumeroRevista() {
        return numeroRevista;
    }

    /**
     * Método set que substitui o nome da revista pelo nome dado como argumento.
     * @param nomeRevista Novo nome da revista.
     */

    public void setNomeRevista(String nomeRevista) {
        this.nomeRevista = nomeRevista;
    }

    /**
     * Método set que substitui a data da revista pela data dada como argumento.
     * @param dataRevista Nova data da revista.
     */

    public void setDataRevista(Data dataRevista) {
        this.dataRevista = dataRevista;
    }

    /**
     * Método set que substitui o número da revista pelo número dado como argumento.
     * @param numeroRevista Novo número da revista.
     */

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método <u>abstrato</u> que calcula o fator de impacto do artigo de revista.</b>
     * @return "A", "B" ou "C"
     */

    @Override
    public String fatorImpacto() {
        if (this.dimensaoAudiencia < 500){
            return "C";
        }
        else if (this.dimensaoAudiencia < 1000){
            return "B";
        }
        else if (this.dimensaoAudiencia > 1000){
            return "A";
        }
        else{
            return "Dimensão inválida";
        }
    }

    /**
     * <b>Método que escreve as informações do artigo de revista.</b>
     * @return String com as informações do artigo de revista.
     */

    @Override
    public String toString() {
        return super.toString()
                +"\nNome da revista: " + nomeRevista
                + " | Data: " + dataRevista
                + " | Nº: " + numeroRevista;
    }
}
