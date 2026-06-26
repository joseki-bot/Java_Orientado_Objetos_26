package LISTA.LISTA_3_Encapsulamento_Interface.ATI_5_FormasPagamento;
/*
5 - Formas de Pagamento: 
Crie uma interface FormaPagamento com o método efetuarPagamento(double valor). 
Implemente essa interface em classes como CartaoCredito, Boleto e Dinheiro.
*/
public class CartaoCredito implements FormaPagamento{
    private String Item;

    public CartaoCredito (String Item) {
        this.Item = Item;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }
    
    
    @Override
    public void efetuarPagamento(double valor) {
        // Dinherio tem 10% a menos
        System.out.println("Produto: " +Item);
        System.out.println("\nValor: " +valor);
        System.out.println("Forma de Pagamento: Cartão Credito");
        System.out.println("Desconto: 0");
        System.out.println("\nVALOR FINAL: R$ " +valor);
    }
}