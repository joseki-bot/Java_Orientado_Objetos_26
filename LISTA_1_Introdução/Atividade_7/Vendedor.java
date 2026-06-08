package LISTA_1_Introdução.Atividade_7;

import LISTA_1_Introdução.Atividade_6.ALUNO;
import java.util.Random;
import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) throws InterruptedException {
    Produto item = new Produto();
    Scanner scN = new Scanner(System.in);
    Scanner scL = new Scanner(System.in); 
    Random ale = new Random();
    
int finalizador = 0;
        
do {
    System.out.println("\n\n\n\n\n\n\n\n\n\n");
    System.out.println("==============================================");
    int Sorte = ale.nextInt(10);
    item.Nome = item.coisas[Sorte];
    item.Preço = item.valor[Sorte];
    
    item.reporEstoque();
    Thread.sleep(2000);
    System.out.println("\n\nUm cliente deseja comprar " +item.Nome);
    System.out.println("Você quer vender o Item ?");
    System.out.print("=> ");
        String Escolha = scL.nextLine().toLowerCase();
        
    switch (Escolha) {
        case "s", "sim", "yes", "y" -> {
            item.Vender();
            break;
        }
        case "n", "nao", "não", "no" -> {
            System.out.println("\n\nVocê sabe que que esse Cliente sempre fala");
            System.out.println("que o valor é alto, e você não quer ter dor de cabeça");
            break;
        }
    }
    System.out.println("==============================================");
    Thread.sleep(2000);
    finalizador = item.QuantidadeEmEstoque;
}   
while (finalizador != 0);

    System.out.println("\n\nVocê vendeu Todo que tinha");
    System.out.println("E depois de fechar o caixa você arecadou " +item.Saldo);
    
        
    }
    
}
