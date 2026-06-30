package LISTA.LISTA_5_Herança.ATI_2_GestaoRecursosHumanos;
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

    Na classe Principal, use o Scanner para perguntar o nome do desenvolvedor, 
seu salário base e qual o valor do bônus que ele recebeu no mês. 
Imprima o resumo do pagamento chamando o método calcularSalario().
*/
public abstract class Funcionario {
    protected String Nome;
    protected double SalarioBase;

    public Funcionario(String Nome, double SalarioBase) {
        this.Nome = Nome;
        this.SalarioBase = SalarioBase;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }
    
    
    public void CalcularSalario(){
        System.out.printf("R$ %.2f" ,SalarioBase);
    }
}