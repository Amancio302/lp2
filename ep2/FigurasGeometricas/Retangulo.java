package FigurasGeometricas;

public class Retangulo extends FigurasGeometricas{
    private double base;
    private double altura;
    public void setValues(double base, double altura){
        if(base != altura){
            this.base = base;
            this.altura = altura;
        }
        else
            System.out.println("Valores inválidos: A base a altura tem mesmo valor!");
    }
    public double calcularPerimetro(){
        this.perimetro = this.altura*2 + this.base*2;
        return this.perimetro;
    }
    public double calcularArea(){
        this.area = this.base * this.altura;
        return this.area;
    }
}
