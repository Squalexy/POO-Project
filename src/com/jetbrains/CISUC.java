package com.jetbrains;

import java.io.*;
import java.util.*;


/**
 * <b>Classe que gera todos os métodos principais ao funcionamento do programa</b>.
 * <p>
 * A classe lê os ficheiros de entrada, gera os ficheiros de saída e gera o conteúdo das arrays dos grupos de
 * investigação, investigadores e publicações.
 * </p>
 * <p>
 * O programa funciona de forma a que adicione primeiro os investigadores do CISUC e só depois adicione as publicações.
 * Dessa forma, associo aos publicações que vou adicionando aos investigadores, que já se encontram no array de
 * investigadores do CISUC.
 * </p>
 */

public class CISUC {

    /**
     * Foram criados 6 objetos das classes de cada grupo de investigação, de forma a aceder aos seus atributos de forma
     * mais direta; e foi criado 1 objeto {@linkplain #grupos} da classe {@linkplain GrupoInvestigacao}, que equivale
     * a considerar a classe {@linkplain CISUC} como um grupo de investigação (para efeitos de enunciado das alíneas 1
     * e 5 apenas).
     * <p>
     * <u>As funções das alíneas 1 e 5 recebem objetos da classe {@linkplain GrupoInvestigacao} como argumentos.</u>
     * </p>
     * <p>
     * No caso da alínea 1, as funções recebem como argumento o objeto {@linkplain #grupos} da classe GrupoInvestigacao, uma vez que
     * queremos apresentar os dados gerais do CISUC. Para esse efeito é que foi criado esse objeto.
     * </p>
     * <p>
     * No caso da alínea 5, recebo como argumento cada objeto de cada classe associada ao grupo de investigação
     * pretendido, uma vez que pretendo apresentar os dados de cada grupo de uma vez.
     * </p>
     */

    ArrayList<GrupoInvestigacao> gruposInvestigacao;
    ArrayList<Investigador> investigadores;
    ArrayList<Publicacao> publicacoes;
    GrupoInvestigacao grupos;
    AC ac;
    IS is;
    CMS cms;
    ECOS ecos;
    LCT lct;
    SSE sse;

    //---------------------------------------------------CONSTRUTOR---------------------------------------------------//

    /**
     * Construtor da classe {@linkplain CISUC}.
     */

    public CISUC() {
        this.gruposInvestigacao = new ArrayList<>();
        this.investigadores = new ArrayList<>();
        this.publicacoes = new ArrayList<>();
        this.grupos = new GrupoInvestigacao();
        this.ac = new AC();
        this.is = new IS();
        this.cms = new CMS();
        this.ecos = new ECOS();
        this.lct = new LCT();
        this.sse = new SSE();

    }

    //--------------------------------------------------GETS & SETS---------------------------------------------------//

    /**
     * Método get que devolve o array de grupos de investigação do CISUC.
     *
     * @return Lista dos grupos de investigação.
     */

    public ArrayList<GrupoInvestigacao> getGruposInvestigacao() {
        return gruposInvestigacao;
    }

    /**
     * Método get que devolve o array de investigadores do CISUC.
     *
     * @return Lista dos investigadores.
     */

    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    /**
     * Método get que devolve o array de publicações do CISUC.
     *
     * @return Lista dos grupos de investigação.
     */

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    /**
     * Método get que devolve o grupo de investigação equivalente ao CISUC, contendo os mesmos arrays que a classe {@linkplain #CISUC}.
     *
     * @return "Grupo de investigação" CISUC.
     */

    public GrupoInvestigacao getGrupos() {
        return grupos;
    }

    /**
     * Método get que devolve a classe {@linkplain AC}
     *
     * @return Classe {@linkplain AC}
     */

    public AC getAc() {
        return ac;
    }

    /**
     * Método get que devolve a classe {@linkplain IS}
     *
     * @return Classe {@linkplain IS}
     */

    public IS getIs() {
        return is;
    }

    /**
     * Método get que devolve a classe {@linkplain CMS}
     *
     * @return Classe {@linkplain CMS}
     */

    public CMS getCms() {
        return cms;
    }

    /**
     * Método get que devolve a classe {@linkplain ECOS}
     *
     * @return Classe {@linkplain ECOS}
     */

    public ECOS getEcos() {
        return ecos;
    }

    /**
     * Método get que devolve a classe {@linkplain LCT}
     *
     * @return Classe {@linkplain LCT}
     */

    public LCT getLct() {
        return lct;
    }

    /**
     * Método get que devolve a classe {@linkplain SSE}
     *
     * @return Classe {@linkplain SSE}
     */

    public SSE getSse() {
        return sse;
    }

    /**
     * Método set que subtitui o atual array de grupos de investigação por outro array dado como argumento.
     *
     * @param gruposInvestigacao Lista de grupos de investigação.
     */

    public void setGruposInvestigacao(ArrayList<GrupoInvestigacao> gruposInvestigacao) {
        this.gruposInvestigacao = gruposInvestigacao;
    }

    /**
     * Método set que subtitui o atual array de investigadores por outro array dado como argumento.
     *
     * @param investigadores Lista de investigadores.
     */

    public void setInvestigadores(ArrayList<Investigador> investigadores) {
        this.investigadores = investigadores;
    }

    /**
     * Método set que subtitui o atual array de publicações por outro array dado como argumento.
     *
     * @param publicacoes Lista de publicações.
     */

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    /**
     * Método set que subtitui o atual "grupo de investigação" CISUC por outro grupo dado como argumento.
     *
     * @param grupos "grupo de investigação" CISUC.
     */

    public void setGrupos(GrupoInvestigacao grupos) {
        this.grupos = grupos;
    }

    /**
     * Método set que subtitui o atual grupo de investigação AC por outro grupo dado como argumento.
     *
     * @param ac Grupo de investigação AC.
     */

    public void setAc(AC ac) {
        this.ac = ac;
    }

