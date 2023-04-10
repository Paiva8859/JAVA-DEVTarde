package LacoRepeticaoFor;

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
                    LacoRepeticaoFor obj1 = new LacoRepeticaoFor();
                    obj1.exercicio1();
                    break;

                case 2:
                    LacoRepeticaoFor obj2 = new LacoRepeticaoFor();
                    obj2.exercicio2();
                    break;

            }
            
            sc.close();
        }
    }
}
