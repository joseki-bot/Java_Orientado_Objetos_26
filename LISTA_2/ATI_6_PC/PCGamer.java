package LISTA.LISTA_2.ATI_6_PC;
/*
Crie uma classe PCGamer com os atributos processador (String), memoriaRAM (int) e
rgbLigado (boolean).

    • Use o encapsulamento para proteger os dados da máquina.

    • Crie o método ativarModoOverclock(), que altera o estado do rgbLigado para 
true (afinal, mais RGB significa mais desempenho!) e exibe na tela as especificações
completas do setup rodando em capacidade máxima.
 */
public class PCGamer {
    
private String Processador;
private int MemoriaRAM;
private boolean RGB;

    public PCGamer(String Processador, int MemoriaRAM, boolean RGB) {
        this.Processador = Processador;
        this.MemoriaRAM = MemoriaRAM;
        this.RGB = RGB;
    }

    public String getProcessador() {
        return Processador;
    }

    public void setProcessador(String processador) {
        this.Processador = Processador;
    }

    public int getMemoriaRAM() {
        return MemoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.MemoriaRAM = memoriaRAM;
    }

    public boolean isRgbLigado() {
        return RGB;
    }

    public void setRgbLigado(boolean rgbLigado) {
        this.RGB = RGB;
    }

    // Método pedido
    public void ativarModoOverclock() {
        RGB = true;

        System.out.println("=== MODO OVERCLOCK ATIVADO ===");
        System.out.println("Processador: " + Processador);
        System.out.println("Memória RAM: " + MemoriaRAM + " GB");
        System.out.println("RGB Ligado: " + (RGB ? "Sim" : "Não"));
        System.out.println("Setup rodando em capacidade máxima!");
    }

}
