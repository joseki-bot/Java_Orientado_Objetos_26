package LISTA.LISTA_5_Herança.ATI_5_Streaming;
/*
Exercício 5: Plataforma de Streaming (Netflix / Spotify)
Contexto: Serviços de assinatura oferecem diferentes planos, mudando a qualidade
de exibição e a presença de anúncios.

    Crie uma superclasse chamada Assinatura com os atributos emailUsuario 
(Texto) e valorMensal (Decimal). Crie um método exibirBeneficios() que imprime 
o email do usuário e o valor que ele paga.

    Crie uma subclasse PlanoPremium que herda de Assinatura. Adicione o atributo 
qualidade4K (Booleano). Sobrescreva o método exibirBeneficios() chamando primeiro 
o comportamento da superclasse (dica: use super) e, em seguida, adicionando um 
texto informando que o plano exibe conteúdo em 4K e não possui anúncios.

    Na classe Principal, use o Scanner para perguntar o e-mail de login do cliente. 
Instancie a classe PlanoPremium (você pode definir o valor da mensalidade fixo 
no código) e exiba os benefícios na tela.
*/
public class Assinatura {
    protected String EmailUsuario;
    protected double valorMensal;

    public Assinatura(String EmailUsuario, double valorMensal) {
        this.EmailUsuario = EmailUsuario;
        this.valorMensal = valorMensal;
    }

    
    public String getEmailUsuario() {
        return EmailUsuario;
    }

    public void setEmailUsuario(String EmailUsuario) {
        this.EmailUsuario = EmailUsuario;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
    
    
    public void exibirBeneficios() {
        System.out.println("Email: " +EmailUsuario);
        System.out.println("Mensalidade: R$ " +valorMensal);
    }
}
