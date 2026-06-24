package LISTA.LISTA_4_Polimorfismo.ATI_5_Processador_Video;

import java.util.Scanner;

/*
Exercício 5: Processador de Vídeo
Objetivo: Processar um arquivo de vídeo de maneiras diferentes 
sem alterar o sistema principal.

    Crie uma classe mãe abstrata chamada ProcessadorVideo com o método 
abstrato processar(String nomeArquivo).

    Crie três classes filhas: ProcessadorAltaDefinicao, ProcessadorMobile e 
ProcessadorApenasAudio.

    No método processar() de cada classe, imprima mensagens simulando o trabalho 
específico. Ex: O ProcessadorMobile deve imprimir 
"Comprimindo vídeo para poupar dados móveis: " + nomeArquivo.

    Na classe principal, use o Scanner para pedir o nome do arquivo de vídeo.

    Peça ao usuário para escolher o tipo de processamento desejado 
através de um menu.

    Utilizando o conceito de polimorfismo, inicie o 
processamento com o objeto adequado.
*/
public class Main {
    public static void main(String[] args) {
    Scanner scL = new Scanner (System.in);
    Scanner scN  = new Scanner (System.in);
    ProcessadorVideo CPU = null;
    
        System.out.println("===============");
        System.out.println("=== ARQUIVO ===");
        System.out.println("===============");
        System.out.println("\nDiga o do Arquivo que você deseja abrir");
        System.out.print("=> ");
            String Nome = scL.nextLine();
    
        System.out.println("\n\n=================");
        System.out.println("== PROCESSADOR ==");
        System.out.println("==================");
        System.out.println("\n1. Processador de Alta Qualidade");        
        System.out.println("2. Processador de Celular");        
        System.out.println("3. Sem Processador");
        System.out.println("\nDiga qual é o seu Processador");        
        System.out.print("=> ");
            int Escolha = scN.nextInt();
            
        switch (Escolha) {
            case 1 -> {
                CPU = new ProcessadorAltaDefinicao();
                break;
            }
            case 2 -> {
                CPU = new ProcessadorMobile();
                break;
            }
            case 3 -> {
                CPU = new ProcessadorApenasAudio();
                break;
            }
        }
        CPU.processar(Nome);
    }
}