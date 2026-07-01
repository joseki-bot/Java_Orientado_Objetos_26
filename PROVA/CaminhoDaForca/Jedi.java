package PROVA.CaminhoDaForca;

public class Jedi {
    protected String Nome;
    protected int NivelDaForca;

    public Jedi(String Nome, int NivelDaForca) {
        this.Nome = Nome;
        this.NivelDaForca = NivelDaForca;
    }
    
    
    public void UsarAForca() {
        System.out.println(Nome+ " está se concentra-se na Força...");
    }
    
}
