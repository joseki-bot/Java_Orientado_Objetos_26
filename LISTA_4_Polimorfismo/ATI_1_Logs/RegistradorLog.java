package LISTA.LISTA_4_Polimorfismo.ATI_1_Logs;
/*
Exercício 1: Sistema de Logs de Auditoria
Objetivo: Criar um simulador de registo de atividades do sistema.

    Crie uma classe mãe abstrata chamada RegistradorLog. Ela deve ter um método 
abstrato gravar(String acao).

    Crie três classes filhas: LogEmArquivo, LogEmBancoDeDados e LogNaNuvem.

    Em cada classe filha, implemente o método gravar() para imprimir uma mensagem 
na tela simulando o salvamento (ex: "Salvando em Arquivo de Texto: " + acao).

    Na classe principal (com main), use o Scanner para pedir ao usuário que 
digite uma ação (ex: "Fatura apagada").

    Peça ao usuário para escolher o destino do log 
(1 - Arquivo, 2 - Banco de Dados, 3 - Nuvem).

    Instancie a classe correta em uma variável do tipo RegistradorLog e 
chame o método gravar() (polimorfismo).
*/
public abstract class RegistradorLog {
    protected String acao;

    public RegistradorLog(String acao) {
        this.acao = acao;
    }
    
}
