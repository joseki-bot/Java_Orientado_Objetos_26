package LISTA.LISTA_3_Encapsulamento_Interface.ATI_8_SistemaReservaHotel;

/*
8 - Sistema de Reservas de Hotel:
Crie uma interface Quarto com os métodos obterTipo(),
obterPrecoDiaria() e reservar().
*/

public class QuartoLuxo implements Quarto {
    private String Tipo;
    private double Preco;

    public QuartoLuxo(String Tipo, double Preco) {
        this.Tipo = Tipo;
        this.Preco = Preco;
    }

    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    @Override
    public String obterTipo() {
        return Tipo;
    }

    @Override
    public double obterPrecoDiaria() {
        return Preco;
    }

    @Override
    public void reservar() {

        System.out.println("\n========================");
        System.out.println("Reserva realizada!");
        System.out.println("Quarto: " + Tipo);
        System.out.println("Diária: R$ " + Preco);
        System.out.println("========================");
    }
}