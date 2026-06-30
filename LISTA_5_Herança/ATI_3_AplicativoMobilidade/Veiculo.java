package LISTA.LISTA_5_Herança.ATI_3_AplicativoMobilidade;

import java.util.Scanner;

/*
Exercício 3: Aplicativo de Mobilidade (Tipo Uber / 99): 
Aplicativos de transporte cobram taxas diferentes dependendo da categoria do 
veículo escolhido pelo passageiro.

    Crie uma superclasse chamada Veiculo com os atributos placa (Texto) e 
anoFabricacao (Inteiro). Crie um método calcularTaxaUso() que retorna uma taxa 
base fixa de R$ 10,00.

    Crie uma subclasse CarroVIP que herda de Veiculo. Adicione o atributo 
ofereceAgua (Booleano). Sobrescreva o método calcularTaxaUso() para retornar a 
taxa base do veículo somada a um acréscimo de R$ 15,00. Crie também um método 
exibirBeneficios() que avise se o motorista oferece água.

    Na classe Principal, use o Scanner para pedir a placa do carro e perguntar 
(com Sim ou Não) se o motorista oferece água. Instancie o CarroVIP e exiba o 
 valor final da corrida.
*/
public class Veiculo {
    protected String placa;
    protected int AnoFabricacao;

    public Veiculo(String placa, int AnoFabricacao) {
        this.placa = placa;
        this.AnoFabricacao = AnoFabricacao;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(int AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }
    
    public int CalcularTaxaUso() {
        return 10;
    }
    
    public void ValorCorrida (int Discancia) {
        System.out.println("O valor da corrida é R$ 5,00 por Km");
        System.out.println("Discancia solicitada " +Discancia+ "Km");
        Discancia *= 5;
        
        System.out.println("\nVALOR FINAL R$ " +(Discancia + CalcularTaxaUso()));
    }
    
    
    
}
