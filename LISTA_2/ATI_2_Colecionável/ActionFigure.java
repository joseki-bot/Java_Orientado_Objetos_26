package LISTA.LISTA_2.ATI_2_Colecionável;
/*
2. Action Figure Colecionável (Marvel / DC)
Crie uma classe ActionFigure com os atributos personagem (String), 
tamanhoEmCm (double) e condicaoPintura (int).
    
    • Aplique o encapsulamento (atributos privados).

    • No método setCondicaoPintura(int nota), adicione uma validação de segurança: a nota
da pintura deve ser obrigatoriamente entre 0 e 100 (representando a porcentagem de
conservação da peça). Se o valor passado for inválido, ajuste automaticamente para
100 (figura impecável) e exiba um aviso de erro no console.
*/
public class ActionFigure {
String Personagem;
double TamanhoEmCm;
int CondiçãoPintura;

    public ActionFigure(String Personagem, double TamanhoEmCm, int CondiçãoPintura) {
        this.Personagem = Personagem;
        this.TamanhoEmCm = TamanhoEmCm;
        //this.CondiçãoPintura = CondiçãoPintura;
        setCondiçãoPintura(CondiçãoPintura);
    }

    public String getPersonagem() {
        return Personagem;
    }
    public void setPersonagem(String Personagem) {
        this.Personagem = Personagem;
    }

    public double getTamanhoEmCm() {
        return TamanhoEmCm;
    }
    public void setTamanhoEmCm(double TamanhoEmCm) {
        this.TamanhoEmCm = TamanhoEmCm;
    }

    public int getCondiçãoPintura() {
        return CondiçãoPintura;
    }
    public void setCondiçãoPintura(int CondiçãoPintura) {
        if (CondiçãoPintura <= 30) {
            System.out.println("A qualidade da Pintura está em " +CondiçãoPintura+ " %");
            System.out.println("Qualidade Ruim");
            this.CondiçãoPintura = CondiçãoPintura;
        }
        else if (CondiçãoPintura <= 70) {
            System.out.println("A qualidade da Pintura está em " +CondiçãoPintura+ " %");
            System.out.println("Qualidade Boa");
            this.CondiçãoPintura = CondiçãoPintura;
        }
        else if (CondiçãoPintura <= 90) {
            System.out.println("A qualidade da Pintura está em " +CondiçãoPintura+ " %");
            System.out.println("Qualidade Exelente");
            this.CondiçãoPintura = CondiçãoPintura;
        }
        else if (CondiçãoPintura <= 100) {
            System.out.println("A qualidade da Pintura está em " +CondiçãoPintura+ " %");
            System.out.println("Qualidade IMPECÁVEL");
            this.CondiçãoPintura = CondiçãoPintura;
        }
        else {
            System.out.println("ERRO !!!");
            System.out.println("Qualidide de Pintura não intentificada");
            System.out.println("Motificando para 100%");
            this.CondiçãoPintura = 100;
        }
    }
        
    void Mostrar() {
        CadastrandoBoneco CB = new CadastrandoBoneco();
        System.out.println("Personagem: " +this.Personagem);
        System.out.printf("Tamanho: %.0f" ,this.TamanhoEmCm); 
        System.out.println("Cm \n Qualidade da Pintura: " +this.CondiçãoPintura+ "%");
    }
}