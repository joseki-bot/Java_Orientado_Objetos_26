package LISTA.LISTA_3_Encapsulamento_Interface.ATI_6_Dispositivo_Armazamento;
/*
6 - Dispositivos de Armazenamento: 
Crie uma interface DispositivoArmazenamento com os métodos armazenarDados(String dados) 
e recuperarDados(). Implemente essa interface em classes como DiscoRigido, PenDrive e Nuvem.
*/
public class DiscoRigido implements DispositivoArmazenamento{
    private boolean Salvar;
    private String TipoArquivo;

    public DiscoRigido(boolean Salvar, String TipoArquivo) {
        this.Salvar = false;
        this.TipoArquivo = TipoArquivo;
    }

    public boolean getSalvar() {
        return Salvar;
    }

    public void setSalvar(boolean Salvar) {
        if (Salvar == false) {
            System.out.println(TipoArquivo+ ": Salva");
        }
        else {
            System.out.println(TipoArquivo+ ": Já está salvo");
        }
        this.Salvar = Salvar;
    }

    public String getTipoArquivo() {
        return TipoArquivo;
    }

    public void setTipoArquivo(String TipoArquivo) {
        this.TipoArquivo = TipoArquivo;
    }
    
    
    @Override
    public void armazenarDados(String dados) {
        System.out.println(TipoArquivo);
        System.out.println("Descrição: \n");
        System.out.println("-" +dados);
    }

    @Override
    public void recuperarDados() {
        if (Salvar == true) {
            System.out.println(TipoArquivo+ ": Foi recuperado");
        }
        else {
            System.out.println("Não foi possivel recuperar o Arquivo de " +TipoArquivo);
        }
    }
}
