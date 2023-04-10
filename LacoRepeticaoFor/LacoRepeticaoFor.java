package LacoRepeticaoFor;

import java.util.Scanner;

public class LacoRepeticaoFor {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        for (int i = 0; i < 10; i++) {
            System.out.println("O n° da iteração é: " + i);
        }
    }

    public void exercicio2() {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição "+ i + " do vetor");
            vetor[i] = sc.nextInt();
        }
    }
}
