package LISTA.LISTA_5_Herança.ATI_4_SistemaNotificacoes;

import java.util.Scanner;

/*
Exercício 4: Sistema de Notificações (Microsserviços): 
Sistemas modernos enviam notificações para os usuários por diferentes canais, 
e cada canal tem suas próprias regras de envio.

    Crie uma superclasse chamada Notificacao com os atributos mensagem (Texto) e 
destinatario (Texto). Crie um método enviar() que exibe a mensagem 
"Enviando notificação genérica".

    Crie uma subclasse NotificacaoSMS que herda de Notificacao. Sobrescreva o 
método enviar(). A regra de negócio aqui é: o SMS só pode ser enviado 
(impresso no console) se o tamanho da mensagem for menor ou igual a 160 
caracteres. Caso contrário, exiba uma mensagem de erro.

    Na classe Principal, use o Scanner para pedir o número de telefone do 
destinatário e o texto da mensagem. Instancie o objeto e chame o método 
enviar() para testar a validação do tamanho do texto.
*/
public class main {
    public static void main(String[] args) {
    Scanner scL = new Scanner (System.in);
    Scanner scN = new Scanner (System.in);
    
    Notificacao Not = null;
    NotificacaoSMS SMS = null;
    
    boolean finalizador = false;
    
        System.out.println("=================");
        System.out.println("== MICROPENNIS ==");
        System.out.println("=================\n");
        System.out.println("Infomer o Nome do Funcionario");
        System.out.print("=>");
            String nome = scL.nextLine();
            
        System.out.println("Informe o Numero da pesso que você deseja mandar a Notificação");
        System.out.print("=> ");
            String Numero = scL.nextLine().trim();
            
    do {
        System.out.println("\nEscreva a mensagem:");
        System.out.print("- ");
            String Mensagem = scL.nextLine();
            
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        SMS = new NotificacaoSMS(nome, Mensagem, Numero);
        SMS.Enviar();
        
        if (Mensagem.length() <= 160) {
            finalizador = true;
        }
        
    } while (finalizador != true);  
        
    }
}