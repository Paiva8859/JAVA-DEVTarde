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
            System.out.println("Digite o valor da posição " + i + " do vetor");
            vetor[i] = sc.nextInt();
        }

        for (int i = 9; i > 0; i--) {
            System.out.println("O valor da " + i + "° posição índice " + i + " é: " + vetor[i]);
        }
    }

    public void exercicio3() {
        double notas[] = new double[4];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " do aluno");
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " = " + notas[i]);
            media += notas[i];
        }

        media = media / notas.length;
        System.out.println("A media do aluno é: " + media);
    }

    public void exercicio4() {
        int n = 0;
        String consoantes[] = new String[10];

        for (int i = 0; i < consoantes.length; i++) {
            System.out.println("Insira a letra n° " + (i+1));
            consoantes[i] = sc.nextLine();
        }

        for (int i = 0; i < consoantes.length; i++) {
           switch (consoantes[i]) {
            case "a":
                n++;
                break;
            
            case "e":
                n++;
                break;

                case "i":
                n++;
                break;
            
            case "o":
                n++;
                break;

            case "u":
                n++;
                break;
           }
        }

        System.out.println("O n° de consoantes inseridas é: " + (10-n));

        System.out.println("As consoantes inseridas foram:");
        for (int i = 0; i < consoantes.length; i++) {
            switch (consoantes[i]) {
                case "a":
                    break;
                
                case "e":
                    n++;
    
                    case "i":
                    break;
                
                case "o":
                    break;
    
                case "u":
                    break;

                default:
                    System.out.println(consoantes[i]);
               }
        }
    }

    public void exercicio5() {
        double n[] = new double[20];
        double par[] = new double[20];
        double impar[] = new double[20];
        int nPar = 0;
        int nImpar = 0;


        for (int i = 0; i < n.length; i++) {
            System.out.println("Insira o " + (i+1) + "° numero");
            n[i] = sc.nextDouble();

            if (n[i] % 2 == 0) {
                par[nPar] = n[i];
                nPar++;
            }
            else{
                impar[nImpar] = n[i];
                nImpar++;
            }
        }

        System.out.println("=====================================================================================");
        System.out.println("Os numeros inseridos são:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }


        if (nPar > 0){
            System.out.println("=====================================================================================");
            System.out.println("Os números pares inseridos são:");
            for (int i = 0; i < nPar; i++) {
                System.out.println(par[i]);
            }
        }
        else {
            System.out.println("Não foram inseridos numeros pares");
        }

        if (nImpar > 0) {
            System.out.println("=====================================================================================");
            System.out.println("Os numeros impares inseridos são:");
            for (int i = 0; i < nImpar; i++) {
                System.out.println(impar[i]);
            }
        } 
        else {
            System.out.println("não foram inseridos numeros impares");
        }
    }

    public void exercicio6() {
        
    }
}
