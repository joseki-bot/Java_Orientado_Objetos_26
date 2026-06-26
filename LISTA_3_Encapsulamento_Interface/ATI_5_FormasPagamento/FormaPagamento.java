package LISTA.LISTA_3_Encapsulamento_Interface.ATI_5_FormasPagamento;

/**
 5 - Formas de Pagamento: 
 * Crie uma interface FormaPagamento com o método efetuarPagamento(double valor). 
 * Implemente essa interface em classes como CartaoCredito, Boleto e Dinheiro.
 */
public interface FormaPagamento {
    public abstract void efetuarPagamento (double valor);
    
}
