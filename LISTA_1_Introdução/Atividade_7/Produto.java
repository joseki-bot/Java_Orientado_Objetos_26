package LISTA_1_Introdução.Atividade_7;

public class Produto {
// 7. Crie uma classe Produto com os atributos nome (String), preco (double) e 
// quantidadeEmEstoque (int). Crie os métodos vender(int quantidade) e 
// reporEstoque(int quantidade) que atualizam a quantidade em estoque do produto.
 
String [] coisas =
{"Notebook", "Mouse", "Teclado", "Monitor", "Impressora", "Scanner", 
"Celular", "Carregador", "Fone de Ouvido", "Caixa de Som"};

double [] valor =
{3500.70, 79.90 ,150.50, 900.00, 650.87, 500.00, 1800.99, 59.99, 120.00, 250.00};

String Nome;
double Preço;
double Saldo;
int QuantidadeEmEstoque = 10;

void Vender() {
    System.out.println("Você vendeu " +Nome);
    System.out.println("Por R$ " +Preço);
    Saldo += Preço;
    QuantidadeEmEstoque --;
}
void reporEstoque() {
    System.out.println("Você ainda tem " +QuantidadeEmEstoque);
    System.out.println("De Produtos");
}

    
}
