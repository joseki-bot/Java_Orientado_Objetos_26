package LISTA.LISTA_3_Encapsulamento_Interface.ATI_7_SistemaPedidos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Carrinho carrinho = new Carrinho();

        String[] produtos = {
            "Notebook", "Camiseta", "Arroz",
            "Mouse", "Calça", "Chocolate" };

        double[] precos = { 
            3500, 89.90, 29.90,
            75.50, 150, 12.90 };

        System.out.println("==========================");
        for(int i=0;i<produtos.length;i++){
            System.out.println((i+1)+" - "+produtos[i]);
        }

        System.out.println("==========================");
        System.out.print("Escolha um produto: ");
            int op = sc.nextInt();

        switch(op){
            case 1 ->{
                Eletronico p = new Eletronico(produtos[0],precos[0]);
                p.adicionarAoCarrinho(carrinho);
                break;
            }
            case 2 ->{
                Roupa p = new Roupa(produtos[1],precos[1]);
                p.adicionarAoCarrinho(carrinho);
                break;
            }
            case 3 ->{
                Alimento p = new Alimento(produtos[2],precos[2]);
                p.adicionarAoCarrinho(carrinho);
                break;
            }
            case 4 ->{
                Eletronico p = new Eletronico(produtos[3],precos[3]);
                p.adicionarAoCarrinho(carrinho);
                break;
            }

            case 5 ->{
                Roupa p = new Roupa(produtos[4],precos[4]);
                p.adicionarAoCarrinho(carrinho);
                break;
            }
            case 6 ->{
                Alimento p = new Alimento(produtos[5],precos[5]);
                p.adicionarAoCarrinho(carrinho);
                break;
            }
        }
        carrinho.listarProdutos();
    }
}