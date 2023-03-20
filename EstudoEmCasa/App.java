package EstudoEmCasa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual Objeto executar?");
        String exe = sc.nextLine();

        switch (exe) { 

            case "1":
                Exercicios obj1 = new Exercicios();
                obj1.exercicio1();
            break;

            case "2":
                Exercicios obj2 = new Exercicios();
                obj2.exercicio2();
            break;
                
            case "3":
                Exercicios obj3 = new Exercicios();
                obj3.exercicio3();
            break;

            case "4": 
                Exercicios obj4 = new Exercicios();
                obj4.exercicio4();
            break;
                
            case "5":
                Exercicios obj5 = new Exercicios();
                obj5.exercicio5();
            break;    
            
            case "6":
                Exercicios obj6 = new Exercicios();
                obj6.exercicio6();
            break;

        }

        sc.close();
    }
}
