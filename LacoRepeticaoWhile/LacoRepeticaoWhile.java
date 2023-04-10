package LacoRepeticaoWhile;

import java.util.Random;
import java.util.Scanner;

public class LacoRepeticaoWhile {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int i = 0;

        while (i < 999999999) {
            i++;
            System.out.println("O n° da iteração é: " + i );
        }
    }

    public void exercicio2() {
        int vetor[] = new int[10];

        int i = 0;

        while (i < 10) {
            System.out.println("Informe o  valor do índice " + i + " do vetor");
            vetor[i] = sc.nextInt();
            i++;
        }

        i = 0;

        while ( i < 10 ) {
            System.out.println("O valor da posição " + i + " do vetor é: " + vetor[i]);
            i++;
        }

    }

    public void exercicio3() {
        Random rd = new Random();
        int valorSorteado = rd.nextInt(100)+1;
        boolean tenteNovamente = true;
        double numeroDigitado;

        System.out.println("|=============================================================================================================|");
        System.out.println("|  Bem vindo ao Jogo dos Numeros, eu vou pensar em um número de 1 a 100 e você deve descobrir qual o número!  |");
        System.out.println("|=============================================================================================================|");

        while (tenteNovamente) {
            System.out.println("Digite um número");
            numeroDigitado = sc.nextInt();
            if (numeroDigitado == valorSorteado) {
                System.out.println("Parabéns, você acertou!");
                tenteNovamente = false;
            }
            else if (numeroDigitado - valorSorteado <= 1.5 && numeroDigitado - valorSorteado > 0 || valorSorteado - numeroDigitado > 0 && valorSorteado - numeroDigitado <= 1.5 ) {
                System.out.println("Quase acertou!");
                System.out.println("======================");
            }
            else if (numeroDigitado - valorSorteado <= 5 && numeroDigitado - valorSorteado > 0 || valorSorteado - numeroDigitado > 0 && valorSorteado - numeroDigitado <= 5) {
                System.out.println("Você está muito perto!");
                System.out.println("======================");
            }
            else if (numeroDigitado - valorSorteado <= 7 && numeroDigitado - valorSorteado > 0 || valorSorteado - numeroDigitado > 0 && valorSorteado - numeroDigitado <= 7) {
                System.out.println("Está quente!");
                System.out.println("======================");
            }
            else {
                System.out.println("Está frio!");
                System.out.println("======================");
            }
        }

    }


}
