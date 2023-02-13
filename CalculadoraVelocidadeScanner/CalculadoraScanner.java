package CalculadoraVelocidadeScanner;

import java.util.Scanner;

public class CalculadoraScanner {
    public void calcular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a distância percorrida");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("A distância percorrida foi de" + distanciaPercorrida + "km");
        System.out.println("Informe o tempo gasto n viagem");
        double tempoGasto = sc.nextDouble();
        System.out.println("O tempo gasto na viagem foi de" + tempoGasto + "horas");
        sc.close();
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("A velocidade média foi de" + velocidadeMedia + "km/h");
    }
}
