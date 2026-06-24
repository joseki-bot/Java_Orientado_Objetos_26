package LISTA.LISTA_4_Polimorfismo.ATI_2_Relatorios;

import java.util.Scanner;

/*
Exercício 2: Exportador de Relatórios
Objetivo: Simular a exportação de um texto para diferentes formatos.

    Crie uma classe mãe abstrata chamada Exportador com o método abstrato 
exportar(String dados).

    Crie três classes filhas: ExportadorPDF, ExportadorCSV e ExportadorJSON.

    Em cada classe filha, implemente o método exportar() para imprimir 
uma mensagem que simule a conversão. Por exemplo, no PDF: "Gerando páginas 
e bloqueando edição para: " + dados.

    Na classe principal, use o Scanner para ler um texto digitado pelo usuário.

    Mostre um menu para o usuário escolher o formato de exportação 
(1 - PDF, 2 - CSV, 3 - JSON).

    Usando polimorfismo, instancie o exportador escolhido e 
chame o método exportar().
*/
public class MAIN {
    public static void main(String[] args) {
    Exportador Exp = null;
    Scanner scN = new Scanner(System.in);
    Scanner scL = new Scanner(System.in);
        
        System.out.println("Como você quer Nomear o arquivo");
        System.out.print("=> ");
            String NomeArquivo = scL.nextLine().trim();
    
        System.out.println("===============================");
        System.out.println("COMO VOCÊ QUER SALVAR O ARQUIVO");
        System.out.println("===============================");
        System.out.println("1. PDF");
        System.out.println("2. CSV");
        System.out.println("3. JSON");
        System.out.print("\n=> ");
            int Escolha = scN.nextInt();
        
        switch (Escolha) {
            case 1 -> { // PDF
                Exp = new ExportadorPDF(NomeArquivo);
                break;
            }
            case 2 -> { // CSV
                Exp = new ExportadorCSV(NomeArquivo);
                break;
            }
            case 3 -> { // JSON
                Exp = new ExportadorJSON(NomeArquivo);
                break;
            }
        }
        Exp.exportar();
    }
}