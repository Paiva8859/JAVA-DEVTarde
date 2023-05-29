package POOInterface;

public class Retangulo implements FigurasGeometricas {
    int altura;
    int base;

    @Override
    public double getArea() {
        int area = base*altura;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "retangulo";
    }

    @Override
    public double getPerimetro() {
        int perimetro = (altura*2)+(base*2);
        return perimetro;
    }

    public Retangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    

}
