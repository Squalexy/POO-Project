package com.jetbrains;

import java.io.File;
import java.util.Scanner;

/**
 * <b>Classe que o IDE irá executar para correr o programa principal.</b>
 */

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CISUC cisuc = new CISUC();

        /*
        Verifica se os ficheiros de objeto existem. Se não existirem, lê os ficheiros de texto e carrega o seu conteúdo
        para o programa. Se existirem, é feita a leitura destes e é carregado o seu conteúdo para o programa.
         */

        File invTxt = new File ("Investigadores.txt");
        File pubTxt = new File ("Publicacoes.txt");
        File invObj = new File("Investigadores.obj");
        File pubObj = new File("Publicacoes.obj");

        if (invObj.exists() && invObj.isFile()) {
            System.out.println("Ficheiro 'Investigadores.obj' encontrado!");
            if (pubObj.exists() && pubObj.isFile()) {
                System.out.println("Ficheiro 'Publicacoes.obj' encontrado!\n\nA carregar conteúdo dos ficheiros de objeto...\n");
                cisuc.lerObjInvestigadores();
                cisuc.lerObjPublicacoes();
            }
            else {
                System.out.println("Ficheiro 'Publicacoes.obj' não encontrado!\n\nA carregar conteúdo dos ficheiros de texto...\n");
                cisuc.lerTxtInvestigadores();
                cisuc.lerTxtPublicacoes();
            }

        } else if (invTxt.exists() && invTxt.isFile()){
            if (pubTxt.exists() && pubTxt.isFile()){
                System.out.println("Ficheiro 'Investigadores.obj' não encontrado ou ainda não foi gerado!\n\nA carregar conteúdo dos ficheiros de texto...\n");
                cisuc.lerTxtInvestigadores();
                cisuc.lerTxtPublicacoes();
            }
            else {
                System.out.println("Ficheiro 'Publicacoes.txt' em falta.\n\nA encerrar programa...\n");
                System.exit(0);
            }
        } else {
            System.out.println("Ficheiro 'Investigadores.txt' em falta.\n\nA encerrar programa...\n");
            System.exit(0);
        }

        cisuc.addGruposToGrupo();
        cisuc.addInvestigadoresToGrupos();
        cisuc.addPublicacoesToGrupos();

        System.out.println("Conteúdo carregado com sucesso!\n");

        /*
        Menu de interação com utilizador.
         */

        while (true) {

            System.out.println("Escolha uma opção:");
            System.out.println("1) Apresentar indicadores gerais do CISUC");
            System.out.println("2) Publicações de um grupo de investigação, dos últimos 5 anos, organizadas");
            System.out.println("3) Membros de um grupo de investigação");
            System.out.println("4) Publicações de um investigador");
            System.out.println("5) Membros e publicações de todos os grupos");
            System.out.println("-------------------------------------------");
            System.out.println("0) Sair e guardar dados");

            String choice = sc.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.println("---------------");
                    cisuc.totalMembros(cisuc.getGrupos());
                    System.out.println("---------------");
                    cisuc.totalMembrosCadaCategoria(cisuc.getGrupos());
                    System.out.println("---------------");
                    cisuc.publicacoesUltimosCincoAnos(cisuc.getGrupos());
                    System.out.println("---------------");
                    cisuc.publicacoesCadaTipo(cisuc.getGrupos());
                }
                case "2" -> {
                    System.out.println("Que grupo pretende listar as publicações?\nOpções: AC, IS, SSE, CMS, ECOS, LCT");
                    String grupo1 = sc.nextLine();
                    cisuc.publUltimosCincoOrganizadas(grupo1);
                }
                case "3" -> {
                    System.out.println("Que grupo pretende listar os membros?\nOpções: AC, IS, SSE, CMS, ECOS, LCT");
                    String grupo2 = sc.nextLine();
                    cisuc.membrosGrupoPorCategoria(grupo2);
                }
                case "4" -> {
                    System.out.println("Que investigador pretende mostrar as suas publicações?");
                    String investigador = sc.nextLine();
                    cisuc.publicacoesInvestigador(investigador);
                }
                case "5" -> {
                    cisuc.listagemGruposInvestigacao();
                }
                case "0" -> {
                    cisuc.escreverObjInvestigadores();
                    cisuc.escreverObjPublicacoes();
                    return;
                }
                default -> System.out.println("Opção errada. Escolha um número certo.");
            }
        }
    }
}
