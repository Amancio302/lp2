public class Ponto{
	private double x, y;
	public Ponto(){
		System.out.println("Construtor 1 " + this);
	}
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
		System.out.println("Contrutor 2 - Valores: \nX: " + this.x + "\nY: " + this.y);
	}
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public static void main(String[] args){
		Ponto p1 = new Ponto(20, 15);
		Ponto p2 = new Ponto(30, 10);
		Ponto p3 = new Ponto();
		Ponto p4 = new Ponto();
		double distancia, y12, x12;
		y12 = p1.getY() - p2.getY();
		x12 = p1.getX() - p2.getX();
		distancia = Math.sqrt((x12*x12)+(y12*y12));
		System.out.println("Distancia entre os pontos p1 e p2 é: " + distancia);
		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		System.out.println("r1.p1.x = " + r1.getP1().getX() + "\nr1.p1.y = " + r1.getP1().getY() + "\nr1.p2.x = " + r1.getP2().getX() + "\nr1.p2.y = " + r1.getP2().getY());
		double a = 	r1.sobarea();
		System.out.println(a);
	}
}
