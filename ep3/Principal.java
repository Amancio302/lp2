import  java.util.ArrayList;

public class Principal{
	public static void main(String[] args){
		Aluno aux;
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		if(alunos.isEmpty())
			System.out.println("Vazia");
		else
			System.out.println("Não vazia");
		for(int i = 5; i > 0; i--){
			aux = new Aluno();
			aux.setIdade(i);
			aux.setNome("José");
			alunos.add(aux);
		}
		if(alunos.isEmpty())
			System.out.println("Vazia");
		else
			System.out.println("Não vazia");
		System.out.println("Tamanho: " + alunos.size());
		System.out.println(alunos);
		System.out.println(alunos.get(0).getIdade());
	}
}
