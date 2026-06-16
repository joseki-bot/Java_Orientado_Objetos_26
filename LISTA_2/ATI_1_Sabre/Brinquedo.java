package LISTA.LISTA_2.ATI_1_Sabre;

import java.util.Scanner;

public class Brinquedo {
    public static void main(String[] args) throws InterruptedException {
    boolean Estado;
    Scanner scN = new Scanner(System.in);
    Scanner scL = new Scanner(System.in);
    
        System.out.println("Qual a cor que você deseja no Sabre ?");
        System.out.print("=> ");
            String cor = scL.nextLine();
        
        System.out.println("Deseja que ele tenha som ? (s/n)");
        System.out.print("=> ");
            String Barulho = scL.nextLine();
        
        if (Barulho.equals("s")) {
            Estado = true;
        }
        else {
            Estado = false;
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         
    SabreDeLuzBrinquedo SABRE = new SabreDeLuzBrinquedo(cor, Estado, false);
    
        SABRE.Status();
        
    System.out.println("Deseja ligar o Sabre ? (s/n)");
    System.out.print("=> ");
        String Escolha =scL.nextLine().toLowerCase();
        
    switch (Escolha) {
        case "s", "sim", "yes", "y" -> {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            SABRE.Ligar();
            break;
        }
        case "n", "não", "no", "nao" -> {
            break;
        }
    }
    }
}
