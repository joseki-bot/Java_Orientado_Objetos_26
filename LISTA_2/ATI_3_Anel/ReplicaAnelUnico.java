package LISTA.LISTA_2.ATI_3_Anel;

import java.util.Random;

/*
3. Réplica do Anel Único (Senhor dos Anéis)
Crie uma classe ReplicaAnelUnico com os atributos material (String, ex: "Ouro", "Tungstênio"),
tamanhoAro (int) e inscricaoVisivel (boolean).

    • Crie um construtor parametrizado que defina o material e o tamanho do aro da réplica,
mas que sempre inicie com a inscricaoVisivel como false (afinal, a inscrição em Língua
Negra de Mordor só aparece no fogo!).

    • Crie o método jogarNoFogo(), que altera o estado de inscricaoVisivel para true e exibe
na tela a famosa tradução: "Um Anel para a todos governar, Um Anel para encontrálos..."
*/
public class ReplicaAnelUnico {
    
String Matirial; 
int TamanhoAro;
boolean inscricaoVisivel;

    public ReplicaAnelUnico(String Matirial, int TamanhoAro, boolean inscricaoVisivel) {
        this.Matirial = Matirial;
        this.Matirial = Matirial; //setMatirial(Matirial);
        this.inscricaoVisivel = inscricaoVisivel;
    }

    public String getMatirial() {
        return Matirial;
    }
    public void setMatirial(String Matirial) {
        this.Matirial = Matirial;
    }

    public int getTamanhoAro() {
        if (TamanhoAro < 19) {
            System.out.println("Mas não consegue, pois é muito pequeno");
        }
        else if (TamanhoAro > 23 ) {
            System.out.println("Mas percebe que ele é muito grande para os seus dedos");
        }
        else {
            System.out.println("Ele cabe perfeitamente");
            System.out.println("E e quando vai olhar para as suas mãos");
            System.out.println("Vocâ não as vê");
        }
        return TamanhoAro;
    }
    public void setTamanhoAro(int TamanhoAro) {
        this.TamanhoAro = TamanhoAro;
    }

    public boolean isInscricaoVisivel() {
        return inscricaoVisivel;
    }
    public void setInscricaoVisivel(boolean inscricaoVisivel) {
        this.inscricaoVisivel = inscricaoVisivel;
    }

public static boolean Queima() {
    Expecialista A = new Expecialista();
    String Item = A.Base_Anel();
    if (Item.equals("Bernado") || Item.equals("Resina") ||
        Item.equals("Madeira") || Item.equals("Fibra de Carbono") ||
        Item.equals("Cerâmica") || Item.equals("Alumínio") ||
        Item.equals("Latão") ) {
        
        return true;
    }
    else {
        return false;
    }
}    

void jogarNoFogo() {
    this.inscricaoVisivel = true;
    System.out.println("Você joga o Anel no Fogo");
    if (Queima() == false) {
    System.out.println("Com o Color do Fogo ele começa a exibir uma escrita");
    System.out.println("\"'Um Anel para a todos governar, Um Anel para encontrálos...'\"");
    }
    else {
        System.out.println("E você vê ele queimando");
        System.out.println("Oque você esperava, ele era feito de "+ this.Matirial);
    }
}

void mostrar() {
    System.out.println("Material do Anel: " +this.Matirial);
    System.out.println("Tamanho: " +this.TamanhoAro+ "mm");
    System.out.print("Sobre o Anel: ");
    if (this.inscricaoVisivel == true && Queima() == false) {
        System.out.println("Uma frase está Marcada no Anel");
        System.out.println("\"'Um Anel para a todos governar, Um Anel para encontrálos...'\"");
    }
    else if (this.inscricaoVisivel == false && Queima() == false){
        System.out.println("Uma Energia se Emana dele");
    }
    else {
        System.out.println("Agora é apenas um monte de cinzas");
    }
    }
}





