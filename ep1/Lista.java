class No{
	private int x;
	private No prox, antes;
	public No(){
		this.antes = null;
		this.prox = null;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setProx(No prox){
		this.prox = prox;
	}
	public void setAntes(No antes){
		this.antes = antes;
	}
	public int getX(){
		return this.x;
	}
	public No getProx(){
		return this.prox;
	}
	public No getAntes(){
		return this.antes;
	}
}

class Lista{
	No topo;
	No calda;
	int cont;
	public Lista(){
		this.topo = new No();
		this.calda = new No();
		this.cont = 0;
		this.topo = null;
		this.calda = null;
	}
	public void inserir(int x){
		No aux = new No();
		No aux2 = new No();
		aux.setX(x);
		cont++;
		if(topo == null){
			topo = aux;
			calda = aux;
		}
		else{
			aux2 = topo.getProx();
			for(int i = 0; i < cont; i++){
				if(aux2.getProx() == null){
					aux2.setProx(aux);
				aux.setAntes(aux2);
				aux.setProx(null);
				calda = aux;
				}
				else{
					aux2 = aux2.getProx();
				}
			}
		}
	}
	public void exibir(){
		No aux = new No();
		aux = topo;
		int x;		
		for(int i = 0; i < cont; i++){
			System.out.println(aux.getX());
			aux = aux.getProx();
		}
	}
}

