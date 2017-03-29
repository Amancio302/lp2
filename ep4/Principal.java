public class Principal{
	public static void main(String [] args){
		Exemplo e1 = new Exemplo();
		Exemplo e2 = new Exemplo();
		Exemplo e3 = new Exemplo();
		System.out.println(Exemplo.x);
		Exemplo.dec();
		System.out.println(Exemplo.x);
		e1.incrementar();
		System.out.println(Exemplo.x);
	}
}