    /**
     * Método set que subtitui o atual grupo de investigação IS por outro grupo dado como argumento.
     *
     * @param is Grupo de investigação IS.
     */

    public void setIs(IS is) {
        this.is = is;
    }

    /**
     * Método set que subtitui o atual grupo de investigação CMS por outro grupo dado como argumento.
     *
     * @param cms Grupo de investigação CMS.
     */

    public void setCms(CMS cms) {
        this.cms = cms;
    }

    /**
     * Método set que subtitui o atual grupo de investigação ECOS por outro grupo dado como argumento.
     *
     * @param ecos Grupo de investigação ECOS.
     */

    public void setEcos(ECOS ecos) {
        this.ecos = ecos;
    }

    /**
     * Método set que subtitui o atual grupo de investigação LCT por outro grupo dado como argumento.
     *
     * @param lct Grupo de investigação LCT.
     */

    public void setLct(LCT lct) {
        this.lct = lct;
    }

    /**
     * Método set que subtitui o atual grupo de investigação SSE por outro grupo dado como argumento.
     *
     * @param sse Grupo de investigação SSE.
     */

    public void setSse(SSE sse) {
        this.sse = sse;
    }

    //----------------------------------------------------MÉTODOS-----------------------------------------------------//

    /**
     * <b>Método que cria os atributos de um objeto da classe Investigador.</b>
     * <p>
     * Os atributos são relativos ao investigador da linha de Investigadores.txt que percorremos.
     * É chamado no método txtInvestigToProject duas vezes e foi criado de forma a não repetir código.
     * </p>
     *
     * @param inv Objeto ao qual adiciono os atributos.
     * @param res Array de atributos do investigador de cada linha do txt.
     */

    public void addAtributosToInvestigador(Investigador inv, String[] res) {
        if (res[0].matches(".*\\d.*")) {
            System.out.println("Nome do investigador " + res[0] + " inválido!\n");
            System.exit(0);
        }
        inv.setNome(res[0]);
        if (!res[1].contains("@")) {
            System.out.println("Email inválido do investigador " + res[0] + "\n");
            System.exit(0);
        }
        inv.setEmail(res[1]);
        if (!res[2].equals("AC") && !res[2].equals("LCT") && !res[2].equals("SSE") && !res[2].equals("ECOS") && !res[2].equals("CMS") && !res[2].equals("IS")) {
            System.out.println("Grupo de investigação inválido do investigador " + res[0] + "\n");
            System.exit(0);
        }
        inv.setGrupoInvestigacao(res[2]);
    }

    /**
     * <b>Método que adiciona uma publicação ao array de publicações de um autor.</b>
     * <p>
     * Percorre o array de investigadores do CISUC e, se encontrar o(s) nome(s) do(s) autor(es) dado(s) como argumento
     * do método, adiciona a publicação, também dada como argumento, ao array de publicações do investigador.
     * </p>
     *
     * @param autores Nome de cada investigador.
     * @param publ    Publicação que quero adicionar ao array de cada investigador.
     */

    public void addPublToInvestigador(String[] autores, Publicacao publ) {
        for (Investigador investigador : this.getInvestigadores()) {
            for (String autor : autores) {
                if (investigador.getNome().equals(autor)) {
                    investigador.getPublicacoes().add(publ);
                }
            }
        }
    }

    /**
     * <b>Método que adiciona <u>todas</u> as publicações a cada grupo de investigação indicado.</b>
     * <p>
     * Percorre cada investigador do array de {@linkplain #investigadores}, percorre cada publicação do array de {@linkplain
     * #publicacoes} do investigador e adiciona-a ao array de publicações do grupo de investigação do respetivo investigador.
     * </p>
     */

    public void addPublicacoesToGrupos() {
        for (Investigador investigador : this.getInvestigadores()) {
            for (Publicacao publicacao : investigador.getPublicacoes()) {
                addPublToGrupo(new String[]{investigador.getNome()}, publicacao);
            }
        }
    }

    /**
     * <b>Método que adiciona as publicações de um autor ao grupo do CISUC a que este autor pertence.</b>
     * <p>
     * Percorre o array de investigadores do CISUC e, se encontrar o(s) nome(s) do(s) autor(es) dado(s) como argumento,
     * adiciona a publicação, também dada como argumento, ao array de publicações do grupo CISUC a que o autor pertence.
     * </p>
     * Verifica se a publicação não existe já no grupo no caso de existirem dois autores pertencentes ao mesmo grupo do
     * CISUC e serem coautores da mesma publicação.
     *
     * @param autores Nome de cada investigador.
     * @param publ    Publicação que quero adicionar ao array de cada investigador.
     */

    public void addPublToGrupo(String[] autores, Publicacao publ) {

        for (Investigador investigador : this.getInvestigadores()) {
            for (String autor : autores) {
                if (investigador.getNome().equals(autor)) {

                    switch (investigador.getGrupoInvestigacao()) {

                        case "AC" -> {
                            if (!this.getAc().getPublicacoes().contains(publ)) this.getAc().getPublicacoes().add(publ);
                        }
                        case "IS" -> {
                            if (!this.getIs().getPublicacoes().contains(publ)) this.getIs().getPublicacoes().add(publ);
                        }
                        case "SSE" -> {
                            if (!this.getSse().getPublicacoes().contains(publ))
                                this.getSse().getPublicacoes().add(publ);
                        }
                        case "CMS" -> {
                            if (!this.getCms().getPublicacoes().contains(publ))
                                this.getCms().getPublicacoes().add(publ);
                        }
                        case "ECOS" -> {
                            if (!this.getEcos().getPublicacoes().contains(publ))
                                this.getEcos().getPublicacoes().add(publ);
                        }
                        case "LCT" -> {
                            if (!this.getLct().getPublicacoes().contains(publ))
                                this.getLct().getPublicacoes().add(publ);
                        }
                        default -> {
                            System.out.println("Grupo não encontrado");
                            return;
                        }
                    }
                }
            }
        }
    }

