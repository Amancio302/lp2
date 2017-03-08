public class Principal {
    public static void main(String[] args){
        Quadrado q1 = new Quadrado();
        Triangulo t1 = new Triangulo();
        Circunferencia c1 = new Circunferencia();
        Retangulo r1 = new Retangulo();
        Trapezio tp1 = new Trapezio();
        q1.setValues(2); //base
        t1.setValues(2, 2); //base e altura
        c1.setValues(2); //diametro
        r1.setValues(4, 2); //base e altura
        tp1.setValues(4, 2, 2); //base maior, base menor e altura
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
        System.out.println(t1.calcularArea());
        System.out.println(t1.calcularPerimetro());
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(tp1.calcularArea());
        System.out.println(tp1.calcularPerimetro());
    }
}
