package LISTA_1_Introdução.Atividade_2;

import java.util.Random;

public class ContaBanco {
// 2. Crie uma classe ContaBancaria com os atributos numeroConta (String), saldo (double)
// e titular (String). Crie os métodos depositar(double valor) e sacar(double valor) 
// que atualizam o saldo da conta.    
Random ale = new Random();
    
    
String Numero_Conta;
double Saldo = ale.nextDouble(9999);
String Titular;

void Sacar() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("Olâ " +Titular+ " tem o seguinte valor na Conta");
    System.out.printf("=> R$ %.2f" ,Saldo);
    System.out.println("\n- - - - - - - - - - - - - - - - - - -\n");
    
    System.out.println("Quanto você quer sacar ? ");
}

void Depositar() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("Olâ " +Titular+ " tem o seguinte valor na Conta");
    System.out.printf("=> R$ %.2f" ,Saldo);
    System.out.println("\n- - - - - - - - - - - - - - - - - - -\n");
    
    System.out.println("Quanto você quer Depositar ? ");
}


    
}
