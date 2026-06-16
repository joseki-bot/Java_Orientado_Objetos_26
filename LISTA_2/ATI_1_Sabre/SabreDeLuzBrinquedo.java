package LISTA.LISTA_2.ATI_1_Sabre;

/*
1. O Sabre de Luz de Brinquedo (Star Wars)
Crie uma classe SabreDeLuzBrinquedo com os atributos cor (String), emiteSom (boolean) e ligado (boolean).

    • Crie um construtor que inicialize o sabre com a cor desejada e defina se ele tem efeito
de som ou não, mas que sempre garanta que o brinquedo inicie desligado.

    • Crie os métodos ligar() e desligar() que alteram o estado do sabre. Se ele for ligado e
emite Som for verdadeiro, exiba no console: " Vrummm! Seu sabre de luz emitiu som de batalha!"
*/
public class SabreDeLuzBrinquedo {
String cor;
boolean EmiteSom;
boolean Ligado = false;
String Aumentar = "=";

    public SabreDeLuzBrinquedo(String cor, boolean EmiteSom, boolean Ligado) {
        this.cor = cor;
        this.EmiteSom = EmiteSom;
        this.Ligado = Ligado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEmiteSom() {
        return EmiteSom;
    }

    public void setEmiteSom(boolean EmiteSom) {
        this.EmiteSom = EmiteSom;
    }

    public boolean isLigado() {
        return Ligado;
    }

    public void setLigado(boolean Ligado) {
        this.Ligado = Ligado;
    }

void Ligar () throws InterruptedException {
int finalizador = 0;    

do {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    Aumentar += "=";
    finalizador++;
    System.out.println("     {}");
    System.out.println("[]|||[]" +Aumentar+ ">");
    System.out.println("     {} ");
        Thread.sleep(569);
}while (finalizador != 13);
    System.out.println("\n\nSeu Sabre está Pronto para a Batalha");
}


void Status() {
    System.out.println("Cor do Sabre: " +this.cor);
    System.out.println("SOM: "+(this.EmiteSom ? "Vruuumm" : "..."));
    System.out.println("Ele está " +(this.Ligado ? "Ligado" : "Desligado"));
}
    



}
