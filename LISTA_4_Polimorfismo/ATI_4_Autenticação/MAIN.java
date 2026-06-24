package LISTA.LISTA_4_Polimorfismo.ATI_4_Autenticação;

import java.util.Scanner;

/*
Exercício 4: Simulador de Autenticação (Login)
Objetivo: 
Validar o acesso de um usuário simulando diferentes métodos de segurança.

    Crie uma classe mãe abstrata chamada Autenticador com o método 
abstrato validarAcesso(String credencial).

    Crie três classes filhas: AutenticadorSenha, 
AutenticadorBiometrico e AutenticadorToken.

    Implemente o método validarAcesso() em cada uma, imprimindo mensagens que 
simulem a validação (ex. no biométrico: "Lendo impressão digital para a 
credencial: " + credencial).

    Na classe principal, mostre um menu perguntando qual método de login o 
usuário deseja usar.

    Use o Scanner para pedir que ele digite a sua "credencial" 
(pode ser uma senha ou um código simulado).

    Guarde a escolha em uma variável do tipo Autenticador e execute a 
validação polimórfica.
*/
public class MAIN {
    public static void main(String[] args) {
    Scanner scL = new Scanner(System.in);
    Scanner scN = new Scanner(System.in);
    validarAcesso Validador = null;
        
        System.out.println("======================");
        System.out.println("== SISTEMA DE LOGIN ==");
        System.out.println("======================");
        System.out.println("\nInfome o Usuario:");
        System.out.print("=> ");
            String User = scL.nextLine();
        
        System.out.println("\nDigite sua Senha:");
        System.out.print("=> ");
            String senha = scL.nextLine();
            
        System.out.println("\nInfome o Motivo do seu acesso");
        System.out.print("=> ");
            String Motivo = scL.nextLine();
        
        System.out.println("\nVerificando a Senha.");
        Validador = new AutenticadorSenha(false, User, senha);
        Validador.validarAcesso(Motivo);
        System.out.println("\nAcesso Permitido");
        
        
        System.out.println("\n\n");
        System.out.println("Verificando a Biometria");
        Validador = new AutenticadorBiometrico(true);
        Validador.validarAcesso(User);
        
        
        System.out.println("\n\n");
        System.out.println("Digite o Token de acesso");
        System.out.print("=> ");
            String token = scL.nextLine();
        Validador = new AutenticadorToken(true, token);
        Validador.validarAcesso(token);
        
    }
}
