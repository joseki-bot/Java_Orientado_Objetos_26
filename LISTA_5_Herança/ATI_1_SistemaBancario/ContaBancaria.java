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
public abstract class ContaBancaria {

    protected String NumeroConta;
    protected double Saldo;

    public ContaBancaria(String NumeroConta, double Saldo) {
        this.NumeroConta = NumeroConta;
        this.Saldo = Saldo;
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void Depositar(double Valor) {
        Saldo += Valor;
        System.out.printf("Você depositou R$ %.2f\n", Valor);
    }

    public void Sacar(double Valor) {
        if (Valor <= Saldo) {
            Saldo -= Valor;
            System.out.printf("Você sacou R$ %.2f\n", Valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

}