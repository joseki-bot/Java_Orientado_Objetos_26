package LISTA.LISTA_3_Encapsulamento_Interface.ATI_6_Dispositivo_Armazamento;
/*
6 - Dispositivos de Armazenamento: 
Crie uma interface DispositivoArmazenamento com os métodos armazenarDados(String dados) 
e recuperarDados(). Implemente essa interface em classes como DiscoRigido, PenDrive e Nuvem.
*/
public interface DispositivoArmazenamento {
    public abstract void armazenarDados (String dados);
    public abstract void recuperarDados();
}
