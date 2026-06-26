package LISTA.LISTA_3_Encapsulamento_Interface.ATI_7_SistemaPedidos;

public class Eletronico implements Produto{

    private String Nome;
    private double Preco;

    public Eletronico(String Nome, double Preco) {
        this.Nome = Nome;
        this.Preco = Preco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    @Override
    public String obterNome() {
        return Nome;
    }

    @Override
    public double obterPreco() {
        return Preco;
    }

    @Override
    public void adicionarAoCarrinho(CarrinhoCompras carrinho) {

        carrinho.adicionarProduto(this);

    }

}
