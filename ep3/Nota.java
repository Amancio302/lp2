public class Nota{
	private double valor;
	private Aluno aluno;
	private Disciplina disciplina;
	public Nota(double valor, Aluno aluno, Disciplina disciplina){
		this.valor = valor;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	public double getValor(){
		return this.valor;
	}
	public Aluno getAluno(){
		return this.aluno;
	}
	public Disciplina getDisciplina(){
		return this.disciplina;
	}
}
