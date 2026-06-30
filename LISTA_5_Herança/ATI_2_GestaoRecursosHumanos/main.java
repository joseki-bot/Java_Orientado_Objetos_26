
package LISTA.LISTA_5_Herança.ATI_2_GestaoRecursosHumanos;

import java.util.Random;
import java.util.Scanner;

/*
Exercício 2: Gestão de Recursos Humanos (Folha de Pagamento): 
Empresas de tecnologia possuem diferentes cargos, e a forma de calcular o 
salário final varia de acordo com os benefícios de cada um.

    Crie uma superclasse chamada Funcionario com os atributos nome (Texto) 
e salarioBase (Decimal). Crie um método calcularSalario() que apenas retorna 
o salário base.

    Crie uma subclasse Desenvolvedor que herda de Funcionario. 
Adicione o atributo bonusPorProjeto (Decimal). Sobrescreva o método 
calcularSalario() para retornar o salário base somado ao bônus.

    Na classe Principal, use o Scanner para perguntar o nome do desenvolvedor
seu salário base e qual o valor do bônus que ele recebeu no mês.
Imprima o resumo do pagamento chamando o método calcularSalario().
*/
public class main {
    public static void main(String[] args) {
    Scanner scL = new Scanner (System.in);
    Scanner scN = new Scanner (System.in);
    
        System.out.println("==============");
        System.out.println("===== RH =====");
        System.out.println("==============\n");
        System.out.println("Por Favor informe o seu Nome");
        System.out.print("=> ");
            String Nome = scL.nextLine();
            
        System.out.println("\nAgora informe o seu Sálario Base");
        System.out.print("=> ");
            double SaB = scN.nextDouble();
            
        System.out.println("\nInforme o seu Bônus por Projeto");
        System.out.print("=> ");
            double Bônus = scN.nextDouble();
            
        Desenvolvedor Dev = new Desenvolvedor(Bônus, Nome, SaB);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        Dev.CalcularSalario();
    
    
        
        
        
        
    }
}
