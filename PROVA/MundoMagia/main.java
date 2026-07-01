package PROVA.MundoMagia;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        varinha vara = new varinha("Pau", null);
        
        String material = "Pau";
        vara.setMadeira("Pau");
        
        Bruxo b = new Bruxo("Jose", null, "Pau", null);
        
        b.lancarFeitico("Espiritos do Troção subsugai por vossa vontade e devastai em um raio CHOQUE");
        
    }
    
}
