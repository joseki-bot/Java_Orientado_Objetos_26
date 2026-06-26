package LISTA.LISTA_3_Encapsulamento_Interface.ATI_8_SistemaReservaHotel;

/*
8 - Sistema de Reservas de Hotel:
Crie uma interface Quarto com os métodos obterTipo(),
obterPrecoDiaria() e reservar().
*/

public interface Quarto {

    public abstract String obterTipo();
    public abstract double obterPrecoDiaria();

    public abstract void reservar();

}