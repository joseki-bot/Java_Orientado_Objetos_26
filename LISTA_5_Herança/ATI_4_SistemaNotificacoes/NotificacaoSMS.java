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
public class NotificacaoSMS extends Notificacao{
    protected String Nome;

    
    public NotificacaoSMS(String Nome, String Mensagem, String Destinatario) {
        super(Mensagem, Destinatario);
        this.Nome = Nome;
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
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
        
        if (Mensagem.length() <= 160) {
            System.out.println("Emisor: " +Nome);
            System.out.println("Destinatorio: " +Destinatario);
            System.out.println("\n- - - - - - - - - - - - -");
            System.out.println("MENSAGEM:");
            System.out.print("  "+Mensagem);
        }
        else {
            System.out.println("Limente de Caracteres alcançador !!!");
            System.out.println("Por Favor, Reescreva a Mensagem Novamente");
            System.out.println("");
        }
        System.out.println("");
    }
}