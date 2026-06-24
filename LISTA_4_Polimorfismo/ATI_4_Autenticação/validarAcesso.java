package LISTA.LISTA_4_Polimorfismo.ATI_4_Autenticação;
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
public abstract class validarAcesso {
    
    public abstract void validarAcesso (String credencial);
}
