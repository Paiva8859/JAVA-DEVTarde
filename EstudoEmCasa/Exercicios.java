package EstudoEmCasa;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        double resultado;
        double numero;
        System.out.println("Informe o número para saber seu valor ao quadrado");
        numero = sc.nextDouble();
        resultado = Math.pow(numero, 2); // operção exponencial Math.pow(base, expoente)
        System.out.println("O quadrado de " + numero + " é: " + resultado);
        System.out.println("===================================");
    }

    public void exercicio2() {
        double salario;
        double percentual;
        double aumento;
        System.out.println("Informe o salário");
        salario = sc.nextDouble();
        System.out.println("Informe o percentual de reajuste");
        percentual = sc.nextDouble();
        aumento = (percentual * salario) / 100;
        salario += aumento;
        System.out.println("O salário final será de: R$ " + salario);
        System.out.println("===================================");
    }

    public void exercicio3() {
        System.out.println("Informe o primeiro número");
        double n1 = sc.nextDouble();
        System.out.println("Informe o segundo número");
        double n2 = sc.nextDouble();
        System.out.println("Informe o terceiro número");
        double n3 = sc.nextDouble();

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println("Os numeros em ordem crescente ficam:" + n3 + ", " + n2 + ", " + n1);
        } else if (n1 > n3 && n1 > n2 && n3 > n2) {
            System.out.println("Os numeros em ordem crescente ficam:" + n2 + ", " + n3 + ", " + n1);
        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println("Os numeros em ordem crescente ficam:" + n3 + ", " + n1 + ", " + n2);
        } else if (n2 > n3 && n2 > n1 && n3 > n1) {
            System.out.println("Os numeros em ordem crescente ficam:" + n1 + ", " + n3 + ", " + n2);
        } else if (n3 > n2 && n3 > n1 && n2 > n1) {
            System.out.println("Os numeros em ordem crescente ficam:" + n1 + ", " + n2 + ", " + n3);
        } else if (n3 > n1 && n3 > n2 && n1 > n2) {
            System.out.println("Os numeros em ordem crescente ficam:" + n1 + ", " + n3 + ", " + n2);
        }
        System.out.println("=================================");
    }

    public void exercicio4() {
        double dividendo;
        double divisor;
        double resultado;
        System.out.println("Para calcular a divisão, insira o primeiro número (dividendo)");
        dividendo = sc.nextDouble();
        System.out.println("Para calcular a divisão, insira o segundo número (divisor)");
        divisor = sc.nextDouble();
        while (divisor == 0) {
            System.out.println("O divisor não pode ser igual a 0, digite outro número");
            divisor = sc.nextDouble();
        }

        resultado = dividendo / divisor;
        System.out.println("O resultado da divisão é: " + resultado);
        System.out.println("=================================");
    }

    public void exercicio5() {
        int numero;
        int contador = 0;
        int n = 1;

        while (n <= 10) {
            System.out.println("Insira o " + n + "° número");
            numero = sc.nextInt();
            n++;
            if (numero < 0) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Todos os números inseridos são positivos");
        } else if (contador == 10) {
            System.out.println("Todos os números inseridos são negativos");
        } else {
            System.out.println("A quantidade de números negativos inseridos é: " + contador);
        }
        System.out.println("=================================");
    }

    public void exercicio6() {
        double altura;
        double alto;
        double baixo;
        int contador = 1;

        System.out.println("Insira a altura da pessoa "+contador);

        contador ++;

        altura = sc.nextDouble();
        alto = altura;
        baixo = altura;

        while ( contador <= 15 ) {
            
           System.out.println("Insira a altura da pessoa "+ contador);
            altura = sc.nextDouble();
            
            if ( altura > alto ) {
                alto = altura;
            }

            if ( altura < baixo ) {
                baixo = altura;
            }
            
            contador ++;
        }

    } 
}