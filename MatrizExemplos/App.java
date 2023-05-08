package MatrizExemplos;

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
                    MatrizExemplos obj1 = new MatrizExemplos();
                    obj1.exercicio1();
                    break;

                case 2:
                    MatrizExemplos obj2 = new MatrizExemplos();
                    obj2.exercicio2();
                    break;

                    case 3:
                        MatrizExemplos obj3 = new MatrizExemplos();
                        obj3.exercicio3();
                        break;
                    
                    case 4:
                        MatrizExemplos obj4 = new MatrizExemplos();
                        obj4.exercicio4();
                        break;
            }
        }
        sc.close();
    }
}