    /**
     * <b>Método que cria os atributos de uma publicação</b>.
     * <p>
     * Os atributos são relativos à publicação da linha de Publicacoes.txt que percorremos.
     * É chamado no método txtPublicToProject para cada tipo de publicação que pretendo adicionar e foi criado de forma
     * a não repetir código.
     * </p>
     *
     * @param publ A publicação onde vão ser criados os atributos.
     * @param res  Array de atributos de cada publicação da linha do txt.
     * @param inv  Investigador que adiciono ao array de autores da publicação.
     */

    public void addAttributesToPublicacao(Publicacao publ, String[] res, Investigador inv) {
        publ.getAutores().add(inv);
        publ.setTitulo(res[1]);
        publ.setResumo(res[2]);
        publ.setPalavrasChave(res[3]);
        if (!res[4].matches(".*\\d.*")){
            System.out.println("Ano de publicação inválida para a publicação " + res[1] + ".\n");
            System.exit(0);
        }
        publ.setAnoPublicacao(Integer.parseInt(res[4]));
        if (res[5].matches(".*\\d.*")){
            System.out.println("Tipo de publicação inválida para a publicação " + res[1] + ".\n");
            System.exit(0);
        }
        publ.setTipoPublicacao(res[5]);
        if (!res[6].matches(".*\\d.*")){
            System.out.println("Tipo de publicação inválida para a publicação " + res[1] + ".\n");
            System.exit(0);
        }
        publ.setDimensaoAudiencia(Integer.parseInt(res[6]));
    }

    /**
     * <b>Método que adiciona um investigador ao grupo do CISUC a que pertence.</b>
     * <p>
     * Verifica nos atributos do investigador a que grupo de investigação este pertence e adiciona ao array de
     * investigadores da classe desse grupo.
     * </p>
     * Consoante o investigador seja um membro efetivo ou um estudante, acrescenta à contagem de membros efetivos ou
     * estudantes do grupo de investigação.
     * <p>
     * Para efeitos estatísticos o investigador é também acrescentado ao array grupos da classe GrupoInvestigacao, onde
     * estará a totalidade dos investigadores do CISUC assim como a contagem para cada tipo.
     * </p>
     *
     * @param grupoCisuc   Grupo de investigação a que pertence o investigador.
     * @param investigador Investigador que irei adicionar à classe do grupo a que este pertence.
     */

    public void addSoloInvestigadorToGrupos(GrupoInvestigacao grupoCisuc, Investigador investigador) {
        grupoCisuc.getInvestigadores().add(investigador);
        if (investigador.getCategoria().equals("Estudante")) {
            grupoCisuc.setNumeroEstudantes(grupoCisuc.getNumeroEstudantes() + 1);
            this.getGrupos().setNumeroEstudantes(this.getGrupos().getNumeroEstudantes() + 1);
        } else {
            grupoCisuc.setNumeroMembrosEfetivos(grupoCisuc.getNumeroMembrosEfetivos() + 1);
            this.getGrupos().setNumeroMembrosEfetivos(this.getGrupos().getNumeroMembrosEfetivos() + 1);
        }
    }

    /**
     * <b>Método que adiciona todos os investigadores aos grupos de investigação a que pertencem.</b>
     * <p>
     * Faz uso do método addSoloInvestigadorToGrupos e passa como argumentos o grupo de investigação a que o investigador
     * pertence e o investigador que pretendemos adicionar.</p>
     */

    public void addInvestigadoresToGrupos() {
        for (Investigador investigador : this.getInvestigadores()) {
            switch (investigador.getGrupoInvestigacao()) {
                case "AC" -> addSoloInvestigadorToGrupos(this.getAc(), investigador);
                case "IS" -> addSoloInvestigadorToGrupos(this.getIs(), investigador);
                case "CMS" -> addSoloInvestigadorToGrupos(this.getCms(), investigador);
                case "ECOS" -> addSoloInvestigadorToGrupos(this.getEcos(), investigador);
                case "LCT" -> addSoloInvestigadorToGrupos(this.getLct(), investigador);
                case "SSE" -> addSoloInvestigadorToGrupos(this.getSse(), investigador);
                default -> {
                    System.out.println("Grupo não encontrado");
                    System.exit(0);
                }
            }
        }
    }

    /**
     * <b>Método que adiciona todos os grupos de investigação ao array de grupos de investigação do CISUC.</b>
     */

    public void addGruposToGrupo() {
        this.getGruposInvestigacao().add(this.getAc());
        this.getGruposInvestigacao().add(this.getIs());
        this.getGruposInvestigacao().add(this.getCms());
        this.getGruposInvestigacao().add(this.getEcos());
        this.getGruposInvestigacao().add(this.getLct());
        this.getGruposInvestigacao().add(this.getSse());
    }

    //-------------------------------------------------LER FICHEIROS--------------------------------------------------//

    /**
     * <b>Método que lê o ficheiro txt dos investigadores e cria um objeto da classe Investigador com os atributos lidos no txt.</b>
     * <p>
     * Lê cada linha de Investigadores.txt e transforma cada elemento separado por "," num array de atributos res.
     * </p>
     * <p>
     * Verifica no array se o investigador é Membro Efetivo ou Estudante. Consoante o tipo, cria um objeto da classe
     * desse tipo, adiciona os atributos gerais de um investigador através da função addAtributosToInvestigador e
     * adiciona os restantes atributos consoante o tipo.
     * </p>
     * <p>
     * Existem uma série de proteções para verificar se o email é válido, se o nome não contém números, se a data não
     * contém outros caracteres que não sejam números, etc.
     * </p>
     */

