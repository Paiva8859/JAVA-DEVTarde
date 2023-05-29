package POOInterface;

public class Trapezio implements FigurasGeometricas{
    int altura;
    int base1;
    int base2;
    int lado1;
    int lado2;

    

    public Trapezio(int altura, int base1, int base2, int lado1, int lado2) {
        this.altura = altura;
        this.base1 = base1;
        this.base2 = base2;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        int area = (base1+base2)*altura/2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "trapezio";
    }

    @Override
    public double getPerimetro() {
        int perimetro = lado1+lado2+base1+base2;
        return perimetro;
    }


}
