package LISTA_1_Introdução.Atividade_5;

import LISTA_1_Introdução.Atividade_5.LIVRO;
import java.util.Random;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
    LIVRO liv = new LIVRO();
    Scanner scN = new Scanner(System.in);
    Scanner scL = new Scanner(System.in); 
    Random ale = new Random();

    
        System.out.println("Diga o Titulo do Livro");
        System.out.print("=> ");
        liv.Titulo = scL.nextLine();
            
        System.out.println("\nDiga o Nome do Autor");
        System.out.print("=> ");
        liv.Autor = scL.nextLine();
        
        System.out.println("\nDiga o Ano de Lançamento");
        System.out.print("=> ");
        liv.Ano_Publicação = scN.nextInt();
        
        
        int Sorte = ale.nextInt(1, 3);
        System.out.println(Sorte);
        if (Sorte == 2) {
            liv.Devolver();
        }
        else {
            liv.Emprestar();
        }
    }
}