    public void lerTxtInvestigadores() {

        File f = new File("Investigadores.txt");

        if (f.exists() && f.isFile()) {

            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;

                while ((line = br.readLine()) != null) {
                    String[] res = line.split(",");
                    if (res[1].split(" ").length == 1){
                        System.out.println("Nome do investigador incompleto. Necessita de pelo menos dois nomes.");
                        System.exit(0);
                    }
                    if (res[3].equals("Membro Efetivo")) {

                        if (res.length != 6){
                            System.out.println("Atributos em falta. Comprimento do array do Membro Efetivo diferente de 6.\n");
                            System.exit(0);
                        }
                        MembroEfetivo membroEfetivo = new MembroEfetivo();

                        addAtributosToInvestigador(membroEfetivo, res);
                        if (!res[4].matches(".*\\d.*")){
                            System.out.println("Número de gabinete do investigador " + res[0] + " inválido!\n");
                            System.exit(0);
                        }
                        membroEfetivo.setNumeroGabinete(Integer.parseInt(res[4]));
                        if (!res[5].matches(".*\\d.*")){
                            System.out.println( "Número de telefone do DEI do investigador " + res[0] + " inválido!\n");
                        }
                        membroEfetivo.setNumeroTelefoneDEI(Integer.parseInt(res[5]));

                        this.getInvestigadores().add(membroEfetivo);
                        this.getGrupos().getInvestigadores().add(membroEfetivo);

                    } else if (res[3].equals("Estudante")) {

                        if (res.length != 7){
                            System.out.println("Atributos em falta. Comprimento do array do Estudante diferente de 7.\n");
                            System.exit(0);
                        }

                        Estudante estudante = new Estudante();

                        addAtributosToInvestigador(estudante, res);
                        estudante.setTituloTese(res[4]);
                        if (res[5].matches(".*\\d.*")){
                            System.out.println("Nome do investigador orientador do investigador " + res[0] + " inválido!\n");
                            System.exit(0);
                        }
                        estudante.setInvestigadorOrientador(res[5]);
                        Data data = new Data();
                        String[] dataEstudante = res[6].split("/");
                        if (!(dataEstudante.length == 3)){
                            System.out.println("Data de conclusão da tese do investigador " + res[0] + " não está no formato dia/mes/ano.\n");
                        }
                        if (!dataEstudante[0].matches(".*\\d.*") || !dataEstudante[1].matches(".*\\d.*")
                            || !dataEstudante[2].matches(".*\\d.*")){
                            System.out.println("Números da data de conclusão da tese do investigador " + res[0] + " inválidos!\n");
                            System.exit(0);
                        }
                        data.setDia(Integer.parseInt(dataEstudante[0]));
                        data.setMes(Integer.parseInt(dataEstudante[1]));
                        data.setAno(Integer.parseInt(dataEstudante[2]));
                        estudante.setDataConclusao(data);

                        this.getInvestigadores().add(estudante);
                        this.getGrupos().getInvestigadores().add(estudante);

                    } else {
                        System.out.println("Categoria do investigador inválida.\n" );
                        System.exit(0);
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir o ficheiro Investigadores.txt.");
                System.exit(0);
            } catch (IOException ex) {
                System.out.println("Erro a ler o ficheiro Investigadores.txt.");
                System.exit(0);
            }
        } else {
            System.out.println("Ficheiro 'Investigadores.txt' não existe.\nA encerrar o programa...\n");
            System.exit(0);
        }
    }

    /**
     * <b>Método que lê o ficheiro txt das publicações e cria um objeto da classe {@linkplain Publicacao} com os atributos
     * lidos no txt.</b>
     * <p>
     * Lê cada linha de Publicacoes.txt e transforma cada elemento separado por "," num array de atributos res. Também
     * transforma cada autor separado por "+" num array de autores.
     * </p>
     * <p>
     * Verifica no array res o tipo da publicação. Consoante o tipo, cria um objeto da classe desse tipo, adiciona os
     * atributos gerais de uma publicação através da função {@linkplain #addAttributesToPublicacao} e adiciona os restantes atributos
     * consoante o tipo.
     * </p>
     * <p>
     * Para efeitos estatísticos é também acrescentado ao array {@linkplain #publicacoes} do array {@linkplain #grupos}
     * da classe {@linkplain GrupoInvestigacao}, onde constará a totalidade das publicações do CISUC.
     * </p>
     */

    public void lerTxtPublicacoes() {

        File f = new File("Publicacoes.txt");

        if (f.exists() && f.isFile()) {

            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;

                while ((line = br.readLine()) != null) {
                    String[] res = line.split(",");
                    String[] autores = res[0].split("\\+");


                    switch (res[5]) {

                        case "Artigo de conferencia" -> {

                            ArtigoConferencia publ = new ArtigoConferencia();
                            for (Investigador inv : this.getInvestigadores()) {
                                for (String autor : autores) {
                                    if (autor.equals(inv.getNome())) {
                                        addAttributesToPublicacao(publ, res, inv);
                                    }
                                }
                            }

                            publ.setNomeConferencia(res[7]);
                            Data data = new Data();
                            String[] dataConferencia = res[8].split("/");
                            if (!(dataConferencia.length == 3)){
                                System.out.println("Data de conferência do artigo " + res[1] + " não está no formato dia/mes/ano.\n");
                                System.exit(0);
                            }
                            if (!dataConferencia[0].matches(".*\\d.*") || !dataConferencia[1].matches(".*\\d.*")
                                    || !dataConferencia[2].matches(".*\\d.*")){
                                System.out.println("Números da data de conferência do artigo " + res[1] + " inválidos!\n");
                                System.exit(0);
                            }
                            data.setDia(Integer.parseInt(dataConferencia[0]));
                            data.setMes(Integer.parseInt(dataConferencia[1]));
                            data.setAno(Integer.parseInt(dataConferencia[2]));
                            publ.setDataConferencia(data);
                            publ.setLocalizacaoConferencia(res[9]);

                            this.getPublicacoes().add(publ);
                            this.getGrupos().getPublicacoes().add(publ);

                            addPublToInvestigador(autores, publ);
                            addPublToGrupo(autores, publ);

                        }

                        case "Artigo de revista" -> {

                            ArtigoRevista publ = new ArtigoRevista();

                            for (Investigador inv : this.getInvestigadores()) {
                                for (String autor : autores) {
                                    if (autor.equals(inv.getNome())) {
                                        addAttributesToPublicacao(publ, res, inv);
                                    }
                                }
                            }

                            publ.setNomeRevista(res[7]);
                            Data data = new Data();
                            String[] dataRevista = res[8].split("/");
                            if (!(dataRevista.length == 3)){
                                System.out.println("Data da revista " + res[1] + " não está no formato dia/mes/ano");
                            }
                            if (!dataRevista[0].matches(".*\\d.*") || !dataRevista[1].matches(".*\\d.*")
                                    || !dataRevista[2].matches(".*\\d.*")){
                                System.out.println("Números da data da revista " + res[1] + " inválidos!\n");
                                System.exit(0);
                            }
                            data.setDia(Integer.parseInt(dataRevista[0]));
                            data.setMes(Integer.parseInt(dataRevista[1]));
                            data.setAno(Integer.parseInt(dataRevista[2]));
                            publ.setDataRevista(data);
                            if (!res[9].matches(".*\\d.*")){
                                System.out.println("Números inválidos para o nº da revista " + res[1] + "\n.");
                                System.exit(0);
                            }
                            publ.setNumeroRevista(Integer.parseInt(res[9]));

                            this.getPublicacoes().add(publ);
                            this.getGrupos().getPublicacoes().add(publ);

                            addPublToInvestigador(autores, publ);
                            addPublToGrupo(autores, publ);

                        }

                        case "Livro" -> {

                            Livro publ = new Livro();

                            for (Investigador inv : this.getInvestigadores()) {
                                for (String autor : autores) {
                                    if (autor.equals(inv.getNome())) {
                                        addAttributesToPublicacao(publ, res, inv);
                                    }
                                }
                            }

                            publ.setEditora(res[7]);
                            publ.setISBN(res[8]);

                            this.getPublicacoes().add(publ);
                            this.getGrupos().getPublicacoes().add(publ);

                            addPublToInvestigador(autores, publ);
                            addPublToGrupo(autores, publ);

                        }

                        case "Capitulo de livro" -> {

                            CapituloLivro publ = new CapituloLivro();

                            for (Investigador inv : this.getInvestigadores()) {
                                for (String autor : autores) {
                                    if (autor.equals(inv.getNome())) {
                                        addAttributesToPublicacao(publ, res, inv);
                                    }
                                }
                            }

                            publ.setEditora(res[7]);
                            publ.setISBN(res[8]);
                            publ.setNomeCapitulo(res[9]);
                            if (!res[10].matches(".*\\d.*")){
                                System.out.println("Números inválidos para a página inicial do capítulo de livro " + res[1] + ".\n");
                            }
                            publ.setPaginaInicio(Integer.parseInt(res[10]));
                            if (!res[11].matches(".*\\d.*")){
                                System.out.println("Números inválidos para a página inicial do capítulo de livro " + res[1] + ".\n");
                            }
                            publ.setPaginaFim(Integer.parseInt(res[11]));

                            this.getPublicacoes().add(publ);
                            this.getGrupos().getPublicacoes().add(publ);

                            addPublToInvestigador(autores, publ);
                            addPublToGrupo(autores, publ);

                        }

                        case "Livro de artigos de conferencia" -> {

                            ArtigoConferenciaLivro publ = new ArtigoConferenciaLivro();

                            for (Investigador inv : this.getInvestigadores()) {
                                for (String autor : autores) {
                                    if (autor.equals(inv.getNome())) {
                                        addAttributesToPublicacao(publ, res, inv);
                                    }
                                }
                            }

                            publ.setEditora(res[7]);
                            publ.setISBN(res[8]);
                            publ.setNomeConferencia(res[9]);
                            if (!res[10].matches(".*\\d.*")){
                                System.out.println("Números inválidos para o nº de artigos de " + res[1] + ".\n");
                                System.exit(0);
                            }
                            publ.setNumeroArtigos(Integer.parseInt(res[10]));

                            this.getPublicacoes().add(publ);
                            this.getGrupos().getPublicacoes().add(publ);

                            addPublToInvestigador(autores, publ);
                            addPublToGrupo(autores, publ);

                        }

                        default -> {
                            System.out.println("Publicação não encontrada");
                            return;
                        }
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir o ficheiro Publicacoes.txt.");
            } catch (IOException ex) {
                System.out.println("Erro a ler o ficheiro Publicacoes.txt.");
            }

        } else {
            System.out.println("Ficheiro 'Publicacoes.txt' não existe.\nA encerrar o programa...\n");
            System.exit(0);
        }
    }

    /**
     * <b>Método que lê o ficheiro obj dos investigadores e cria os objetos da classe Investigador com os atributos lidos
     * no ficheiro, adicionando ao array {@linkplain #investigadores}.</b>
     * <p>
     * O método apenas funciona após {@linkplain #escreverObjInvestigadores()} ser chamado.
     * </p>
     */

    public void lerObjInvestigadores() {

        File f = new File("Investigadores.obj");

        // Carregar os dados para o array de investigadores do array grupos.
        if (f.exists() && f.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                this.getGrupos().investigadores = (ArrayList<Investigador>) ois.readObject();

                ois.close();
            } catch (FileNotFoundException e) {
                System.out.println("Erro a abrir Investigadores.obj");
            } catch (IOException e) {
                System.out.println("Erro a ler Investigadores.obj");
            } catch (ClassNotFoundException e) {
                System.out.println("Erro a converter o objeto");
            }
        } else {
            System.out.println("Ficheiro 'Investigadores.obj' não existe.\nA encerrar o programa...\n");
            System.exit(0);
        }

        // Carregar os dados para o array de investigadores do CISUC.
        if (f.exists() && f.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                investigadores = (ArrayList<Investigador>) ois.readObject();

                ois.close();
            } catch (FileNotFoundException e) {
                System.out.println("Erro a abrir Investigadores.obj");
            } catch (IOException e) {
                System.out.println("Erro a ler Investigadores.obj");
            } catch (ClassNotFoundException e) {
                System.out.println("Erro a converter o objeto");
            }
        } else {
            System.out.println("Ficheiro 'Investigadores.obj' não existe.\nA encerrar o programa...\n");
            System.exit(0);
        }
    }

