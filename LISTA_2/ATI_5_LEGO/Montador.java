package LISTA.LISTA_2.ATI_5_LEGO;

import java.util.Random;

public class Montador {
    public static void main(String[] args) throws InterruptedException {
    Random ale = new Random();
    int Sorte = ale.nextInt(1, 3);

        System.out.println("Você está montado o Lego da MiMillennium Falcon");
        System.out.println("E você já está montando ela a 3h");
        System.out.println("E decide ver o seu Progresso contado as Peças");
            Thread.sleep(2000);
        System.out.println("\n\n\n\n\n\n\n\n\n");
        
        MillenniumFalconLego LEGO = new MillenniumFalconLego(0, 0, true);
        int Progresso = ale.nextInt(75101);
        LEGO.PecasMontadas = 75192 - Progresso;
        
        if (Sorte == 1) {
            LEGO.ManualDisponivel = true;
        }
        else {
            LEGO.ManualDisponivel = false;
        }
        LEGO.exibirProgresso();
    }
}
