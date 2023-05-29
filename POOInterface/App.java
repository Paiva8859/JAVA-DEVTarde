package POOInterface;

import java.util.Scanner;
import java.lang.System;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(7);
        Retangulo figura2 = new Retangulo(5, 7);
        Trapezio figura3 = new Trapezio(8, 7, 6, 5, 4);

        Scanner sc = new Scanner(System.in);
        int exe = 1;
        while (exe > 0) {
            System.out.println("Qual o número da figura que deseja analisar? Para cancelar digite 0");
            exe = sc.nextInt();

            switch (exe) {

                case 1:

                    System.out.println("O nome da figura é: " + figura1.getNomeFigura() + ", a área da figura é: "
                            + figura1.getArea() + ", o perímetro da figura é: " + figura1.getPerimetro());
                    break;

                case 2:

                    System.out.println("O nome da figura é: " + figura2.getNomeFigura() + ", a área da figura é: "
                            + figura2.getArea() + ", o perímetro da figura é: " + figura2.getPerimetro());
                    break;

                case 3:

                    System.out.println("O nome da figura é: " + figura3.getNomeFigura() + ", a área da figura é: "
                            + figura3.getArea() + ", o perímetro da figura é: " + figura3.getPerimetro());
                    break;
            }
        }
        sc.close();
    }
}