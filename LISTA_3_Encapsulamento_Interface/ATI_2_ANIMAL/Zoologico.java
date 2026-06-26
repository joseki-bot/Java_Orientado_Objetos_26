package LISTA.LISTA_3_Encapsulamento_Interface.ATI_2_ANIMAL;

import java.util.Random;

public class Zoologico implements Animal{
Random ale = new Random(); // 8 animais
int sorte = ale.nextInt(8);

String Bicho;

String[] animais = {
    "Zebra",
    "Pavão",
    "Elefante",
    "Rinoceronte",
    "Paca",
    "Cachorro",
    "Gato",
    "Pássaro"
};

    public Zoologico() {
        this.Bicho = animais[sorte];
    }
    
    @Override
    public void EmitirSom() {
        System.out.println(sorte+ " | " +Bicho);
        switch (sorte) {
            case 0 -> { // Zebra
                System.out.println("iih-rrr");
                break;
            }
            case 1 -> { // Pavão
                System.out.println("mé-ó");
                break;
            }
            case 2 -> { // Elefante
                System.out.println("prruuu");
                break;
            }
            case 3 -> { // Rinoceronte
                System.out.println("grunf");
                break;
            }
            case 4 -> { // Paca
                System.out.println("quic-quic");
                break;
            }
            case 5 -> { // Cachorro
                System.out.println("Auh-Auh");
                break;
            }
            case 6 -> { // Gato
                System.out.println("Miau");
                break;
            }
            case 7 -> { // Pássaro
                System.out.println("Piu-Piu");
                break;
            }
        }
    }
}
