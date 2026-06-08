package LISTA_1_Introdução.Atividade_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// 1. Crie uma classe Pessoa com os atributos nome (String), idade (int) e altura (double).
// Crie um método apresentar() que imprima na tela uma mensagem de apresentação
// com o nome, idade e altura da pessoa.   
     
        Locale.setDefault(Locale.US);  // Permite usar Ponto .
        
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        System.out.print("Digite o Nome: ");
            p1.Nome = scL.nextLine();
            
        System.out.print("Digite a idade: ");
            p1.Idade = scN.nextInt();
            
        System.out.print("DIgite a Altura: ");
        p1.Altura = scN.nextDouble();
        
        p1.apresentar();


/*        
//Sem interação - - - - - - - - - - - - - - - - - - - - -
        Pessoa p1 = new Pessoa();
        p1.Nome = "José";
        p1.Idade = 20;
        p1.Altura = 1.80;
        
        p1.apresentar();
*/ 
}
    
}