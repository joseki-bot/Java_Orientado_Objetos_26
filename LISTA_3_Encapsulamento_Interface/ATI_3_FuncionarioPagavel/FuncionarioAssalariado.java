package LISTA.LISTA_3_Encapsulamento_Interface.ATI_3_FuncionarioPagavel;
/*
3 - Funcionário com Interface Pagavel: 
Crie uma interface Pagavel com o método calcularPagamento(). 
Implemente essa interface em classes como FuncionarioHorista e FuncionarioAssalariado.
*/
public class FuncionarioAssalariado implements Pagavel {

private String Funcionario;
private double Salario;

    public FuncionarioAssalariado(String Funcionario, double Salario) {
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
        double SalANO = Salario * 12;
        
        System.out.println("O Funcionario " +Funcionario);
        System.out.println("Receber R$ " +Salario+ " Por Mês");
        
        System.out.println("\nE em um ano ele vai receber");
        System.out.println("R$ " +SalANO);
    }
    
}
