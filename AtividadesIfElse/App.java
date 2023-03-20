package AtividadesIfElse;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual objeto deseja executar?");
        String exe = sc.nextLine();

        switch (exe) {
            case "1":
                AtividadesIfElse obj1 = new AtividadesIfElse();
                obj1.exercicio1();
            break;

            case "2":
                AtividadesIfElse obj2 = new AtividadesIfElse();
                obj2.exercicio2();
            break;

            case "3":
                AtividadesIfElse obj3 = new AtividadesIfElse();
                obj3.exercicio3();
            break;
            
            case "4":
                AtividadesIfElse obj4 = new AtividadesIfElse();
                obj4.exercicio4();
            break;
                
            case "5":
                AtividadesIfElse obj5 = new AtividadesIfElse();
                obj5.exercicio5();
            break;
                
            case "6":
                AtividadesIfElse obj6 = new AtividadesIfElse();
                obj6.exercicio6(); 
            break;
                
            case "7":
                AtividadesIfElse obj7 = new AtividadesIfElse();
                obj7.exercicio7();
            break;
        }
        
        sc.close();

    }
}
