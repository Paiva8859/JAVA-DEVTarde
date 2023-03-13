package AtividadesIfElse;

import java.util.Scanner;

/**
 * AtividadesIfElse
 */
public class AtividadesIfElse {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o primeiro número.");
        double numero1 = sc.nextDouble();
        System.out.println("Informe o segundo número.");
        double numero2 = sc.nextDouble();
        if (numero1 > numero2) {
            System.out.println(numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("Os dois números são iguais");
        }
        System.out.println("=================================");
    }

    public void exercicio2() {
        System.out.println("Informe seu ano de nascimento.");
        double anoDeNascimento = sc.nextDouble();
        double ano = 2023;
        double podeOuNaoVotar = ano - anoDeNascimento;
        if (podeOuNaoVotar >= 16) {
            System.out.println("Você poderá votar este ano.");
        } else if (podeOuNaoVotar < 16) {
            System.out.println("Você não poderá votar este ano.");
        }
        System.out.println("=================================");
    }

    public void exercicio3() {
        double senha = 1234;
        System.out.println("Insira a senha");
        double senhaInserida = sc.nextDouble();
        if (senha == senhaInserida) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        System.out.println("=================================");
    }

    public void exercicio4() {
        System.out.println("Quantas maçãs serão compradas?");
        double macas = sc.nextDouble();
        double preco = 0;
        if (macas >= 12) {
            preco = macas * 0.25;
        } else if (macas < 12) {
            preco = macas * 0.30;
        }
        System.out.println("Você pagará: R$ " + preco);
        System.out.println("=================================");
    }

    public void exercicio5() {
        System.out.println("Informe o primeiro número");
        double n1 = sc.nextDouble();
        System.out.println("Informe o segundo número");
        double n2 = sc.nextDouble();
        System.out.println("Informe o terceiro número");
        double n3 = sc.nextDouble();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Os numeros em ordem crescente ficam:" + n3 + ", " + n2 + ", " + n1);
        } else if (n1 > n3 && n1 > n2) {
            System.out.println("Os numeros em ordem crescente ficam:" + n2 + ", " + n3 + ", " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Os numeros em ordem crescente ficam:" + n3 + ", " + n1 + ", " + n2);
        } else if (n2 > n3 && n2 > n1) {
            System.out.println("Os numeros em ordem crescente ficam:" + n1 + ", " + n3 + ", " + n2);
        } else if (n3 > n2 && n3 > n1) {
            System.out.println("Os numeros em ordem crescente ficam:" + n1 + ", " + n2 + ", " + n3);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("Os numeros em ordem crescente ficam:" + n1 + ", " + n3 + ", " + n2);
        }
        System.out.println("=================================");
    }

    public void exercicio6() {
        System.out.println("Informe seu sexo, insira 1 para feminino ou 2 para masculino");
        double sexo = sc.nextDouble();
        System.out.println("Insira sua altura");
        double altura = sc.nextDouble();
        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é de: " + pesoIdeal + "Kg");
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é de: " + pesoIdeal + "Kg");
            System.out.println("=================================");
        }

    }

    public void exercicio7() {
        System.out.println("Informe a nota 1 do aluno");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota 2 do aluno");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2)/2;
        if (media>= 50) {
            System.out.println("A média do aluno é: " + media + " O aluno está aprovado por nota!");
        } else {
            System.out.println("A média do aluno é: " + media + " O aluno está reprovado por nota!");
        }
        
        System.out.println("Informe a frequência do aluno");
        double frequencia = sc.nextDouble();
        if (frequencia >=75) {
            System.out.println("O aluno está aprovado por frequência");
        } else {
        System.out.println("O aluno está reprovado por frequência");           
        }

        if (media >=50 && frequencia >= 75) {
            System.out.println("O aluno está aprovado no curso!");
        } else {
            System.out.println("O aluno está reprovado no curso!");
        }
    }
}