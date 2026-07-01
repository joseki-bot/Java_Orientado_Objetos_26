package PROVA.BatalhaMonstros;

public class PokemonFogo extends Pokemon {
    
    public PokemonFogo(String Nome) {
        super(Nome);
    }
    
    @Override
    public void Atacar() {
        System.out.println(Nome+ " usou o Lança-Chamas");
    }
}
