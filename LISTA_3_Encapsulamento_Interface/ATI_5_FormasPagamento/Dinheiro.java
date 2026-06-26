package LISTA.LISTA_3_Encapsulamento_Interface.ATI_5_FormasPagamento;
/*
5 - Formas de Pagamento: 
Crie uma interface FormaPagamento com o método efetuarPagamento(double valor). 
Implemente essa interface em classes como CartaoCredito, Boleto e Dinheiro.
*/
public class Dinheiro implements FormaPagamento{
    private String Item;

    public Dinheiro(String Item) {
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
        double desc = valor * 0.10;
        double ValorFinal = valor - desc;
        System.out.println("Produto: " +Item);
        System.out.println("\nValor: " +valor);
        System.out.println("Forma de Pagamento: Dinheiro (-10%)");
        System.out.println("Desconto: -" +desc);
        System.out.println("\nVALOR FINAL: R$ " +ValorFinal);
    }
}
