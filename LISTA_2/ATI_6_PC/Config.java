package LISTA.LISTA_2.ATI_6_PC;

import java.util.Scanner;

public class Config {
    public static void main(String[] args) {
    Scanner scL = new Scanner (System.in);
    Scanner scN = new Scanner (System.in);

        System.out.println("Infomer o seu Processador");
        System.out.print("=> ");
            String  PRO = scL.nextLine();
            
        System.out.println("Diga quantos Gigas é a Sua Memória RAM");
        System.out.print("=> ");
            int GB = scN.nextInt();
            
        System.out.println("Você quer os Led Ligados (s/n)");
            String LED = scL.nextLine();
        
        boolean Ligar;
        if (LED.equalsIgnoreCase("n")) {
            Ligar = false;
        }
        else {
           Ligar = true;
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        PCGamer pc = new PCGamer(PRO, GB, Ligar);
        
        pc.setProcessador(PRO);
        pc.setMemoriaRAM(GB);
        pc.setRgbLigado(Ligar);
        
        pc.ativarModoOverclock();
    }
}
