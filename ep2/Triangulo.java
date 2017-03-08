public class Triangulo extends FigurasGeometricas{
    private double base;
    private double altura;
    public void setValues(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularPerimetro(){
        double aux;
        aux = Math.sqrt((Math.pow((base)/2, 2)+Math.pow(altura, 2)));
        this.perimetro = aux*2 + base; 
        return this.perimetro;
    }
    public double calcularArea(){
        this.area = this.base * this.altura / 2;
        return this.area;
    }
}
