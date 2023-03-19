package DesafioNumeroPrimo;

import java.util.Scanner;

public class Desafio {
    Scanner sc = new Scanner(System.in);

    public void desafio() {
        int numero;
        int divisor = 2;
        int contador = 0;
        System.out.println("informe um número inteiro e positivo");
        numero = sc.nextInt();
        while (numero <= 0) {
            System.out.println("Favor informar um número positivo");
            numero = sc.nextInt();
        }

        /*Caso um número dividido por todos os números entre 2 e a metade do próprio número dê um resto diferente de 
        0 em todos os cálculos, o número é primo */
        
        while (divisor <= (numero / 2)) { 

            if (numero % divisor == 0) {
                contador += 1;
            }
            divisor += 1;
        }
        
        if (contador>0) {
            System.out.println("O número não é primo");
        }
        else {
            System.out.println("O número é primo");
        }
    }
}
