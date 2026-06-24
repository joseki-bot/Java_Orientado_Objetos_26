package LISTA.LISTA_4_Polimorfismo.ATI_3_SuporteTI;
/*
Exercício 3: Triagem de Suporte de TI (Helpdesk)
Objetivo: Encaminhar um chamado de suporte para a equipe correta.

    Crie uma classe mãe abstrata chamada TratamentoChamado com o método 
abstrato encaminhar(String descricaoProblema).

    Crie três classes filhas: SuporteHardware, SuporteRede e SuporteSoftware.

    Implemente o método encaminhar() em cada filha. O SuporteHardware deve 
imprimir "Enviando técnico fisicamente para avaliar: " + descricaoProblema, 
e assim por diante para as outras equipes.

    Na classe principal, use o Scanner para pedir que o usuário 
descreva o seu problema.

    Peça para o usuário selecionar a categoria do problema 
(1 - Hardware, 2 - Rede, 3 - Software).

    Use o polimorfismo para instanciar a equipe correta e chame o método encaminhar().
*/
public class SuporteRede extends TratamentoChamado {

    public SuporteRede(String descricaoProblema) {
        super(descricaoProblema);
    }

    @Override
    public void encaminhar() {
        System.out.println("==========================");
        System.out.println("==      PROBLEMA        ==");
        System.out.println("==========================");
        System.out.println("Descrição\n");
        System.out.println(descricaoProblema);
        System.out.println("\n\n=========================");
        System.out.println("\n==      SOLUÇÃO        ==");
        System.out.println("Reiniciar o Roteador");
        System.out.println("\n-Tirei ele da tomada e conta até 10 segunto");
        System.out.println("Depois coloque novamento ele na tomada");
    }
    
}
