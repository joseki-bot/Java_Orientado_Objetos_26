package LISTA_1_Introdução.Atividade_6;

public class ALUNO {
// 6. Crie uma classe Aluno com os atributos nome (String), matricula (int) e notas 
// (um array de doubles). Crie um método calcularMedia() que retorna a média das notas do aluno.
    
String Nome;
int Matricula;
double [] Notas = new double[4];
double Média = 0;

void CalcularMedia() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("A Média das seguintes Notas são");
    for (double Calcular : Notas){
        System.out.println("=> "+Calcular);
        Média += Calcular;
    }
    
    System.out.println("\n- - - - - - - ");
    System.out.println("=>  " +Média+ "  <=");
    System.out.println("- - - - - - -");
}

}
