package LISTA.LISTA_3_Encapsulamento_Interface.ATI_2_ANIMAL;

public class Main {
    public static void main(String[] args) {
        Zoologico ZOO = new Zoologico();
        String Animal = ZOO.Bicho;
        
        System.out.println("Você Está andando por um Zoológico");
        System.out.println("E você ver um " +Animal);
        System.out.println("\nE olha para você e Manda um");
        ZOO.EmitirSom();
    }
}
