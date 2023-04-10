package LacoRepeticaoWhile;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int exe = 1;
        while (exe > 0) {
            System.out.println("Qual Objeto executar? Para cancelar digite 0");
            exe = sc.nextInt();

            switch (exe) {

                case 1:
                    LacoRepeticaoWhile obj1 = new LacoRepeticaoWhile();
                    obj1.exercicio1();
                    break;

                case 2:
                    LacoRepeticaoWhile obj2 = new LacoRepeticaoWhile();
                    obj2.exercicio2();
                    break;

                case 3:
                    LacoRepeticaoWhile obj3 = new LacoRepeticaoWhile();
                    obj3.exercicio3();
                    break;
            }
        }

        sc.close();
    }
}
