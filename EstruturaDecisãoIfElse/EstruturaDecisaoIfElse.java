package EstruturaDecisãoIfElse;

import java.util.Scanner;

public class EstruturaDecisaoIfElse {
    Scanner sc = new Scanner(System.in);

    public void decisaoIfElse() {
        System.out.println("Informe o preço do produto");
        double precoProduto = sc.nextDouble();
        double desconto;
        if (precoProduto>=300){
            desconto = 15;
        }else
        if (precoProduto >= 200) {
            desconto = 10;
        }else
        if (precoProduto >= 100) {
            desconto = 5;
        }else {desconto = 0;}
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do produto é: R$ " + precoFinal);
    }
}
