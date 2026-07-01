package PROVA.BatalhaMonstros;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner scL = new Scanner(System.in);
    Scanner scN = new Scanner(System.in);
        
        
        System.out.println("=======================");
        System.out.println("== CENTRO DE PIKAMON ==");
        System.out.println("=======================\n");
        System.out.println("Qual Pikamon você quer\n");
        System.out.println("1. Charmander");
        System.out.println("2. Squirtle");
        System.out.print("=> ");
            int escolha = scN.nextInt();
        
        System.out.println("\n\n");
        switch(escolha) {
            case 1 -> {
                System.out.println("Você escolheu o Charmander");
                System.out.println("você mandou ele atacar");
                PokemonFogo Pfogo = new PokemonFogo("Charmander");
                Pfogo.Atacar();
                break;
            }
            case 2 -> {
                System.out.println("Você escolheu o Squirtle");
                System.out.println("você mandou ele atacar");
                PokemonAgua Pagua = new PokemonAgua("Squirtle");
                Pagua.Atacar();
                break;
            }
            default -> {
                System.out.println("Você não soube escolher e morreu para um Raio");
            }
        }
    }
}
