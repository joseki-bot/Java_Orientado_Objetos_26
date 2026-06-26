package LISTA.LISTA_3_Encapsulamento_Interface.ATI_3_FuncionarioPagavel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scL = new Scanner(System.in);
    Scanner scN = new Scanner(System.in);
        
        System.out.println("Diga o Nome do Novo funcionario");
        System.out.print("=> ");
            String NomeFun = scL.nextLine();
        
        System.out.println("\nComo vai ser feito o Pagamento de " +NomeFun);
        System.out.println("1. Por Hora");
        System.out.println("2. Por Mês");
        System.out.print("\n=> ");
            int Escolha = scN.nextInt();
            
        switch (Escolha) {
            case 1 -> {
                System.out.println("\nInforme quanto " +NomeFun+ " vai receber por Hora:");
                System.out.print("=> ");
                    double SalHORA = scN.nextInt();
                    
                FuncionarioHorista F_HORA = new FuncionarioHorista(NomeFun, SalHORA);
                F_HORA.CalcularPagamento();
                break;
            }
            case 2 -> {
                System.out.println("\nInforme quanto " +NomeFun+ " vai receber por Mês");
                System.out.print("=> ");
                    double SalMES = scN.nextInt();
                    
                FuncionarioAssalariado F_MES = new FuncionarioAssalariado(NomeFun, SalMES);
                F_MES.CalcularPagamento();
                break;
            }
        }
        
        
        
        
        
    }
    
}
