package LISTA.LISTA_3_Encapsulamento_Interface.ATI_8_SistemaReservaHotel;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
    Scanner scL = new Scanner(System.in);
    Scanner scN = new Scanner(System.in);

        String[] quartos = {
            "Quarto Standard", "Quarto Luxo", "Suite" };

        double[] precos = {
            180.00, 350.00, 650.00 };

        System.out.println("==============================");
        for (int i = 0; i < quartos.length; i++) {
            System.out.println((i + 1) + " - " + quartos[i]);
        }

        System.out.println("==============================");
        System.out.println("\nEscolha um quarto: ");
        System.out.print("=> ");
            int op = scN.nextInt();

        switch (op) {
            case 1 -> {
                QuartoStandard quarto = new QuartoStandard(quartos[0], precos[0]);
                quarto.reservar();
                break;
            }
            case 2 -> {
                QuartoLuxo quarto = new QuartoLuxo(quartos[1], precos[1]);
                quarto.reservar();
                break;
            }
            case 3 -> {
                Suite quarto = new Suite(quartos[2], precos[2]);
                quarto.reservar();
                break;
            }
            default -> {
                System.out.println("Opção inválida!");
                break;
            }
        }
    }
}