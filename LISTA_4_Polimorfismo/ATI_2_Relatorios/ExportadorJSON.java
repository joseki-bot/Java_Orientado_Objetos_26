package LISTA.LISTA_4_Polimorfismo.ATI_2_Relatorios;
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
public class ExportadorJSON extends Exportador {

    public ExportadorJSON(String dados) {
        super(dados);
    }

    @Override
    public void exportar() {
        System.out.println("Salvamento Realizado com Sucesso");
        System.out.println("Aquivo Salvo como JSON");
        System.out.println("NOME: " +dados+ ".json");
    }
}