package LISTA.LISTA_3_Encapsulamento_Interface.ATI_3_FuncionarioPagavel;

import java.util.Random;
/*
3 - Funcionário com Interface Pagavel: 
Crie uma interface Pagavel com o método calcularPagamento(). 
Implemente essa interface em classes como FuncionarioHorista e FuncionarioAssalariado.
*/
public class FuncionarioHorista implements Pagavel {

private String Funcionario;
private double Salario;

    public FuncionarioHorista(String Funcionario, double Salario) {
        this.Funcionario = Funcionario;
        this.Salario = Salario;
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(String Funcionario) {
        this.Funcionario = Funcionario;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    @Override
    public void CalcularPagamento() {
        double Sal_Dia = Salario * 8;
        double Sal_MES = Sal_Dia * 26;
        double Sal_ANO = Sal_MES * 12;
        
        System.out.println("Funcionario: " +Funcionario);
        System.out.println("Recebe por Hora R$ " +Salario);
        System.out.println("No Dia(8h) : " +Sal_Dia);
        System.out.println("No Mês: " +Sal_MES);
        System.out.println("No Ano: " +Sal_ANO);
    }
}
