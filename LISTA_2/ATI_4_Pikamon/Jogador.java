package LISTA.LISTA_2.ATI_4_Pikamon;

import java.util.Random;
import java.util.Scanner;

public class Jogador {
    public static void main(String[] args) {
    Scanner scL = new Scanner (System.in);
    Scanner scN = new Scanner (System.in);
    Random ale = new Random();
    
    int Sorte = ale.nextInt(11);
    
    
        System.out.println("Bem-Vindo");
        System.out.println("Por Favor Nós Informe o Seu nome");
        System.out.print("=> ");
            String NomePlayer = scL.nextLine();
            
        if (Sorte % 2 == 0) {
            System.out.println("\nPor Favor infomer o Nome do Pokémon que deseja");
            System.out.print("=> ");
                String PoNome = scL.nextLine();
            
            System.out.println("Agora diga o Tipo de " +PoNome);
            System.out.print("=> ");
                String PoTipo = scL.nextLine();
                
            int Vida = ale.nextInt(30, 270);
                
            CartaPokemon card = new CartaPokemon(PoNome, PoTipo, Vida);
            
            System.out.println("\n\n\n\n\n\n\n\n");
            System.out.println("- - - - - - - - - - - - - - - -");
            System.out.println("Jogar: " +NomePlayer);
            card.exibirCarta();
            System.out.println("- - - - - - - - - - - - - - - -");
        }   
        else {
            System.out.println("\nVocê Pegou o Pokemon Incial");
            CartaPokemon card = new CartaPokemon();
            
            System.out.println("- - - - - - - - - - - - - - - -");
            card.exibirCarta();
            System.out.println("- - - - - - - - - - - - - - - -");
        }
    }
}
