package LISTA.LISTA_3_Encapsulamento_Interface.ATI_4_DispositivosEletrônicos;

import java.util.Random;

/*
4 - Dispositivos Eletrônicos: 
Crie uma interface DispositivoEletronico com os métodos ligar(), 
desligar() e obterStatus(). Implemente essa interface em classes como 
Televisao, Radio e Celular.
*/
public class Radio implements DispositivoEletronico {
    String Pro;
    double Estacao;
    boolean Ativado;

    public Radio(String Pro, double Estacao) {
        this.Pro = Pro;
        this.Estacao = Estacao;
        this.Ativado = Ativado;
    }

    public String getPro() {
        return Pro;
    }

    public void setPro(String Pro) {
        Random ale = new Random();
        int sorte = ale.nextInt(7);
        String[] programasRadio = {
            "Jornal da Manha", "Hora do Cafe", "Musicas do Momento",
            "Esporte em Debate", "Noticias da Cidade", "Show da Tarde", "Boa Noite FM"
        };
        
        this.Pro = programasRadio[sorte];
    }

    public double getEstacao() {
        return Estacao;
    }

    public void setEstacao(double Estacao) {
        Random ale = new Random();
        double sorte = ale.nextDouble(16);
        
        this.Estacao = sorte;
    }

    public boolean isAtivado() {
        return Ativado;
    }

    public void setAtivado(boolean Ativado) {
        this.Ativado = false;
    }
    

    @Override
    public void Ligar() {
        if (Ativado == false) {
            System.out.println("Rádio Ligado");
            Ativado = true;
        }
        else {
            System.out.println("O Rádio já está Ligado");
        }
    }

    @Override
    public void Desligar() {
        if (Ativado == true) {
            System.out.println("Rádio Desligado");
            Ativado = false;
        }
        else {
            System.out.println("O Rádio já está Desligado");
        }
    }

    @Override
    public void ObterStatus() {
        if (Ativado == true) {
            System.out.println("ESTAÇÃO: " +Estacao);
            System.out.println("PROGRAMA: " +Pro);
        }
        else {
            System.out.println("Você não consegue escutar nada");
            System.out.println("Porque o Rádio está desligado");
        }
    }
}
