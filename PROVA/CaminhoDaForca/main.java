package PROVA.CaminhoDaForca;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void Espaço(){
        for (int i = 0; i < 15; i++) {
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
    Scanner scL = new Scanner (System.in);
    Scanner scN = new Scanner (System.in);
    Random ale = new Random();
        
        System.out.println("=================");
        System.out.println("== MESTRE JEDI ==");
        System.out.println("=================\n");
        System.out.println("Informe o seu Nome:");
        System.out.print("=> ");
            String nome = scL.nextLine();
            
        System.out.println("\nQual cor você Deseja no Sabre");
        System.out.println("================================");
        System.out.println("1. Verde");
        System.out.println("2. Azul");
        System.out.println("3. Vermelho");
        System.out.println("4. Roxo");
        System.out.println("5. Branco");
        System.out.println("6. Outro");
        System.out.print("\n=> ");
            int escolha = scN.nextInt();
            
        String cor = "";
        switch (escolha) {
            case 1 -> {
                cor = "Verde";
                break;
            }
            case 2 -> {
                cor = "Azul";
                break;
            }
            case 3 -> {
                cor = "Vermelho";
                break;
            }
            case 4 -> {
                cor = "Roxo";
                break;
            }
            case 5 -> {
                cor = "Branco";
                break;
            }
            default -> {
                System.out.println("\nInforme a cor desejada");
                System.out.print("=> ");
                    cor = scL.nextLine();
                break;
            }
        }
        Espaço();
        System.out.println("Agora vamos Calcular o seu nivel de força");
        
        
        String ponto = ".";
        for (int i = 0; i < 15; i++) {
            System.out.print("Calculando");
            System.out.println(ponto);
            ponto = ponto + ".";
            Thread.sleep(569);
            Espaço();
            
            if (ponto.length() >= 4) {
                ponto = "";
            }
        }
        int forca = ale.nextInt(5, 151);
        MestreJedi MJ = new MestreJedi(cor, nome, forca);
        MJ.exibirMestre();
    }
}