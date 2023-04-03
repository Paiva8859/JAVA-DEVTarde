package Vetores;

import java.util.Scanner;

public class Vetores {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int c1 = 1;
        int c2 = 0;
        int vetorInt[] = new int[5];

        while (c1 <= 5) {
            System.out.println("Insira o " + c1 + "° número");
            vetorInt[c2] = sc.nextInt();
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        while (c1 <= 5) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " é: " + vetorInt[c2]);

            c1++;
            c2++;
        }

    }

    public void exercicio2() {
        int c1 = 1;
        int c2 = 0;
        double vetorInt[] = new double[10];

        while (c1 <= 10) {
            System.out.println("Insira o " + c1 + "° número");
            vetorInt[c2] = sc.nextInt();
            c1++;
            c2++;
        }

        c1 = 10;
        c2 = 9;

        while (c2 >= 0) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " é: " + vetorInt[c2]);

            c1--;
            c2--;
        }

    }

    public void exercicio3() {
        int A[] = new int[5];
        int B[] = new int[5];
        int c1 = 1;
        int c2 = 0;

        while (c2 <= 4) {
            System.out.println("Insira o " + c1 + "° número");
            A[c2] = sc.nextInt();
            B[c2] = A[c2];
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor A================ ");
        while (c2 <= 4) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor A é: " + A[c2]);
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor B================ ");
        while (c2 <= 4) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor B é: " + B[c2]);
            c1++;
            c2++;
        }
    }

    public void exercicio4() {
        int A[] = new int[8];
        int B[] = new int[8];
        int c1 = 1;
        int c2 = 0;

        while (c2 <= 7) {
            System.out.println("Insira o " + c1 + "° número");
            A[c2] = sc.nextInt();
            B[c2] = A[c2] * 2;
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor A================ ");
        while (c2 <= 7) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor A é: " + A[c2]);
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor B================ ");
        while (c1 <= 7) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor B é: " + B[c2]);
            c1++;
            c2++;
        }
    }

    public void exercicio5() {
        int A[] = new int[15];
        int B[] = new int[15];
        int c1 = 1;
        int c2 = 0;

        while (c2 <= 14) {
            System.out.println("Insira o " + c1 + "° número");
            A[c2] = sc.nextInt();
            B[c2] = A[c2] * A[c2];
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor A================ ");
        while (c2 <= 14) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor A é: " + A[c2]);
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor B================ ");
        while (c2 <= 14) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor B é: " + B[c2]);
            c1++;
            c2++;
        }
    }


    public void exercicio6() {
        double A[] = new double[15];
        double B[] = new double[15];
        int c1 = 1;
        int c2 = 0;

        while (c2 <= 14) {
            System.out.println("Insira o " + c1 + "° número");
            A[c2] = sc.nextInt();
            B[c2] = Math.sqrt(A[c2]);
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor A================ ");
        while (c2 <= 14) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor A é: " + A[c2]);
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor B================ ");
        while (c2 <= 14) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor B é: " + B[c2]);
            c1++;
            c2++;
        }
    }



    public void exercicio7() {
        double A[] = new double[10];
        double B[] = new double[10];
        int c1 = 1;
        int c2 = 0;

        while (c2 <= 9) {
            System.out.println("Insira o " + c1 + "° número");
            A[c2] = sc.nextInt();
            B[c2] = A[c2] * c2;
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor A================ ");
        while (c2 <= 9) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor A é: " + A[c2]);
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor B================ ");
        while (c2 <= 9) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor B é: " + B[c2]);
            c1++;
            c2++;
        }
    }

    public void exercicio8() {
        double A[] = new double[10];
        double B[] = new double[10];
        double C[] = new double[10];
        int c1 = 1;
        int c2 = 0;

        while (c2 <= 9) {
            System.out.println("Insira o " + c1 + "° número");
            A[c2] = sc.nextInt();
            B[c2] = A[c2];
            C[c2] = A[c2] + B[c2];
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor A================");
        while (c2 <= 9) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor A é: " + A[c2]);
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor B================ ");
        while (c2 <= 9) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor B é: " + B[c2]);
            c1++;
            c2++;
        }

        c1 = 1;
        c2 = 0;

        System.out.println("================Vetor C================ ");
        while (c2 <= 9) {
            System.out.println("O valor da " + c1 + "° posição índice " + c1 + " do vetor C é: " + C[c2]);
            c1++;
            c2++;
        }
    }
}