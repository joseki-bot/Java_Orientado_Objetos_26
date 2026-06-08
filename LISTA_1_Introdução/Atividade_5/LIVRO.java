package LISTA_1_Introdução.Atividade_5;

public class LIVRO {
// 5. Crie uma classe Livro com os atributos titulo (String), autor (String), 
// anoPublicacao(int) e disponivel (boolean). Crie os métodos emprestar() 
// e devolver() que alteram o estado de disponibilidade do livro.
    
String Titulo;
String Autor;
int Ano_Publicação;
boolean Disponivel;

void Emprestar() {
    System.out.println("Titulo: " +Titulo);
    System.out.println("Autor: " +Autor);
    System.out.println("Puclicado no Ano de " +Ano_Publicação);
    
    System.out.println("Status: Indisponivel");
}
void Devolver() {
    System.out.println("Titulo: " +Titulo);
    System.out.println("Autor: " +Autor);
    System.out.println("Puclicado no Ano de " +Ano_Publicação);
    
    System.out.println("Status: Disponivel");
}   
}
