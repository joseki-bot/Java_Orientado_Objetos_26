package LISTA.LISTA_2.ATI_5_LEGO;

import java.util.Random;

/*
5. Millennium Falcon de LEGO (Star Wars)
Crie uma classe MillenniumFalconLego com os atributos totalPecas (int), 
pecasMontadas (int) e manualDisponivel (boolean).

    • Implemente os métodos especiais Getters e Setters para todos os atributos.

    • Crie um método de comportamento chamado exibirProgresso() que imprima 
na tela de forma organizada a quantidade de peças que já foram encaixadas em 
relação ao total do set de LEGO.
*/
public class MillenniumFalconLego {
int TotalPecas;
int PecasMontadas;
boolean ManualDisponivel;

    public MillenniumFalconLego(int TotalPecas, int PecasMontadas, boolean ManualDisponivel) {
        this.TotalPecas = 75192;
        this.PecasMontadas = PecasMontadas;
        this.ManualDisponivel = ManualDisponivel;
    }

    public int getTotalPecas() {
        return TotalPecas = 75192;
    }

    public void setTotalPecas(int TotalPecas) {
        this.TotalPecas = TotalPecas;
    }

    public int getPecasMontadas() {
        return PecasMontadas;
    }

    public void setPecasMontadas(int PecasMontadas) {
        this.PecasMontadas = PecasMontadas;
    }

    public boolean isManualDisponivel() {
        return ManualDisponivel;
    }

    public void setManualDisponivel(boolean ManualDisponivel) {
        this.ManualDisponivel = true;
    }

void exibirProgresso() {
    Random ale = new Random();
    int Peças = ale.nextInt();
    
    System.out.println("Total de Peças: " +this.TotalPecas);
    System.out.println("Peças Montadas: " +this.PecasMontadas);
    System.out.println("Manuel: " +(this.ManualDisponivel ? "Ele do seu lado"
                                                          : "Virou Fumaça"));
    System.out.println("\nFalta " +(this.TotalPecas - this.PecasMontadas)+ " Peças para montar");
}
}
