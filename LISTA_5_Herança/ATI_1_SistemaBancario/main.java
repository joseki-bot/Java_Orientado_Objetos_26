package LISTA.LISTA_5_Herança.ATI_1_SistemaBancario;

import java.util.Random;
import java.util.Scanner;

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
public class main {

    public static void Espaco() {
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
    Scanner scL = new Scanner(System.in);
    Scanner scN = new Scanner(System.in);
    Random ale = new Random();
    double ValorSaldo = ale.nextDouble(100, 6970);
    boolean Finalizador = false;
    
        System.out.println("=================");
        System.out.println("===== BANCO =====");
        System.out.println("=================");
        System.out.println("\nInforme o número da conta");
        System.out.print("=> ");
            String NumConta = scL.nextLine();

        ContaCorrente CC = new ContaCorrente(NumConta, 5000, ValorSaldo);

do {
    Espaco();

    System.out.println("=================");
    System.out.println("===== BANCO =====");
    System.out.println("=================");

    System.out.println("\nO que você deseja fazer?");
    System.out.println("========================");
    System.out.println("1. Ver Saldo");
    System.out.println("2. Depositar");
    System.out.println("3. Sacar");
    System.out.println("4. Sair");
    System.out.print("\n=> ");
        int escolha = scN.nextInt();

    Espaco();
    switch (escolha) {
        case 1 -> {
            CC.VerSaldo();
            break;
        }
        case 2 -> {
            System.out.println("Quanto deseja depositar?");
            System.out.print("=> ");
                double deposito = scN.nextDouble();
            
            CC.Depositar(deposito);
            break;
        }
        case 3 -> {
            System.out.println("Quanto deseja sacar?");
            System.out.print("=> ");
                double saque = scN.nextDouble();

            CC.Sacar(saque);
            break;
        }
        case 4 -> {
            Finalizador = true;
            break;
        }
        default -> {
            System.out.println("Opção inválida!");
            break;
        }
    }
    Thread.sleep(2000);
    
} while (!Finalizador);
    }
}