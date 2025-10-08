package prova1606;

public class Aluno {
	
	String nomeAluno;
	int matricula;
	String cpf;
	String Curso;
	
	public Aluno(String nomeAluno, int matricula, String cpf, String curso) {
		
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.cpf = cpf;
		Curso = curso;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getMatricula() {
		return matricula;
	}
	void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public void verInfo() {
		System.out.println("Nome do aluno: " + nomeAluno + " matricula: " + matricula + " Curso: ");
	}
}
