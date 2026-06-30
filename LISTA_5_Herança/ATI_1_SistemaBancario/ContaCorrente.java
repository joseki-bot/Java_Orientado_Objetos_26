package LISTA.LISTA_5_Herança.ATI_1_SistemaBancario;
/*
Exercício 1: Sistema Bancário (Fintechs): 
Aplicativos de banco oferecem diferentes tipos de contas para os clientes. 
Vamos simular as operações básicas de saque e depósito.

    Crie uma superclasse chamada ContaBancaria com os atributos numeroConta 
(Texto) e saldo (Decimal). Crie os métodos depositar(valor) e sacar(valor). 
O saque normal só deve ocorrer se houver saldo suficiente.

    Crie uma subclasse ContaCorrente que herda de ContaBancaria. Adicione o 
atributo limiteChequeEspecial (Decimal). Modifique (sobrescreva) o 
método sacar(valor) para que o cliente possa sacar até o valor do saldo somado 
ao limite do cheque especial.

    Na classe Principal, use o Scanner para pedir ao usuário o número da conta e
os valores que ele deseja depositar e, em seguida, sacar. Teste a regra do 
cheque especial.
*/ 
public class ContaCorrente extends ContaBancaria {

    protected double LimiteChequeEspecial;

    public ContaCorrente(String NumeroConta, double LimiteChequeEspecial, double Saldo) {
        super(NumeroConta, Saldo);
        this.LimiteChequeEspecial = LimiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return LimiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double LimiteChequeEspecial) {
        this.LimiteChequeEspecial = LimiteChequeEspecial;
    }

    public void VerSaldo() {
        System.out.println("================");
        System.out.printf("Saldo: R$ %.2f\n", Saldo);
        System.out.println("================");
    }

    @Override
    public void Sacar(double Valor) {

        if (Valor <= (Saldo + LimiteChequeEspecial)) {

            Saldo -= Valor;

            System.out.printf("Você sacou R$ %.2f\n", Valor);

            if (Saldo < 0) {
                System.out.printf("Cheque Especial Utilizado: R$ %.2f\n", Math.abs(Saldo));
            }

        } else {

            System.out.println("Saldo + Cheque Especial insuficientes!");

        }
    }
}