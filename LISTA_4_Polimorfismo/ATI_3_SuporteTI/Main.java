package LISTA.LISTA_4_Polimorfismo.ATI_3_SuporteTI;

import java.util.Scanner;

/*
Exercício 3: Triagem de Suporte de TI (Helpdesk)
Objetivo: Encaminhar um chamado de suporte para a equipe correta.

    Crie uma classe mãe abstrata chamada TratamentoChamado com o método 
abstrato encaminhar(String descricaoProblema).

    Crie três classes filhas: SuporteHardware, SuporteRede e SuporteSoftware.

    Implemente o método encaminhar() em cada filha. O SuporteHardware deve 
imprimir "Enviando técnico fisicamente para avaliar: " + descricaoProblema, 
e assim por diante para as outras equipes.

    Na classe principal, use o Scanner para pedir que o usuário 
descreva o seu problema.

    Peça para o usuário selecionar a categoria do problema 
(1 - Hardware, 2 - Rede, 3 - Software).

    Use o polimorfismo para instanciar a equipe correta e chame o método encaminhar().
*/
public class Main {
    public static void main(String[] args) {
    Scanner scL = new Scanner (System.in);
    Scanner scN = new Scanner (System.in);
    TratamentoChamado sosTI = null;
    
        System.out.println("============================");
        System.out.println("== Central de Ajuda da TI ==");
        System.out.println("============================");
        System.out.println("\nPor Favor, diga de qual área é o seu Problema");
        System.out.println("1. Hardware");
        System.out.println("2. Rede");
        System.out.println("3. Software");
        System.out.print("\n=> ");
            int Escolha = scN.nextInt();
            
        System.out.println("\n=============================");
        System.out.println("==  Descrição do Problema  ==");
        System.out.print("\n=>");
            String Desc = scL.nextLine();
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        switch (Escolha) {
            case 1 -> { // Hardware
                sosTI = new SuporteHardware(Desc);
                break;
            }
            case 2 -> { // Rede
                sosTI = new SuporteRede(Desc);
                break;
            }
            case 3 -> { //Software
                sosTI = new SuporteSoftware(Desc);
                break;
            }
        }
        sosTI.encaminhar();
    
    
    
    
    
    
    
    
    }
    
}
