package LISTA.LISTA_3_Encapsulamento_Interface.ATI_7_SistemaPedidos;

public class Carrinho implements CarrinhoCompras{

    private Produto[] produtos = new Produto[10];
    private int quantidade = 0;

    @Override
    public void adicionarProduto(Produto produto) {

        produtos[quantidade] = produto;
        quantidade++;

        System.out.println("\nProduto adicionado ao carrinho!");
    }

    public void listarProdutos(){

        double total = 0;

        System.out.println("\n======= CARRINHO =======");

        for(int i = 0; i < quantidade; i++){

            System.out.println(produtos[i].obterNome()
                    +" - R$ "+produtos[i].obterPreco());

            total += produtos[i].obterPreco();

        }

        System.out.println("------------------------");
        System.out.println("TOTAL: R$ "+total);
    }
}