package LISTA.LISTA_5_Herança.ATI_4_SistemaNotificacoes;
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
public class Notificacao {
    protected String Mensagem;
    protected String Destinatario;

    public Notificacao(String Mensagem, String Destinatario) {
        this.Mensagem = Mensagem;
        this.Destinatario = Destinatario;
    }

    
    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }
    
    
    public void Enviar() {
        System.out.println("Enviando notificação genérica");
    }
    
    
    
}
