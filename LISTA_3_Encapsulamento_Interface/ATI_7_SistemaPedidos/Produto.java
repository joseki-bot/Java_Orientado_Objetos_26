package LISTA.LISTA_3_Encapsulamento_Interface.ATI_7_SistemaPedidos;
/*
7 - Sistema de Pedidos Online:
Crie uma interface Produto com os métodos obterNome(),
obterPreco() e adicionarAoCarrinho(CarrinhoCompras carrinho).
*/

public interface Produto {

    public abstract String obterNome();
    public abstract double obterPreco();

    public abstract void adicionarAoCarrinho(CarrinhoCompras carrinho);

}