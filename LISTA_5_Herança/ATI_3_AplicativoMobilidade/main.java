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
public class main {
    public static void Espaço() {
        for (int i = 0; i < 15; i++) {
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws InterruptedException {
    Scanner scL = new Scanner (System.in);        
    Scanner scN = new Scanner (System.in);       
    Veiculo N = null;
    CarroVIP VIP = null;
        
        System.out.println("===================");
        System.out.println("==== WHITE CAR ====");
        System.out.println("===================");
        System.out.println("\nBem-Vindo a White Car, por favor infomer oque você deseja fazer");
        System.out.println("\n1. Chamar um Carro");
        System.out.println("2. Cadastrar como Motorista");
        System.out.print("\n=> ");
            int Escolha = scN.nextInt();

        Espaço();
        switch(Escolha) {
            case 1 -> { // Chamar carro
                System.out.println("=========================");
                System.out.println("== Escolha a Categoria ==");
                System.out.println("=========================");
                System.out.println("\n1. Normal");
                System.out.println("2.VIP");
                System.out.print("\n=> ");
                    Escolha = scN.nextInt();
                    
                System.out.println("\nQual a Distancia que deseja Precorrer em Km");
                System.out.print("=> ");
                    int Dintancia = scN.nextInt();
                    N = new Veiculo(null, Dintancia);
                    VIP = new CarroVIP(true, null, Dintancia);
                
                switch (Escolha) {
                    case 1 -> { // Normal
                        N.ValorCorrida(Dintancia);
                        Thread.sleep(2069);
                        break;
                    }
                    case 2 -> {// VIP
                        VIP.ValorCorrida(Dintancia);
                        VIP.OfereceAgua = true;
                        VIP.exibirBeneficios();    
                        Thread.sleep(2069);
                        break;
                    }
                }
                break;
            }
            case 2 -> { // Cadastrar
                System.out.println("=========================");
                System.out.println("== SISTEMA DE CADASTRO ==");
                System.out.println("=========================\n");
                System.out.println("Informe a Placa do Veiculo");
                System.out.print("=> ");
                    String Placa = scL.nextLine();
                
                System.out.println("- - - - - - - - - - - - - - - - - - - - -");
                System.out.println("Informe o Ano da Fabricação do Veículo");
                System.out.print("=> ");
                    int AnoF = scN.nextInt();
                
                System.out.println("\n- - - - - - - - - - - - - - - - - - - - -");
                System.out.println("Deseja Oferecer Água ? (S/N)");
                    String OfereceAgua = scL.nextLine().toLowerCase();
                    
                boolean TemAgua = false;
                switch (OfereceAgua) {
                    case "s", "sim", "yes", "y" -> {
                        TemAgua = true;
                        break;
                    }
                    case "n", "nao", "não", "no" -> {
                        TemAgua = false;
                        break;
                    }
                }
                Espaço();
                VIP = new CarroVIP(TemAgua, Placa, AnoF);
                VIP.Mensagem();
                Thread.sleep(2069);
                break;
            }
        }
    }
}
