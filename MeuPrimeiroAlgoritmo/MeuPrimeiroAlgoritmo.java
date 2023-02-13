package MeuPrimeiroAlgoritmo;

/**
 * MeuPrimeiroAlgoritmo
 */
public class MeuPrimeiroAlgoritmo {

    public static void main(String[] args) {
        System.out.println("CalculoGastosDeViagem");
        int distanciaPercorrida = 150;
        double precoDoCombustivel = 1.50;
        int rendimentoDoAutomovel = 15;
        double precoDoPedagio = 3.80;
        int numeroDePedagios = 3;
        double gastoComCombustivel = distanciaPercorrida/rendimentoDoAutomovel*precoDoCombustivel;
        double gastoComPedagio = precoDoPedagio*numeroDePedagios;
        double gastoTotal = gastoComPedagio+gastoComCombustivel;
        System.out.println("O Gasto Total Será De:");
        System.out.println(gastoTotal+"reais");


    }
}
    