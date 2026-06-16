package LISTA.LISTA_2.ATI_3_Anel;

import java.util.Random;
import java.util.Scanner;

public class Expecialista {
    public static String Base_Anel(){
    Random ale = new Random();  
    int sorte = ale.nextInt(0 ,22);

    String [] Base = // 20 
        {"Ouro", "Prata", "Platina", "Paládio", "Titânio",
        "Tungstênio", "Aço Inoxidável", "Ferro", "Bronze",
        "Latão", "Cobalto", "Nióbio", "Zircônio", "Cobre",
        "Alumínio", "Carboneto de Tungstênio", "Cerâmica",
        "Fibra de Carbono", "Madeira", "Resina", "Bernado"};
    
    String Anel = Base[sorte];
    return Anel;
    }
    
    public static void main(String[] args) throws InterruptedException {
    Random ale = new Random();    
    Scanner scN = new Scanner(System.in);
    Scanner scL = new Scanner(System.in);
    int Tamanho = ale.nextInt(26);
    ReplicaAnelUnico ANEL = new ReplicaAnelUnico(Base_Anel(), Tamanho, false);
    
        System.out.println("Você acha um Anel de " +Base_Anel());
            Thread.sleep(1500);
    
        System.out.println("\n\n- - - - - - - - - - - - - - - -" +Tamanho);
        System.out.println("Oque você quer fazer com ele\n");
        
        System.out.println("1 -> Colocar");
        System.out.println("2 -> Ignorar");
        System.out.println("3 -> Jogar no Fogo");
        System.out.print("\n=> ");
            int escolha = scN.nextInt();
        
        System.out.println("\n\n\n\n\n\n\n\n\n");
        switch (escolha) {
            case 1 -> {
                System.out.println("Você tenra colocar o Anel");
                ANEL.getTamanhoAro();
                break;
            }
            case 2 -> {
                System.out.println("Você o ignora, deixar para lá");
                System.out.println("Pois devido ele ser feito de " +Base_Anel());
                System.out.println("Provavelmente ele já tem um Dono");
                break;
            }
            case 3 -> {
                ANEL.jogarNoFogo();
                break;
            }
            default -> {
                System.out.println("Você não sabe oque fazer");
                System.out.println("E por ficar tanto tempo parado você é atropelado por uma carroça");
            }
        }
    }
}
