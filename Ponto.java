public class Ponto{
	private double x, y;
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
		Ponto p1 = new Ponto();
		p1.setX(0);
		p1.setY(0);
		Ponto p2 = new Ponto();
		p2.setX(1);
		p2.setY(1);		
		Ponto p3 = new Ponto();
		p3 = p1;
		Ponto p4 = p3;
		double distancia, y12, x12;
		y12 = p1.getY() - p2.getY();
		x12 = p1.getX() - p2.getX();
		distancia = Math.sqrt((x12*x12)+(y12*y12));
		System.out.println(distancia);
	}
}
