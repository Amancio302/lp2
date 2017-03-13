import  java.util.ArrayList;
import java.util.Collections;

public class Principal{
	public static void main(String[] args){
		ArrayList<Nota> notas = new ArrayList<Nota>();
		Disciplina lp2 = new Disciplina("Lp2", "Herbert");
		Disciplina web = new Disciplina("Web", "Marcelo");
		Aluno a1 = new Aluno("João", 17);
		Aluno a2 = new Aluno("Matheus", 17);
		Aluno a3 = new Aluno("Rodrigo", 17);
		Aluno a4 = new Aluno("Wagner", 16);
		Aluno a5 = new Aluno("José", 18);	
		notas.add(new Nota(10, a1, lp2));
		notas.add(new Nota(7, a1, web));
		notas.add(new Nota(10, a2, lp2));
		notas.add(new Nota(8, a2, web));
		notas.add(new Nota(7, a3, lp2));
		notas.add(new Nota(6, a3, web));
		notas.add(new Nota(3, a4, lp2));
		notas.add(new Nota(3, a4, web));
		notas.add(new Nota(9, a5, lp2));
		notas.add(new Nota(9, a5, web));
	}
}