    /**
     * <b>Método que lê o ficheiro obj das publicações e cria os objetos da classe Publicacao com os atributos lidos
     * no ficheiro, adicionando ao array {@linkplain #publicacoes}.</b>
     * <p>
     * O método apenas funciona após {@linkplain #escreverObjPublicacoes()} ()} ser chamado.
     * </p>
     */

    public void lerObjPublicacoes() {

        File f = new File("Publicacoes.obj");

        // Carregar os dados para o array de publicações do array grupos.
        if (f.exists() && f.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                this.getGrupos().publicacoes = (ArrayList<Publicacao>) ois.readObject();

                ois.close();
            } catch (FileNotFoundException e) {
                System.out.println("Erro a abrir Publicacoes.obj");
            } catch (IOException e) {
                System.out.println("Erro a ler Publicacoes.obj");
            } catch (ClassNotFoundException e) {
                System.out.println("Erro a converter o objeto");
            }
        } else {
            System.out.println("Ficheiro 'Publicacoes.obj' não existe.\nA encerrar o programa...\n");
            System.exit(0);
        }

        // Carregar os dados para o array de publicações do CISUC.
        if (f.exists() && f.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                publicacoes = (ArrayList<Publicacao>) ois.readObject();

                ois.close();
            } catch (FileNotFoundException e) {
                System.out.println("Erro a abrir Publicacoes.obj");
            } catch (IOException e) {
                System.out.println("Erro a ler Publicacoes.obj");
            } catch (ClassNotFoundException e) {
                System.out.println("Erro a converter o objeto");
            }
        } else {
            System.out.println("Ficheiro 'Publicacoes.obj' não existe.\nA encerrar o programa...\n");
            System.exit(0);
        }

    }

    //-----------------------------------------------ESCREVER FICHEIROS-----------------------------------------------//

    /**
     * <b>Método que cria o ficheiro Investigadores.obj relativo aos investigadores.</b>
     */

    public void escreverObjInvestigadores() {

        File f = new File("Investigadores.obj");

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(investigadores);
            oos.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Erro a criar Investigadores.obj.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Erro a escrever para Investigadores.obj.");
            ex.printStackTrace();
        }
    }

    /**
     * <b>Método que cria o ficheiro Publicacoes.obj relativo às publicações.</b>
     */

    public void escreverObjPublicacoes() {


        File f = new File("Publicacoes.obj");

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(publicacoes);
            oos.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Erro a criar Publicacoes.obj.");
        } catch (IOException ex) {
            System.out.println("Erro a escrever para Publicacoes.obj.");
        }
    }

    //----------------------------------------------------ALINEA 1----------------------------------------------------//

    /**
     * <b>1a) Método que apresenta no ecrã o número total de membros.</b>
     *
     * @param grupo O array que percorre para obter os dados.
     */

    public void totalMembros(GrupoInvestigacao grupo) {
        System.out.println("Total de membros: " + grupo.getInvestigadores().size());
    }

    /**
     * <b>1b) Método que apresenta no ecrã o número de membros de cada tipo.</b>
     * <p>
     * Percorre o array de {@linkplain #investigadores} do array {@linkplain #grupos} para obter os dados.
     * </p>
     *
     * @param grupo O array que percorre para obter os dados.
     */

    public void totalMembrosCadaCategoria(GrupoInvestigacao grupo) {
        int nEfetivos = 0;
        int nEstudantes = 0;
        for (Investigador investigador : grupo.getInvestigadores()) {
            if (investigador.getCategoria().equals("Membro Efetivo")) {
                nEfetivos++;
            } else if (investigador.getCategoria().equals("Estudante")) {
                nEstudantes++;
            }
        }
        System.out.println("Membros Efetivos: " + nEfetivos + "\nEstudantes: " + nEstudantes);
    }

    /**
     * <b>1c) Método que apresenta no ecrã, sem ordenamento, as publicações dos últimos cinco anos.</b>
     * <p>
     * Percorre cada publicação do array {@linkplain #publicacoes} do array {@linkplain #grupos} e verifica se o ano
     * de publicação é maior que 2015.
     * </p>
     * <p>
     * A variável nPublicacoes incrementa cada vez que se verificar a condição anterior de forma a mostrar a quantidade.
     * </p>
     *
     * @param grupo O array que percorre para obter os dados.
     */

    public void publicacoesUltimosCincoAnos(GrupoInvestigacao grupo) {
        int nPublicacoes = 0;
        for (Publicacao publ : grupo.getPublicacoes()) {
            if (publ.getAnoPublicacao() > 2015) {
                nPublicacoes++;
            }
        }
        System.out.println("Nº de publicações dos últimos 5 anos: " + nPublicacoes);
    }

    /**
     * <b>1d) Método que apresenta no ecrã o número de publicações de cada tipo.</b>
     * <p>
     * Ao percorrer o array verifica o {@linkplain Publicacao#tipoPublicacao tipo de publicação} da {@linkplain Publicacao publicação}
     * e incrementa a contagem desse número de publicações. Também existe um contador para as publicações com menos de
     * 5 anos. Mostra no ecrã esses dados.
     * </p>
     *
     * @param grupo O array que percorre para obter os dados.
     */

    public void publicacoesCadaTipo(GrupoInvestigacao grupo) {
        int nAConf, nARevista, nLivros, nCapLivro, nLivroArtigos, nAConf2015, nARevista2015,
                nLivros2015, nCapLivro2015, nLivroArtigos2015;
        nAConf = nARevista = nLivros = nCapLivro = nLivroArtigos = nAConf2015 = nARevista2015 =
                nLivros2015 = nCapLivro2015 = nLivroArtigos2015 = 0;

        for (Publicacao publicacao : grupo.getPublicacoes()) {

            switch (publicacao.getTipoPublicacao()) {
                case "Artigo de conferencia" -> {
                    nAConf++;
                    if (publicacao.getAnoPublicacao() > 2015) nAConf2015++;
                }
                case "Artigo de revista" -> {
                    nARevista++;
                    if (publicacao.getAnoPublicacao() > 2015) nARevista2015++;
                }
                case "Livro" -> {
                    nLivros++;
                    if (publicacao.getAnoPublicacao() > 2015) nLivros2015++;
                }
                case "Capitulo de livro" -> {
                    nCapLivro++;
                    if (publicacao.getAnoPublicacao() > 2015) nCapLivro2015++;
                }
                case "Livro de artigos de conferencia" -> {
                    nLivroArtigos++;
                    if (publicacao.getAnoPublicacao() > 2015) nLivroArtigos2015++;
                }
                default -> {
                    System.out.println("Erro. Publicação não encontrada");
                    return;
                }
            }
        }
        System.out.println(">>Número de publicações (ano de publicação > 2015) em (total)<<\n");
        System.out.println("Artigos de conferência: " + nAConf2015 + " em " + nAConf
                + "\nArtigos de revista: " + nARevista2015 + " em " + nARevista
                + "\nLivros: " + nLivros2015 + " em " + nLivros
                + "\nCaptiulos de livro: " + nCapLivro2015 + " em " + nCapLivro
                + "\nLivros de artigos de conferencia: " + nLivroArtigos2015 + " em " + nLivroArtigos + "\n");
    }


    //----------------------------------------------------ALINEA 2----------------------------------------------------//

    /**
     * <b>2) Método que lista as publicações de <u>um</u> grupo de investigação, dos últimos 5 anos, organizadas por ano, por tipo
     * de publicação e por fator de impacto.</b>
     * <p>
     * É feito o ordenamento das publicações através do método {@linkplain java.util.ArrayList#sort(Comparator) sort}
     * e da interface {@linkplain Comparator}.
     * </p>
     *
     * @param nomeGrupo Nome do grupo de investigação cujas publicações pretendo apresentar.
     */

    public void publUltimosCincoOrganizadas(String nomeGrupo) {
        System.out.println("\n---------------------");
        System.out.println("| PUBLICAÇÕES DE " + nomeGrupo + " |");
        System.out.println("---------------------\n");
        for (GrupoInvestigacao grupo : this.getGruposInvestigacao()) {

            if (grupo.getAcronimo().equals(nomeGrupo)) {

                grupo.getPublicacoes().sort(
                        Comparator.comparingInt(Publicacao::getAnoPublicacao).thenComparing(Publicacao::getTipoPublicacao)
                                .thenComparing(Publicacao::fatorImpacto));

                for (int i = 0; i < grupo.getPublicacoes().size(); i++) {
                    if (grupo.getPublicacoes().get(i).getAnoPublicacao() > 2015) {
                        System.out.println(grupo.getPublicacoes().get(i));
                        System.out.println();
                    }
                }
            }
        }
    }


    //----------------------------------------------------ALINEA 3----------------------------------------------------//

    /**
     * <b>3) Método que lista os membros de um grupo de investigação agrupados por categoria.</b>
     * <p>
     * Percorre cada {@linkplain GrupoInvestigacao grupo de investigação} no array {@linkplain #gruposInvestigacao} à
     * procura do grupo cujo acrónimo é dado como argumento. Verifica os membros de cada categoria e mostra-os no ecrã.
     * </p>
     *
     * @param acronimoGrupo Acrónimo do grupo cujos dados prentede-se apresentar.
     */

    public void membrosGrupoPorCategoria(String acronimoGrupo) {
        for (GrupoInvestigacao grupo : getGruposInvestigacao()) {
            if (grupo.getAcronimo().equals(acronimoGrupo)) {
                System.out.println("\n--------------------");
                System.out.println("| Membros Efetivos |");
                System.out.println("--------------------");
                for (Investigador membroEfetivo : grupo.getInvestigadores()) {
                    if (membroEfetivo.getCategoria().equals("Membro Efetivo")) {
                        System.out.println(membroEfetivo);
                    }
                }
                System.out.println("\n--------------");
                System.out.println("| Estudantes |");
                System.out.println("--------------");
                for (Investigador estudante : grupo.getInvestigadores()) {
                    if (estudante.getCategoria().equals("Estudante")) {
                        System.out.println(estudante);
                    }
                }
            }
        }
    }

    //----------------------------------------------------ALINEA 4----------------------------------------------------//

    /**
     * <b>4) Método que lista as publicações de um investigador agrupadas por ano, tipo de publicação e fator de impacto.</b>
     * <p>
     * Percorre o array de {@linkplain #investigadores} à procura do nome do investigador dado como argumento e ordena
     * as suas {@linkplain Investigador publicacoes}, mostrando-as, por fim, no ecrã.
     * </p>
     *
     * @param nomeInvestigador Nome do investigador cujas publicações prentendemos apresentar.
     */

    public void publicacoesInvestigador(String nomeInvestigador) {
        System.out.println();
        for (Investigador inv : getInvestigadores()) {
            if (inv.getNome().equals(nomeInvestigador)) {
                inv.getPublicacoes().sort(
                        Comparator.comparingInt(Publicacao::getAnoPublicacao).thenComparing(Publicacao::getTipoPublicacao)
                                .thenComparing(Publicacao::fatorImpacto));

                for (int i = 0; i < inv.getPublicacoes().size(); i++) {
                    if (inv.getPublicacoes().get(i).getAnoPublicacao() > 2015) {

                        // Quando chegar à ultima publicação, acaba
                        if (i == inv.getPublicacoes().size()) break;

                        if (i == 0 || inv.getPublicacoes().get(i).getAnoPublicacao() != inv.getPublicacoes().get(i - 1).getAnoPublicacao()) {
                            System.out.println("---------------------------");
                            System.out.println("| ANO DE PUBLICAÇÃO: " + inv.getPublicacoes().get(i).getAnoPublicacao() + " |");
                            System.out.println("---------------------------");
                            System.out.println("-----> TIPO DE PUBLICAÇÃO: " + inv.getPublicacoes().get(i).getTipoPublicacao());
                            System.out.println("--------> FATOR DE IMPACTO: " + inv.getPublicacoes().get(i).fatorImpacto());
                            System.out.println("\n" + inv.getPublicacoes().get(i) + "\n");
                            continue;
                        }

                        if (!inv.getPublicacoes().get(i).getTipoPublicacao().equals(inv.getPublicacoes().get(i - 1).getTipoPublicacao())) {
                            System.out.println("-----> TIPO DE PUBLICAÇÃO: " + inv.getPublicacoes().get(i).getTipoPublicacao());
                            System.out.println("--------> FATOR DE IMPACTO: " + inv.getPublicacoes().get(i).fatorImpacto());
                            System.out.println("\n" + inv.getPublicacoes().get(i) + "\n");
                            continue;
                        }

                        if (!inv.getPublicacoes().get(i).fatorImpacto().equals(inv.getPublicacoes().get(i - 1).fatorImpacto())) {
                            System.out.println("-----> TIPO DE PUBLICAÇÃO: " + inv.getPublicacoes().get(i).fatorImpacto());
                            System.out.println("\n" + inv.getPublicacoes().get(i) + "\n");
                        }
                    }

                }
            }
        }
    }

    //----------------------------------------------------ALINEA 5----------------------------------------------------//

    /**
     * <b>Método que mostra o nº de publicações agrupadas por ano, tipo e fator de impacto.</b>
     * <p>
     * Compara sempre a atual publicação com a anterior através do ano de publicação, do tipo e do fator de impacto.
     * Se as 3 características forem sempre iguais, o nº de publicações incrementa. Caso contrário, volta a 1.
     * </p>
     *
     * @param acronimoGrupo Acrónimo do grupo que vou percorrer.
     */

    public void numPublUltimosCincoOrganizadas(String acronimoGrupo) {

        System.out.println();
        for (GrupoInvestigacao grupo : this.getGruposInvestigacao()) {

            if (grupo.getAcronimo().equals(acronimoGrupo)) {

                grupo.getPublicacoes().sort(
                        Comparator.comparingInt(Publicacao::getAnoPublicacao).thenComparing(Publicacao::getTipoPublicacao)
                                .thenComparing(Publicacao::fatorImpacto));

                int numPubl = 1;

                for (int i = 0; i < grupo.getPublicacoes().size(); i++) {
                    if (grupo.getPublicacoes().get(i).getAnoPublicacao() > 2015) {

                        if (i == 0 || grupo.getPublicacoes().get(i).getAnoPublicacao() != grupo.getPublicacoes().get(i - 1).getAnoPublicacao()) {
                            System.out.println("---------------------------");
                            System.out.println("| ANO DE PUBLICAÇÃO: " + grupo.getPublicacoes().get(i).getAnoPublicacao() + " |");
                            System.out.println("---------------------------");
                            System.out.println("-----> TIPO DE PUBLICAÇÃO: " + grupo.getPublicacoes().get(i).getTipoPublicacao());
                            System.out.println("--------> FATOR DE IMPACTO: " + grupo.getPublicacoes().get(i).fatorImpacto());
                            System.out.println(">>>>>>>>>>>> Nº de publicações: " + numPubl);
                            numPubl = 1;
                            continue;
                        }

                        if (!grupo.getPublicacoes().get(i).getTipoPublicacao().equals(grupo.getPublicacoes().get(i - 1).getTipoPublicacao())) {
                            System.out.println("-----> TIPO DE PUBLICAÇÃO: " + grupo.getPublicacoes().get(i).getTipoPublicacao());
                            System.out.println("--------> FATOR DE IMPACTO: " + grupo.getPublicacoes().get(i).fatorImpacto());
                            System.out.println(">>>>>>>>>>>> Nº de publicações: " + numPubl);
                            numPubl = 1;
                            continue;
                        }

                        if (!grupo.getPublicacoes().get(i).fatorImpacto().equals(grupo.getPublicacoes().get(i - 1).fatorImpacto())) {
                            System.out.println("-------->  FATOR DE IMPACTO: " + grupo.getPublicacoes().get(i).fatorImpacto());
                            System.out.println(">>>>>>>>>>>> Nº de publicações: " + numPubl);
                            numPubl = 1;
                        } else {
                            numPubl++;
                        }
                    }

                }
            }
        }
    }

    /**
     * <b>5) Método que lista todos os grupos de investigação e apresenta, para cada grupo:</b>
     * <p>
     * 5a) nº total de membros
     * </p>
     * <p>
     * 5b) nº de membros de cada categoria
     * </p>
     * <p>
     * 5c) total de publicações dos últimos 5 anos
     * </p>
     * <p>
     * 5d) nº de publicações, dos últimos 5 anos, agrupadas por ano, tipo de publicação e fator de impacto.
     * </p>
     * <p>
     * Faz uso de todos os métodos usados na alínea 1), de forma a evitar repetição de código.
     * <p>
     * Lista dos métodos: {@linkplain #totalMembros}, {@linkplain #totalMembrosCadaCategoria}, {@linkplain #publicacoesUltimosCincoAnos}
     * e {@linkplain #publUltimosCincoOrganizadas}.
     * </p>
     */

    public void listagemGruposInvestigacao() {
        for (GrupoInvestigacao grupo : getGruposInvestigacao()) {
            System.out.println("\n***** " + grupo.getAcronimo() + " *****\n");
            totalMembros(grupo);
            System.out.println("---------------");
            totalMembrosCadaCategoria(grupo);
            System.out.println("---------------");
            publicacoesUltimosCincoAnos(grupo);
            numPublUltimosCincoOrganizadas(grupo.getAcronimo());
            System.out.println("\n");
        }
    }
}
