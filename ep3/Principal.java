import  java.util.ArrayList;
import java.util.Collections;

public class Principal{
	public static void main(String[] args){
            //Criando a ArrayList do tipo "Nota", com o nome de "notas"
            ArrayList<Nota> notas = new ArrayList<Nota>();
            
            //Criando dois nós do tipo "Disciplina"
	    Disciplina lp2 = new Disciplina("Lp2", "Herbert");
	    Disciplina web = new Disciplina("Web", "Marcelo");
            
            //Criando cinco nós do tipo "Aluno"
	    Aluno a1 = new Aluno("João", 17);
	    Aluno a2 = new Aluno("Matheus", 17);
	    Aluno a3 = new Aluno("Rodrigo", 17);
	    Aluno a4 = new Aluno("Wagner", 16);
	    Aluno a5 = new Aluno("José", 18);
            
            //Adicionando todos os dados na ArrayList
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
            
            //Ordenando a ArrayList, utilizando como base a atributo "valor"
            Collections.sort(notas);
            
            //Processo para exibir a maior nota registrada e seu(s) dono(s)
            int i = 0;
            System.out.println("Maior nota geral: " + notas.get(i).getValor());
            while(i < 9){
                System.out.println("\nMatéria: " + notas.get(i).getDisciplina().getNome() + "\nAplicada pelo professor: " + notas.get(i).getDisciplina().getProfessor() + "\nAluno: " + notas.get(i).getAluno().getNome());
                i++;
                if(notas.get(i-1).getValor() != notas.get(i).getValor())
                    i = 10;
            }
            
            //Processo para exibir a maior nota de Lp2 registrada e seu(s) dono(s)
            i = 0;
            System.out.println("\nMaior nota de Lp2: ");
            while(i < 4){
                if(notas.get(i).getDisciplina().getNome() != lp2.getNome())
                    i++;
                else{
                    System.out.println("\nNota: " + notas.get(i).getValor() + "\nAluno: " + notas.get(i).getAluno().getNome());
                    if(notas.get(i).getValor() == notas.get(i+1).getValor())
                        i++;
                    else
                        i = 4;
                }
            }
            
            //Processo para exibir a maior nota de Web registrada e seu(s) dono(s)
            i = 0;
            System.out.println("\nMaior nota de Web: ");
            while(i < 4){
                if(notas.get(i).getDisciplina().getNome() != web.getNome())
                    i++;
                else{
                    System.out.println("\nNota: " + notas.get(i).getValor() + "\nAluno: " + notas.get(i).getAluno().getNome());
                    if(notas.get(i).getValor() == notas.get(i+1).getValor())
                        i++;
                    else
                        i = 4;
                }
            }
    }
}
