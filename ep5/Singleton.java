public class Singleton{
	public static Singleton instancia;
	private Singleton(){
	}
	public static Singleton getInstancia(){
		if(instancia == null)
			instancia = new Singleton();
		return instancia;
	}
}
