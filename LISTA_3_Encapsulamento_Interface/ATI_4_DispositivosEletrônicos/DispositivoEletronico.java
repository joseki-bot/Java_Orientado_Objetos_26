package LISTA.LISTA_3_Encapsulamento_Interface.ATI_4_DispositivosEletrônicos;
/*
4 - Dispositivos Eletrônicos: 
Crie uma interface DispositivoEletronico com os métodos ligar(), 
desligar() e obterStatus(). Implemente essa interface em classes como 
Televisao, Radio e Celular.
*/
public interface DispositivoEletronico {
    public abstract void Ligar();
    public abstract void Desligar();
    public abstract void ObterStatus();
}