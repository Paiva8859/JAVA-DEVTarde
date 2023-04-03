package Vetores;

import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int exe = 1;
        while (exe > 0) {
            System.out.println("Qual Objeto executar? Para cancelar digite 0");
            exe = sc.nextInt();

            switch (exe) {

                case 1:
                    Vetores obj1 = new Vetores();
                    obj1.exercicio1();
                    break;

                case 2:
                    Vetores obj2 = new Vetores();
                    obj2.exercicio2();

                    break;

                case 3:
                    Vetores obj3 = new Vetores();
                    obj3.exercicio3();
                    break;

                case 4:
                    Vetores obj4 = new Vetores();
                    obj4.exercicio4();
                    break;

                case 5:
                    Vetores obj5 = new Vetores();
                    obj5.exercicio5();
                    break;

                case 6:
                    Vetores obj6 = new Vetores();
                    obj6.exercicio6();
                    break;

                case 7:
                    Vetores obj7 = new Vetores();
                    obj7.exercicio7();
                    break;

                case 8:
                    Vetores obj8 = new Vetores();
                    obj8.exercicio8();
                    break;

            }
        }

        sc.close();
    }
}