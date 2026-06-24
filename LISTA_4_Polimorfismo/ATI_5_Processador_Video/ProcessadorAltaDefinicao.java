package LISTA.LISTA_4_Polimorfismo.ATI_5_Processador_Video;
/*
Exercício 5: Processador de Vídeo
Objetivo: Processar um arquivo de vídeo de maneiras diferentes 
sem alterar o sistema principal.

    Crie uma classe mãe abstrata chamada ProcessadorVideo com o método 
abstrato processar(String nomeArquivo).

    Crie três classes filhas: ProcessadorAltaDefinicao, ProcessadorMobile e 
ProcessadorApenasAudio.

    No método processar() de cada classe, imprima mensagens simulando o trabalho 
específico. Ex: O ProcessadorMobile deve imprimir 
"Comprimindo vídeo para poupar dados móveis: " + nomeArquivo.

    Na classe principal, use o Scanner para pedir o nome do arquivo de vídeo.

    Peça ao usuário para escolher o tipo de processamento desejado 
através de um menu.

    Utilizando o conceito de polimorfismo, inicie o 
processamento com o objeto adequado.
*/
public class ProcessadorAltaDefinicao extends ProcessadorVideo{

    @Override
    public void processar(String nomeArquivo) {
        System.out.println(nomeArquivo+ ": Definido para qualidade Maxima");
    }
}
