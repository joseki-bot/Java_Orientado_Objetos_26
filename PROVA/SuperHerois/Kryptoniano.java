package PROVA.SuperHerois;

public class Kryptoniano extends Heroi {
    
    public Kryptoniano(String Nome) {
        super(Nome);
    }

    public String getNome() {
        return Nome;
    }
    
    
    public void Voar() {
        System.out.println(Nome+ "ergueu o punho e levantou voo para os céus em"
                                    + "\n super velocidade!");
    }
}