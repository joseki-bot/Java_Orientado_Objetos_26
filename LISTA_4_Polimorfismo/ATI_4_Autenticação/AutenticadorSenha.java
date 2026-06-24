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
public class AutenticadorSenha extends validarAcesso{
    private boolean Confimador;
    private String Usuario;
    private String Senha;

    public AutenticadorSenha(boolean Confimador, String Usuario, String Senha) {
        this.Confimador = false;
        this.Usuario = Usuario;
        this.Senha = Senha;
    }

    public boolean getConfimador() {
        return Confimador;
    }

    public void setConfimador(boolean Confimador) {
        if (Usuario.equalsIgnoreCase("adm") && Senha.equalsIgnoreCase("12345")) {
            System.out.println("Acesso de ADM Liberado");
             this.Confimador = true;
        }
        else {
            System.out.println("Acesso de ADM Negado");
            this.Confimador = false;
        }
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    @Override
    public void validarAcesso(String credencial) { // Vou usar a Gredenciais para ser o motivo
        if (Confimador == true) {
            System.out.println("==============");
            System.out.println("== MODO ADM ==");
            System.out.println("==============\n");
        }
        
        System.out.println("USÚARIO: " +Usuario);
        System.out.println("SENHA: " +Senha);
        System.out.println("\nMOVIVO DE ACESSO: \n" +credencial);
    }
}