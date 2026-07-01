package PROVA.MundoMagia;

public class Bruxo extends varinha{
    private String Nome;
    private varinha varinha;

    public Bruxo(String Nome, varinha varinha, String Madeira, String Nucleo) {
        super(Madeira, Nucleo);
        this.Nome = Nome;
        this.varinha = varinha;
    }


    
    public void lancarFeitico(String feitico){
        System.out.println(Nome+ " Agitou a sua varinha de " +varinha);
        System.out.println("e lançou: " +feitico);
    }
    
}
