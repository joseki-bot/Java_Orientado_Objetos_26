package LISTA_1_Introdução.Atividade_2;

import java.util.Scanner;

public class CONTA_Sacar
{
    public static void main(String[] args) {
ContaBanco conta = new ContaBanco();
Scanner scN = new Scanner(System.in);
Scanner scL = new Scanner(System.in);

    System.out.println("Bem-Vindo");
    System.out.println("Por Favor Informe o seu Nome");
    System.out.print("=> ");
       conta.Titular = scL.nextLine();
        
    conta.Sacar();

        System.out.print("=> ");
            double valor = scN.nextDouble();

        conta.Saldo -= valor;
        
        System.out.println(" - - - - - - - - - - - - - -");
        System.out.printf("\nSALDO ATUAL R$ %.2f" ,conta.Saldo);
        System.out.println("");        
    }
}