public class Circunferencia extends FigurasGeometricas{
    private double diametro;
    public void setValues(double diametro){
        this.diametro = diametro;
    }
    public double calcularPerimetro(){
        this.perimetro = this.diametro * Math.PI;
        return this.perimetro;
    }
    public double calcularArea(){
        this.area = Math.pow((this.diametro)/2, 2) * Math.PI;
        return this.area;
    }
}
