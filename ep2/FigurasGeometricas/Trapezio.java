package FigurasGeometricas;

public class Trapezio extends FigurasGeometricas{
    private double baseMenor;
    private double baseMaior;
    private double altura;
    public void setValues(double baseMaior, double baseMenor, double altura){
        if(baseMaior > baseMenor){    
            this.baseMaior = baseMaior;
            this.baseMenor = baseMenor;
            this.altura = altura;
        }
        else if(baseMaior == baseMenor)
            System.out.println("Valores inválidos: A base maior e a menor tem mesmo valor!");
        else
            System.out.println("Valores inválidos: A base maior tem valor inferior ao da base menor!");
    }
    public double calcularPerimetro(){
        double aux;
        aux = Math.sqrt(Math.pow(altura, 2) + Math.pow((baseMaior-baseMenor)/2, 2));
        this.perimetro = aux*2 + baseMaior + baseMenor;
        return this.perimetro;
    }
    public double calcularArea(){
        this.area = ((baseMaior + baseMenor) * altura)/2;
        return this.area;
    }
}
