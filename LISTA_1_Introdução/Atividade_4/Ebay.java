package LISTA_1_Introdução.Atividade_4;

import java.util.Scanner;

public class Ebay {
    public static void main(String[] args) {
    FUNCIONARIOS func = new FUNCIONARIOS();
    Scanner scL = new Scanner(System.in);
    Scanner scN = new Scanner(System.in);
    
    System.out.println("Informe o nome do Funcionario");
    System.out.print("=> ");
        func.Nome = scL.nextLine();
        
    System.out.println("Fale qual é o Departamento que ele atua");
    System.out.print("=> ");
        func.Departamento = scL.nextLine();
        
    System.out.println("Fale quantos Porcento ele vai recemer de Aumento");
    System.out.print("=> ");
        func.Aumento = scN.nextInt();
    
    double valorAumento = func.Salario * (func.Aumento / 100.0);
    func.NVsalario = func.Salario + valorAumento;
    
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    
    func.Aumento_Salario();
    }
}
