package PROVA.CaminhoDaForca;

public class MestreJedi extends Jedi{
    private String CorDOSabre;

    public MestreJedi(String CorDOSabre, String Nome, int NivelDaForca) {
        super(Nome, NivelDaForca);
        this.CorDOSabre = CorDOSabre;
    }

    
    public String getCorDOSabre() {
        return CorDOSabre;
    }
    public String getNome() {
        return Nome;
    }
    public int getNivelDaForca() {
        return NivelDaForca;
    }
    
    public void exibirMestre(){
        System.out.println("- - - - - - - - - - -");
        System.out.println("Nome: "+Nome);
        System.out.println("Nivel da Força: " +NivelDaForca);
        System.out.println("Cor do Sabre: " +CorDOSabre);
        System.out.println("- - - - - - - - - - -");
    }
    
    
    
}
