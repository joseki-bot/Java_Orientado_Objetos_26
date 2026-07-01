package PROVA.RPG;

import java.util.Random;

public class main {
    public static void Espaço() {
        for (int i = 0; i < 15; i++) {
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws InterruptedException {
    PersonagemRPG P = new PersonagemRPG(null, 0);
    Random ale = new Random();
    int dano;
        
        System.out.println("NOME: " +P.getNome());
        System.out.println("VIDA: " +P.getPontosDeVida());
        System.out.println("\nVocê acha um Golem, e ele começa a te atacar");
            Thread.sleep(2069);
    
    do {
        Espaço();
        dano = ale.nextInt(5,31);
        System.out.println("Você levar " +dano+ " Ponto de Dano\n");
        P.ReceberDano(dano);
        Thread.sleep(869);
        
    }while(P.getPontosDeVida() != 0);
    
        
        
        
    }
}
