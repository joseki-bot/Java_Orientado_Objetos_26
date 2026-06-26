package LISTA.LISTA_3_Encapsulamento_Interface.ATI_4_DispositivosEletrônicos;

import java.util.Random;

/*
4 - Dispositivos Eletrônicos: 
Crie uma interface DispositivoEletronico com os métodos ligar(), 
desligar() e obterStatus(). Implemente essa interface em classes como 
Televisao, Radio e Celular.
*/
public class Celular implements DispositivoEletronico{
boolean Ativado;
double Bateria;
int Hora;
int Min;

    public Celular(boolean Ativado, double Bateria, int Hora, int Min) {
        this.Ativado = Ativado;
        this.Bateria = Bateria;
        this.Hora = Hora;
        this.Min = Min;
    }

    public boolean getAtivado() {
        return Ativado;
    }

    public void setAtivado(boolean Ativado) {
        this.Ativado = false;
    }

    public double getBateria() {
        return Bateria;
    }

    public void setBateria(double Bateria) {
        Random ale = new Random();
        
        this.Bateria = ale.nextInt(0, 101);
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        Random ale = new Random();
        this.Hora = ale.nextInt(0, 24);
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int Min) {
        Random ale = new Random();
        this.Min = ale.nextInt(0, 60);
    }
    
    
    @Override
    public void Ligar() {
        if (Ativado == false) {
            System.out.println("Você Ligou o Celular");
            Ativado = true;
        }
        else {
            System.out.println("O celular já está Ligado");
        }
    }

    @Override
    public void Desligar() {
        if (Ativado == true) {
            System.out.println("Você Desligou o Celular");
            Ativado = false;
        }
        else {
            System.out.println("O Celular já está Desligado");
        }
    }

    @Override
    public void ObterStatus() {
        if (Ativado == true) {
            System.out.println("Bateria: "+Bateria+"%");
            System.out.println("Horario: " +Hora+ ":" +Min);
        }
        else {
            System.out.println("É preciso ligar o Celular para ver os Status");
        }
    }
}
