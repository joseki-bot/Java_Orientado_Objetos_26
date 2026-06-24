package LISTA.LISTA_4_Polimorfismo.ATI_1_Logs;

import java.util.Scanner;

/*
Exercício 1: Sistema de Logs de Auditoria
Objetivo: Criar um simulador de registo de atividades do sistema.

    Crie uma classe mãe abstrata chamada RegistradorLog. Ela deve ter um método 
abstrato gravar(String acao).

    Crie três classes filhas: LogEmArquivo, LogEmBancoDeDados e LogNaNuvem.

    Em cada classe filha, implemente o método gravar() para imprimir uma mensagem 
na tela simulando o salvamento (ex: "Salvando em Arquivo de Texto: " + acao).

    Na classe principal (com main), use o Scanner para pedir ao usuário que 
digite uma ação (ex: "Fatura apagada").

    Peça ao usuário para escolher o destino do log 
(1 - Arquivo, 2 - Banco de Dados, 3 - Nuvem).

    Instancie a classe correta em uma variável do tipo RegistradorLog e 
chame o método gravar() (polimorfismo).
*/
public class Main {
    public static void main(String[] args) {
    RegistradorLog RegLOG = null;
    Scanner scL = new Scanner (System.in);
    Scanner scN = new Scanner (System.in);
    
        System.out.println("============================");
        System.out.println("== Onde você quer acessar ==");
        System.out.println("============================");
        System.out.println("1. Arquivo");
        System.out.println("2. Banco de Dados");
        System.out.println("3. Nuvem");
        System.out.print("\n=> ");
            int escola = scN.nextInt();
            
        System.out.println("Oque você quer fazer");
        System.out.print("=> ");
            String ACAO = scL.nextLine();
            
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        switch (escola) {
            case 1 -> { // Arquivo
                LogEmArquivo AR = new LogEmArquivo(ACAO);
                AR.gravar();
                break;
            }
            case 2 -> { // Banco de Dados
                LogEmBancoDeDados BD = new LogEmBancoDeDados(ACAO);
                BD.gravar();
                break;
            }
            case 3 -> { // Nuvem
                LogNaNuvem NM = new LogNaNuvem(ACAO);
                break;
            }
        }
    }
}