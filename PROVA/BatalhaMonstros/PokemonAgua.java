package PROVA.BatalhaMonstros;

public class PokemonAgua extends Pokemon{
    
    public PokemonAgua(String Nome) {
        super(Nome);
    }
    
    @Override
    public void Atacar() {
        System.out.println(Nome+ " usou o Jato de Água");
    }
}
