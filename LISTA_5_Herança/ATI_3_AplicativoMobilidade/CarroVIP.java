package LISTA.LISTA_5_Herança.ATI_3_AplicativoMobilidade;

import java.util.Random;
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
public class CarroVIP extends Veiculo {
    protected boolean OfereceAgua;

    public CarroVIP(boolean OfereceAgua, String placa, int AnoFabricacao) {
        super(placa, AnoFabricacao);
        this.OfereceAgua = OfereceAgua;
    }

    public boolean getOfereceAgua() {
        return OfereceAgua;
    }

    public void setOfereceAgua(boolean OfereceAgua) {
        this.OfereceAgua = OfereceAgua;
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
        return 15;
    }
    
    public void exibirBeneficios() {
        if (OfereceAgua == true) {
            System.out.println("Esse Motorista Oferece Água");
        }
    }
    
    public void ValorCorrida (int Discancia) {
        Scanner scN = new Scanner (System.in);
        System.out.println("O valor da corrida é R$ 5,00 por Km");
        System.out.println("Discancia solicitada " +Discancia+ "Km");
        Discancia *= 5;
        
        System.out.println("\nVALOR FINAL R$ " +(Discancia + CalcularTaxaUso()));
    }
    
    public void Mensagem() {
        System.out.println("PLACA: " +placa);
        System.out.println("Ano do Veículo: " +AnoFabricacao);
        System.out.println("Beneficio: " + (OfereceAgua ? "Tem Água" : "Nem Um"));
        System.out.println("Taxa: " +CalcularTaxaUso());
    }
}
