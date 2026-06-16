package LISTA.LISTA_2.ATI_4_Pikamon;
/*
Crie uma classe CartaPokemon com os atributos nome (String), 
tipo (String, ex: "Fogo", "Água", "Elétrico") e hp (int).
    
• Crie dois construtores (Sobrecarga de Construtor):
    1. Um construtor padrão (sem parâmetros) que cria automaticamente uma carta
clássica do "Pikachu", do tipo "Elétrico" e com 60 de HP.

    2. Um construtor parametrizado para criar qualquer outra carta de Pokémon
personalizada que o colecionador quiser instanciar.
*/
public class CartaPokemon {

String Nome;    
String Tipo;
int hp;

    public CartaPokemon() {
        Nome = "Pikachu";
        Tipo = "Elétrico";
        hp = 60;
    }

    public CartaPokemon(String nome, String tipo, int hp) {
        this.Nome = nome;
        this.Tipo = tipo;
        this.hp = hp;
    }

    public void exibirCarta() {
        System.out.println("Nome: " + Nome);
        System.out.println("Tipo: " + Tipo);
        System.out.println("HP: " + hp);
    }
}