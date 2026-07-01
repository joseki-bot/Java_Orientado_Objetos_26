package PROVA.RPG;
/*
Exercício 1: RPG de Mesa (Encapsulamento e Regras de Negócio)
Missão: Proteger os atributos de um personagem e aplicar regras de combate de 
forma segura.

Instruções de Implementação:
Na classe PersonagemRPG:
    Cria os atributos privados nome (String) e pontosDeVida (int).
Cria um Construtor para inicializar o nome e os pontos de vida no momento da criação.
Cria os métodos Getters para permitir a leitura do nome e dos pontosDeVida.

    Regra de Negócio (Atenção): 
Não cries um método genérico setPontosDeVida(). Em vez disso, cria um método
chamado receberDano(int dano). Este método deve subtrair o valor do dano aos 
pontos de vida do personagem. Se a vida do personagem cair para um valor igual 
ou inferior a zero, deves fixá-la em 0 e imprimir no ecrã: "O personagem [nome] 
foi derrotado!".

Na classe Main:
Cria o método principal (public static void main).
Instancia um personagem à tua escolha (ex: "Guerreiro Orc" com 50 pontos de vida).
Chama o método receberDano passando 60 de dano.
Imprime a vida atual do personagem para comprovar que o valor parou no zero e 
não ficou negativo.
*/
public class PersonagemRPG {
    private String Nome;
    private int PontosDeVida;

    public PersonagemRPG(String Nome, int PontosDeVida) {
        this.Nome = "Carlos Almeida";
        this.PontosDeVida = 169;
    }

    public String getNome() {
        return Nome;
    }

    public int getPontosDeVida() {
        return PontosDeVida;
    }

    
    public void ReceberDano(int Dano) {
        PontosDeVida -= Dano;
        System.out.println("- - - - - - - - - - - - -");
        if (PontosDeVida <= 0) {
            PontosDeVida = 0;
            System.out.println(Nome+ " foi Derrotado");
        }
        else{
            System.out.println("VIDA: " +PontosDeVida);
        }
        System.out.println("- - - - - - - - - - - - -");
    }
}