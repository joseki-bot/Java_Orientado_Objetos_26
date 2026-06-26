package LISTA.LISTA_3_Encapsulamento_Interface.ATI_4_DispositivosEletrônicos;

import java.util.Random;

/*
4 - Dispositivos Eletrônicos: 
Crie uma interface DispositivoEletronico com os métodos ligar(), 
desligar() e obterStatus(). Implemente essa interface em classes como 
Televisao, Radio e Celular.
*/
public class Televisao implements DispositivoEletronico{
boolean Ativado;
String Programa;
int Hora;
int Min;

    public Televisao (boolean Ativado, double Bateria, int Hora, int Min) {
        this.Ativado = Ativado;
        this.Programa = Programa;
        this.Hora = Hora;
        this.Min = Min;
    }

    public boolean getAtivado() {
        return Ativado;
    }

    public void setAtivado(boolean Ativado) {
        this.Ativado = false;
    }

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(double Bateria) {
        Random ale = new Random();
        String [] Pro = {
        "Bom Dia e CIA", "Domingão com o Fastão", "Domingo Legal", "Encontro com a Fatima Bernades",
        "Globo Reporte", "Pânico na TV" };
        int Sorte = ale.nextInt(6);
        
        this.Programa = Pro[Sorte];
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
            System.out.println("Você Ligou a Televisão");
            Ativado = true;
        }
        else {
            System.out.println("A Televisão já está Ligada");
        }
    }

    @Override
    public void Desligar() {
        if (Ativado == true) {
            System.out.println("Você Desliga a TV");
            Ativado = false;
        }
        else {
            System.out.println("A TV já está Desligada");
        }
    }

    @Override
    public void ObterStatus() {
        if (Ativado == true) {
            System.out.println("Programa: " +Programa);
            System.out.println("Horario: " +Hora+ ":" +Min);
        }
        else {
            System.out.println("É preciso Ligar a Televição antes");
        }
    }
    
}
