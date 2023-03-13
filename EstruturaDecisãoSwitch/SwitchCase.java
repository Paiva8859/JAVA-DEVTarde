package EstruturaDecisãoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma letra");
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
            default:
                System.out.println(letra + " é uma consoante");
                break;
        }
    }

    public void mes() {
        System.out.println("Digite um número");
        String numero = sc.nextLine();
        switch (numero) {
            case "1":
            System.out.println("O número "+numero+" representa o mês de janeiro");
            break;
            case "2":
            System.out.println("O número "+numero+" representa o mês de fevereiro");
            break;
            case "3":
            System.out.println("O número "+numero+" representa o mês de março");
            break;
            case "4":
            System.out.println("O número "+numero+" representa o mês de abril");
            break;
            case "5":
            System.out.println("O número "+numero+" representa o mês de maio");
            break;
            case "6":
            System.out.println("O número "+numero+" representa o mês de junho");
            break;
            case "7":
            System.out.println("O número "+numero+" representa o mês de julho");
            break;
            case "8":
            System.out.println("O número "+numero+" representa o mês de agosto");
            break;
            case "9":
            System.out.println("O número "+numero+" representa o mês de setembro");
            break;
            case "10":
            System.out.println("O número "+numero+" representa o mês de outubro");
            break;
            case "11":
            System.out.println("O número "+numero+" representa o mês de novembro");
            break;
            case "12":
            System.out.println("O número "+numero+" representa o mês de desembro");
            break;
        }
    }

}
