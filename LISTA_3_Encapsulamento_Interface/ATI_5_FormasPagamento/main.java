package LISTA.LISTA_3_Encapsulamento_Interface.ATI_5_FormasPagamento;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner scN = new Scanner (System.in);
    
    String[] produtos = {
    "Mouse", "Teclado","Monitor",
    "Headset", "Webcam", "Microfone" };
       
    double[] valores = {
    59.90, 129.90, 899.90,
    199.90, 149.90, 249.90 };
    
        System.out.println("====================");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i+1)+ "- " +produtos[i]);
        }
        System.out.println("====================\n");
        System.out.println("Digite o número do item que você deseja");
        System.out.print("=> ");
            int EscPro = scN.nextInt();
    
        System.out.println("\n\n\n=============================");
        System.out.println("Escolha a Forma de Pagamento\n");
        System.out.println("1. Dinheiro");
        System.out.println("2. Cartão de Crédito");
        System.out.println("3. Boleto");
        System.out.println("=============================");
        System.out.print("=> ");
            int Pagamento = scN.nextInt();
            
       switch (Pagamento) { // Dinheiro
           case 1 -> {
               Dinheiro DINDIN = new Dinheiro(produtos[EscPro-1]);
               DINDIN.efetuarPagamento(valores[EscPro-1]);
               break;
           }
           case 2 -> { // Cartão
               CartaoCredito Cartao = new CartaoCredito(produtos[EscPro-1]);
               Cartao.efetuarPagamento(valores[EscPro-1]);
               break;
           }
           case 3 -> { // Boleto
               Boleto BLT = new Boleto(produtos[EscPro-1]);
               BLT.efetuarPagamento(valores[EscPro-1]);
               break;
           }
       }
    }
}