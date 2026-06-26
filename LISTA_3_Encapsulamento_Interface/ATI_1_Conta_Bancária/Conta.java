package LISTA.LISTA_3_Encapsulamento_Interface.ATI_1_Conta_Bancária;
/*
1. Conta Bancária: 
    Crie uma interface Conta com os métodos depositar(double valor) 
e sacar(double valor). Implemente essa interface em uma classe ContaCorrente.
*/
public interface Conta {
    
    public abstract void Depositar();
    public abstract void Sacar();
    public abstract void Saldo();
    
}