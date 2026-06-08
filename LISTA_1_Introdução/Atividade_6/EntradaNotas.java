package LISTA_1_Introdução.Atividade_6;

import LISTA_1_Introdução.Atividade_5.LIVRO;
import java.util.Scanner;

public class EntradaNotas {

    public static void main(String[] args) {
    ALUNO A = new ALUNO();
    Scanner scN = new Scanner(System.in);
    Scanner scL = new Scanner(System.in); 
    
    System.out.println("Digite o Nome do Aluno");
    System.out.print("=> ");
        A.Nome = scL.nextLine();
        
    System.out.println("\nO Número da Matrículo de " +A.Nome);
        A.Matricula = scN.nextInt();
    
    System.out.println("\nInforme a Nota de " +A.Nome);
    for (int i = 0; i < A.Notas.length; i++) {
        System.out.print((1+i)+ ": ");     
        A.Notas[i] = scN.nextDouble();
    }
    A.CalcularMedia();
    
    }
}
