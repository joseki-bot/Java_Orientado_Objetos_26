package LISTA_1_Introdução.Atividade_3;

public class Carro {
// 3. Crie uma classe Carro com os atributos marca (String), modelo (String), ano (int)
// e ligado (boolean). Crie os métodos ligar() e desligar() que alteram o estado do carro


    
String Marca;
String Modelo;
int Ano;
boolean Ligado;

void Ligar() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("A Marca do Carro é " +Marca);
    System.out.println("Modelo: " +Modelo);
    System.out.println("Ano: " +Ano);
    if (Ligado == true) {
        System.out.println("E ele está Ligado");
    }
    else {
        System.out.println("E ele está Desligado");
    }
}
void Desligado() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("A Marca do Carro é " +Marca);
    System.out.println("Modelo: " +Modelo);
    System.out.println("Ano: " +Ano);
    if (Ligado == true) {
        System.out.println("E ele está Desligado");
    }
    else {
        System.out.println("E ele está Ligado");
    }
}    
}
