package LISTA.LISTA_3_Encapsulamento_Interface.ATI_1_Conta_Bancária;

import java.util.Random;

public class ContaCorrente implements Conta{

    private double ValorConta;
    private double ValorSacar;
    private double ValorDepositado;
    
    public ContaCorrente() {
        Random ale = new Random();
        
        this.ValorConta = ale.nextInt(100, 10001);
    }

    public double getValorSacar() {
        return ValorSacar;
    }

    public void setValorSacar(double ValorSacar) {
        this.ValorSacar = ValorSacar;
    }

    public double getValorDepositado() {
        return ValorDepositado;
    }

    public void setValorDepositado(double ValorDepositado) {
        this.ValorDepositado = ValorDepositado;
    }
    

    @Override
    public void Depositar() {
        System.out.println("Deposito realizado com Sucesso");
        System.out.println("Valor Depositado R$ " +ValorDepositado);
        ValorConta += ValorDepositado;
    }

    @Override
    public void Sacar() {
        if (ValorSacar > ValorConta) {
            System.out.println("Não foi Possivel Sacar");
            System.out.println("O valor de R$ " +ValorSacar);
            System.out.println("É maior doque você tem na conta");
            System.out.println("\n ~~POBRE !!!");
            return;
        }
        else {
            System.out.println("Você sacou R$ " +ValorSacar);
            ValorConta -= ValorSacar;
        }
    }
    
    @Override
    public void Saldo() {
        System.out.println("R$ " +ValorConta);
    }
}
