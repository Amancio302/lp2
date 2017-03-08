package FigurasGeometricas;

public class Quadrado extends FigurasGeometricas{
    private double base;
    public void setValues(double base){
        this.base = base;
    }
    public double calcularPerimetro(){
        this.perimetro = this.base*4;
        return this.perimetro;
    }
    public double calcularArea(){
        this.area = this.base*2;
        return this.area;
    }
}
