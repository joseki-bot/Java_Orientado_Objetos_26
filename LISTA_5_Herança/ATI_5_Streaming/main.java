package LISTA.LISTA_5_Herança.ATI_5_Streaming;

import java.util.Random;
import java.util.Scanner;
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
public class main {
    public static void main(String[] args) {
    Scanner scL = new Scanner (System.in);
    Scanner scN = new Scanner (System.in);
    Random ale = new Random();
    PlanoPremium Prem = null;
    
    int sorte = ale.nextInt(1, 3);
    
        System.out.println("Informe o seu Email");
        System.out.print("=> ");
            String email = scL.nextLine();
            
    if (sorte == 1) { // Premium
        Prem = new PlanoPremium(true, email, 79.90);
    }
    else {
        Prem = new PlanoPremium(false, email, 59.90);
    }
    Prem.exibirBeneficios();
    }
}