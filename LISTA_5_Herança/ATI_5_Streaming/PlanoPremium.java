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
public class PlanoPremium extends Assinatura{
    protected boolean qualidade4K;

    public PlanoPremium(boolean qualidade4K, String EmailUsuario, double valorMensal) {
        super(EmailUsuario, valorMensal);
        this.qualidade4K = qualidade4K;
    }
    
    
    
    public void exibirBeneficios() {
        Assinatura Super = new Assinatura(EmailUsuario, valorMensal);
        Super.exibirBeneficios();
        
        if (qualidade4K == true) {
            System.out.println("\nSeu Plano é Premium");
            System.out.println("Você pode assistir em 4k e sem anúncio");
        }
        else {
            System.out.println("\nSeu Plano é o Básico");
            System.out.println("Você pode assistir em 1080p e com anúncio");
        }
    }
    
}
