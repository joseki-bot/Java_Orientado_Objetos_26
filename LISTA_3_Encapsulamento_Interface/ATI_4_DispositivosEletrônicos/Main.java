package LISTA.LISTA_3_Encapsulamento_Interface.ATI_4_DispositivosEletrônicos;

import java.util.Scanner;

/*
4 - Dispositivos Eletrônicos: 
Crie uma interface DispositivoEletronico com os métodos ligar(), 
desligar() e obterStatus(). Implemente essa interface em classes como 
Televisao, Radio e Celular.
*/
public class Main {
    public static void main(String[] args, String Pro) {
    Scanner scN = new Scanner (System.in);
    Scanner scL = new Scanner (System.in);
        
        System.out.println("Qual aparelho você quer usar\n");
        System.out.println("1 - Televisão");
        System.out.println("2 - Rádio");
        System.out.println("3 - Celular");
        System.out.print("\n=> ");
            int escolha = scN.nextInt();
            
        switch (escolha) {
            case 1 -> { // TV
                Televisao TV =  new Televisao(false, 0, 0, 0);
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Oque você quer fazer com a TV");
                System.out.println("\n1. Ligar");
                System.out.println("2. Desligar");
                System.out.println("3. Olhar oque está passando");
                System.out.print("\n=>");
                    escolha = scN.nextInt();
                    
                System.out.println("\n\n\n");    
                switch (escolha) {
                    case 1 -> {
                        TV.Ligar();
                        break;
                    }
                    case 2 -> {
                        TV.Desligar();
                        break;
                    }
                    case 3 -> {
                        TV.ObterStatus();
                        break;
                    }
                }
            break;
            }
            case 2 -> { // Rádio
                Radio Ra = new Radio(null, 0);
                
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Oque você quer fazer com o Rádio");
                System.out.println("\n1. Ligar");
                System.out.println("2. Desligar");
                System.out.println("3. Olhar oque está passando");
                System.out.print("\n=>");
                    escolha = scN.nextInt();
                    
                System.out.println("\n\n\n");    
                switch (escolha) {
                    case 1 -> {
                        Ra.Ligar();
                        break;
                    }
                    case 2 -> {
                        Ra.Desligar();
                        break;
                    }
                    case 3 -> {
                        Ra.ObterStatus();
                        break;
                    }
                }
                break;
            }
            case 3 -> { // Celular
                Celular Cll = new Celular(false, 0, 0, 0);
                
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Oque você quer fazer com a TV");
                System.out.println("\n1. Ligar");
                System.out.println("2. Desligar");
                System.out.println("3. Olhar oque está passando");
                System.out.print("\n=>");
                    escolha = scN.nextInt();
                    
                System.out.println("\n\n\n");    
                switch (escolha) {
                    case 1 -> {
                        Cll.Ligar();
                        break;
                    }
                    case 2 -> {
                        Cll.Desligar();
                        break;
                    }
                    case 3 -> {
                        Cll.ObterStatus();
                        break;
                    }
                }
                break;
            }
        }
        
    }
}
