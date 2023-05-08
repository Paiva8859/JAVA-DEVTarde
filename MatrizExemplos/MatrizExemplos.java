package MatrizExemplos;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplos {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        int tab[][] = new int[10][9];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                tab[i][j] = rd.nextInt(9);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 9; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println(" | ");
        }
    }

    public void exercicio2() {
        int tab[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println(" | ");
        }
    }

    public void exercicio3() {
        int tab[][] = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tab[i][j] = rd.nextInt(9);
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 4; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println(" | ");
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 4; j++) {
                System.out.print(tab[j][i] + " ");
            }
            System.out.println(" | ");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    soma += tab[i][j];
                }
            }
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + soma);
    }

    public void exercicio4() {
        int tab[][] = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tab[i][j] = rd.nextInt(9);
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 4; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println(" | ");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j) {
                    soma += tab[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);

        soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j) {
                    soma += tab[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos abaixo da diagonal principal é: " + soma);
    }
}
