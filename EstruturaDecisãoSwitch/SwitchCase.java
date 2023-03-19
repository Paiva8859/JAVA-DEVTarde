package EstruturaDecisãoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma letra para saber se é uma vogal ou consoante");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + " é uma vogal");
                break;
            case "e":
                System.out.println(letra + " é uma vogal");
                break;
            case "i":
                System.out.println(letra + " é uma vogal");
                break;
            case "o":
                System.out.println(letra + " é uma vogal");
                break;
            case "u":
                System.out.println(letra + " é uma vogal");
            case "A":
                System.out.println(letra + " é uma vogal");
                break;
            case "E":
                System.out.println(letra + " é uma vogal");
                break;
            case "I":
                System.out.println(letra + " é uma vogal");
                break;
            case "O":
                System.out.println(letra + " é uma vogal");
                break;
            case "U":
                System.out.println(letra + " é uma vogal");
                break;
            default:
                System.out.println(letra + " é uma consoante");
                break;
        }
        System.out.println("========================================");
    }

    public void mes() {
        System.out.println("Digite um número de 1 a 12 para saber qual mês ele representa.");
        String numero = sc.nextLine();
        switch (numero) {
            case "1":
                System.out.println("O número " + numero + " representa o mês de janeiro");
                break;
            case "2":
                System.out.println("O número " + numero + " representa o mês de fevereiro");
                break;
            case "3":
                System.out.println("O número " + numero + " representa o mês de março");
                break;
            case "4":
                System.out.println("O número " + numero + " representa o mês de abril");
                break;
            case "5":
                System.out.println("O número " + numero + " representa o mês de maio");
                break;
            case "6":
                System.out.println("O número " + numero + " representa o mês de junho");
                break;
            case "7":
                System.out.println("O número " + numero + " representa o mês de julho");
                break;
            case "8":
                System.out.println("O número " + numero + " representa o mês de agosto");
                break;
            case "9":
                System.out.println("O número " + numero + " representa o mês de setembro");
                break;
            case "10":
                System.out.println("O número " + numero + " representa o mês de outubro");
                break;
            case "11":
                System.out.println("O número " + numero + " representa o mês de novembro");
                break;
            case "12":
                System.out.println("O número " + numero + " representa o mês de dezembro");
                break;
            default:
                System.out.println("Você deve inserir um numero de 1 a 12 para saber qual mês ele representa");
                break;
        }
        System.out.println("========================================");
    }

    public void dia() {
        System.out.println("Insira um número de 1 a 7 para saber qual dia da semana ele representa");
        String numero = sc.nextLine();
        switch (numero) {
            case "1":
                System.out.println("O numero " + numero + " representa o domingo");
                break;
            case "2":
                System.out.println("O numero " + numero + " representa a segunda-feira");
                break;
            case "3":
                System.out.println("O numero " + numero + " representa a terça-feira");
                break;
            case "4":
                System.out.println("O numero " + numero + " representa a quarta-feira");
                break;
            case "5":
                System.out.println("O numero " + numero + " representa a quinta-feira");
                break;
            case "6":
                System.out.println("O numero " + numero + " representa a sexta-feira");
                break;
            case "7":
                System.out.println("O numero " + numero + " representa o sábado");
                break;
            default:
                System.out.println("Você deve inserir um número de 1 a 7 para saber qual dia da semana ele representa");
                break;
        }
    }
}
