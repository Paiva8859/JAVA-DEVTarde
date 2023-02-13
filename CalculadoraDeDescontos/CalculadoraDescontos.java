import javax.swing.plaf.synth.SynthScrollBarUI;

public class CalculadoraDescontos {
    public void calcula20(){
System.out.println("==================");
double precoProduto;
precoProduto = 200;
System.out.println("O preco do produto é de"+precoProduto+"reais");
double percentualDesconto = 10;
percentualDesconto = 20;
System.out.println("O desconto será de"+percentualDesconto+"%");
double desconto = precoProduto*percentualDesconto/100;
double precoComDesconto = precoProduto-desconto;
System.out.println("com desconto, o produto sai por R$"+precoComDesconto+".");
System.out.println("fim!");
System.out.println("==================");
    }
public void calcula30(){
    System.out.println("==================");
    double precoProduto;
    precoProduto = 200;
    System.out.println("O preco do produto é de"+precoProduto+"reais");
    double percentualDesconto = 10;
    percentualDesconto = 30;
    System.out.println("O desconto será de"+percentualDesconto+"%");
    double desconto = precoProduto*percentualDesconto/100;
    double precoComDesconto = precoProduto-desconto;
    System.out.println("com desconto, o produto sai por R$"+precoComDesconto+".");
    System.out.println("fim!");
    System.out.println("==================");
    }
}
