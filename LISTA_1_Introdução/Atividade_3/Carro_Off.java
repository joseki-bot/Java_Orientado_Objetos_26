package LISTA_1_Introdução.Atividade_3;

import java.util.Scanner;

public class Carro_Off {
    public static void main(String[] args) {
    Carro Vrum =  new Carro();
    Scanner scL = new Scanner(System.in);
    Scanner scN = new Scanner(System.in);
        
        System.out.println("Diga a Marca do Veiculo");
        System.out.print("=> ");
            Vrum.Marca = scL.nextLine();
            
        System.out.println("\nDiga o Modelo");
        System.out.print("=> ");
            Vrum.Modelo = scL.nextLine();
            
        System.out.println("\nInfome o Ano");
        System.out.print("=> ");
            Vrum.Ano = scN.nextInt();
        
        Vrum.Ligado = false;
        Vrum.Desligado();
    }
    
}
