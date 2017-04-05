public class Main{
	public static void main(String[] args){
		Singleton ex1 = Singleton.getInstancia();
		Singleton ex2 = Singleton.getInstancia();
		Singleton ex3 = Singleton.getInstancia();
		Singleton ex4 = Singleton.getInstancia();
		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex3);
		System.out.println(ex4);
	}
}
