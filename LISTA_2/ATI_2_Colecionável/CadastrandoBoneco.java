package LISTA.LISTA_2.ATI_2_Colecionável;

import java.util.Random;
import java.util.Scanner;

public class CadastrandoBoneco {
    public static void main(String[] args) throws InterruptedException {
    Scanner scN = new Scanner(System.in);
    Scanner scL = new Scanner(System.in);
    Random ale = new Random();
    
        System.out.println("Diga a Franquia desse Boneco");
        System.out.print("=> ");
            String Nome = scL.nextLine();
        
        System.out.println("\nQual o Tamanho dele (EM Centrimetros)");
        System.out.print("=> ");
            double tamanho = scN.nextDouble();
        
        System.out.println("\nAgora Precisamos que você tire uma Foto");
        System.out.println("Para ser feita uma Analise da Pintura");
        System.out.println("\n\nVocê tira a Foto e Envia");
            Thread.sleep(1500);
        System.out.println("\n\n\nInciando a Analise");
            Thread.sleep(1000);
         
        String ponto = ".";
        for (int i = 0; i < 15; i++) {
            System.out.println("Processando" +ponto);
                Thread.sleep(469);
            ponto = ponto + ".";
            if (ponto.length() >= 4) {
                ponto = "";
            }
            for (int j = 0; j < 20; j++) {
                System.out.println("\n\n\n");
            }
        }
        int pintura = ale.nextInt(111);
        System.out.println("Analize finalizada !");
        ActionFigure AF = new ActionFigure(Nome, tamanho, pintura);
            Thread.sleep(1569);
        
        System.out.println("\n\n- - - - - - - - - - - - - - - -");
        AF.Mostrar();
    }
}