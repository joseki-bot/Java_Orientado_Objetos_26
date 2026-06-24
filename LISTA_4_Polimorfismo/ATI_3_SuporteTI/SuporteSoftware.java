package LISTA.LISTA_4_Polimorfismo.ATI_3_SuporteTI;

public class SuporteSoftware extends TratamentoChamado {

    public SuporteSoftware(String descricaoProblema) {
        super(descricaoProblema);
    }

    @Override
    public void encaminhar() {
        System.out.println("==========================");
        System.out.println("==      PROBLEMA        ==");
        System.out.println(descricaoProblema);
        System.out.println("==========================");
        System.out.println("\n==      SOLUÇÃO        ==");
        System.out.println("Xingar o Note");
        System.out.println("\n-Note é o criador do Minecraft, se qualquer programa");
        System.out.println("der problema é culpa dele");
    }
    
}
