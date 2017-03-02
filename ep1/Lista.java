class No{
	private int valor;
	private No proximo, anterior;
	public void inserirValor(int valor){
		this.valor = valor;
	}
	public void inserirProximo(No proximo){
		this.proximo = proximo;
	}
	public void inserirAnterior(No anterior){
		this.anterior = anterior;
	}
	public int retornarValor(){
		return this.valor;
	}
	public No retornarProximo(){
		return this.proximo;
	}
	public No retornarAnterior(){
		return this.anterior;
	}
}

public class Lista{
	private No primeiro = new No, ultimo = new No, valor = new No;
	public void inserir(int valor){
		No auxiliar = new No;		
		if(primeiro.retornarProximo() == null){
			primeiro.inserirProximo(this.valor);
		}
		this.valor.inserirValor(valor);
		auxiliar.inserirAnterior(ultimo.retornarAnterior());
		ultimo.inserirAnterior(this.valor);
		auxiliar.inserirProximo(ultimo);
	}
	public void exibirLista(){
		No auxiliar = new No;
		auxiliar.inserirValor(primeiro.retornarValor());
		auxiliar.inserirProximo(primeiro.retornarProximo());
		while(auxiliar.retornarProximo() != null){
			System.out.println(auxiliar.retornarValor() + ", ");
			auxiliar.inserirValor(auxiliar.retornarProximo().retornarValor());
			auxiliar.inserirProximo(auxiliar.retornarProximo().retornarProximo());
		}
	}
}
