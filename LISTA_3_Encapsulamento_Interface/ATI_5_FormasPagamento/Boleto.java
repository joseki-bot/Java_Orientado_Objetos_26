package LISTA.LISTA_3_Encapsulamento_Interface.ATI_5_FormasPagamento;

/*
5 - Formas de Pagamento: 
Crie uma interface FormaPagamento com o método efetuarPagamento(double valor). 
Implemente essa interface em classes como CartaoCredito, Boleto e Dinheiro.
*/
public class Boleto implements FormaPagamento{
    private String Item;

    public Boleto (String Item) {
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
        double desc = valor * 0.05;
        double ValorFinal = valor + desc;
        System.out.println("Produto: " +Item);
        System.out.println("\nValor: " +valor);
        System.out.println("Forma de Pagamento: Boleto (+5%)");
        System.out.printf("Desconto: %.2f" ,desc);
        System.out.print(" (Boleto possui juros)");
        System.out.printf("\nVALOR FINAL: R$ %.2f\n" ,ValorFinal);
    }
}