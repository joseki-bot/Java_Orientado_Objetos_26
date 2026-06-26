package LISTA.LISTA_3_Encapsulamento_Interface.ATI_1_Conta_Bancária;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Scanner scN = new Scanner (System.in);
    ContaCorrente CONTA = new ContaCorrente();
    
    int Finalizador = 0;
        
    do {  
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("= = = = = = = =");
        System.out.println("= = CONTA = =");
        System.out.println("1- Ver Saldo");
        System.out.println("2- Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- SAIR");
        System.out.print("\n=> ");
            int Escolha = scN.nextInt();

    switch (Escolha) {
        case 1 -> {
            System.out.println("\n\n\n\n");
            System.out.println("Você tem o seguinte valor na conta");
            CONTA.Saldo();
            break;
        }
        case 2 -> {
            System.out.println("\n\n\n\n\n");
            System.out.println("Informe o valor que deseja depositar");
            System.out.print("=> ");
                double DEP = scN.nextDouble();
            CONTA.setValorDepositado(DEP);
            CONTA.Depositar();
            break;
        }
        case 3 -> {
            System.out.println("\n\n\n\n\n\n");
            System.out.println("Informe o valor que deseja Sacar");
            System.out.print("=> ");
                double SCR = scN.nextDouble();
            CONTA.setValorSacar(SCR);
            CONTA.Sacar();
            break;
        }
        case 4 -> {
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("SAINDO");
            Finalizador = 1;
            break;
        }
        default -> {
            System.out.println("SAINDO");
            Finalizador = 1;
            break;
        }
    }
    Thread.sleep(2069);
    } while (Finalizador != 1);
    }
}
