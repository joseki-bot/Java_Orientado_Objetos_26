package LISTA_1_Introdução.Atividade_4;

import java.util.Random;

public class FUNCIONARIOS {
// 4. Crie uma classe Funcionario com os atributos nome (String), salario (double) 
// e departamento (String). Crie um método aumentarSalario(double percentual) 
// que aumenta o salário do funcionário em um determinado percentual    

Random ale = new Random();
    
String Nome;
double Salario = ale.nextDouble(1618 , 3001);
String Departamento;
int Aumento;
double NVsalario;

void Aumento_Salario() {
    System.out.println("Funcionario: " +Nome);
    System.out.println("Trabalha no Departamento de " +Departamento);
    System.out.println("Aumento de: " +Aumento+ "%");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
    
    System.out.printf("Ele vai sair de R$ %.2f" ,Salario);
    System.out.printf("\nPara R$ %.2f" ,NVsalario);
    System.out.println("");
}

    
}
