package orientacaoobjetos;
import java.util.Scanner;

public class Aluno {
	
	Scanner scanner = new Scanner(System.in);
	
	private String nome;
	private double matricula;
	private String curso;
	private String disciplina1;
	private String disciplina2;
	private String disciplina3;
	private double nota1disciplina1;
	private double nota2disciplina1;
	private double nota3disciplina1;
	
	private double nota1disciplina2;
	private double nota2disciplina2;
	private double nota3disciplina2;
	
	private double nota1disciplina3;
	private double nota2disciplina3;
	private double nota3disciplina3;
	
	Aluno() { }
	
	Aluno(String nome, int matricula, String curso, String disciplina1, String disciplina2, String disciplina3, double nota1disciplina1, double nota2disciplina1, double nota3disciplina1, double nota1disciplina2, double nota2disciplina2, double nota3disciplina2, double nota1disciplina3, double nota2disciplina3, double nota3disciplina3) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplina1 = disciplina1;
		this.disciplina2 = disciplina2;
		this.disciplina3 = disciplina3;
		
		this.nota1disciplina1 = nota1disciplina1;
		this.nota2disciplina1 = nota2disciplina1;
		this.nota3disciplina1 = nota3disciplina1;
		
		this.nota1disciplina2 = nota1disciplina2;
		this.nota2disciplina2 = nota2disciplina2;
		this.nota3disciplina2 = nota3disciplina2;
		
		this.nota1disciplina3 = nota1disciplina3;
		this.nota2disciplina3 = nota2disciplina3;
		this.nota3disciplina3 = nota3disciplina3;
		double mediadisciplina1 = 0;
		double mediadisciplina2 = 0;
		double mediadisciplina3 = 0;
	}
	
	public Scanner getScanner() {
		return scanner;
	}


	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getMatricula() {
		return matricula;
	}


	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getDisciplina1() {
		return disciplina1;
	}


	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}


	public String getDisciplina2() {
		return disciplina2;
	}


	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}


	public String getDisciplina3() {
		return disciplina3;
	}


	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}


	public double getNota1disciplina1() {
		return nota1disciplina1;
	}


	public void setNota1disciplina1(double nota1disciplina1) {
		this.nota1disciplina1 = nota1disciplina1;
	}


	public double getNota2disciplina1() {
		return nota2disciplina1;
	}


	public void setNota2disciplina1(double nota2disciplina1) {
		this.nota2disciplina1 = nota2disciplina1;
	}


	public double getNota3disciplina1() {
		return nota3disciplina1;
	}


	public void setNota3disciplina1(double nota3disciplina1) {
		this.nota3disciplina1 = nota3disciplina1;
	}


	public double getNota1disciplina2() {
		return nota1disciplina2;
	}


	public void setNota1disciplina2(double nota1disciplina2) {
		this.nota1disciplina2 = nota1disciplina2;
	}


	public double getNota2disciplina2() {
		return nota2disciplina2;
	}


	public void setNota2disciplina2(double nota2disciplina2) {
		this.nota2disciplina2 = nota2disciplina2;
	}


	public double getNota3disciplina2() {
		return nota3disciplina2;
	}


	public void setNota3disciplina2(double nota3disciplina2) {
		this.nota3disciplina2 = nota3disciplina2;
	}


	public double getNota1disciplina3() {
		return nota1disciplina3;
	}


	public void setNota1disciplina3(double nota1disciplina3) {
		this.nota1disciplina3 = nota1disciplina3;
	}


	public double getNota2disciplina3() {
		return nota2disciplina3;
	}


	public void setNota2disciplina3(double nota2disciplina3) {
		this.nota2disciplina3 = nota2disciplina3;
	}


	public double getNota3disciplina3() {
		return nota3disciplina3;
	}


	public void setNota3disciplina3(double nota3disciplina3) {
		this.nota3disciplina3 = nota3disciplina3;
	}

	public void cadastraraluno() {
		System.out.println("Digite o nome do aluno");
		this.nome = scanner.next();
		System.out.println("Digite a matricula do aluno");
		this.matricula = scanner.nextInt();
		System.out.println("Digite o curso do aluno");
		this.curso = scanner.next();
		
		System.out.println("Informe a primeira disciplina");
		this.disciplina1 = scanner.next();
		System.out.println("Informe a primeira nota");
		this.nota1disciplina1 = scanner.nextDouble();
		System.out.println("Informe a segunda nota");
		this.nota2disciplina1 = scanner.nextDouble();
		System.out.println("Informe a terceira nota");
		this.nota3disciplina1 = scanner.nextDouble();
		
		System.out.println("Informe a segunda disciplina");
		this.disciplina2 = scanner.next();
		System.out.println("Informe a primeira nota");
		this.nota1disciplina2 = scanner.nextDouble();
		System.out.println("Informe a segunda nota");
		this.nota2disciplina2 = scanner.nextDouble();
		System.out.println("Informe a terceira nota");
		this.nota3disciplina2 = scanner.nextDouble();
		
		System.out.println("Informe a terceira disciplina");
		this.disciplina3 = scanner.next();
		System.out.println("Informe a primeira nota");
		this.nota1disciplina3 = scanner.nextDouble();
		System.out.println("Informe a segunda nota");
		this.nota2disciplina3 = scanner.nextDouble();
		System.out.println("Informe a terceira nota");
		this.nota3disciplina3 = scanner.nextDouble();
			
	}

	public void verificaraprovacao() {
		
		System.out.println("Aluno: " + nome);
		System.out.println("Curso: " + curso);
		
		double mediadisciplina1 = (nota1disciplina1 + nota2disciplina1 + nota3disciplina1) / 3;
		double mediadisciplina2 = (nota1disciplina2 + nota2disciplina2 + nota3disciplina2) / 3;
		double mediadisciplina3 = (nota1disciplina3 + nota2disciplina3 + nota3disciplina3) / 3;
		
		String resultd1 = (mediadisciplina1 >= 7) ? "Aprovado" : "Reprovado" ;
		String resultd2 = (mediadisciplina2 >= 7) ? "Aprovado" : "Reprovado" ;
		String resultd3 = (mediadisciplina3 >= 7) ? "Aprovado" : "Reprovado" ;
		
		System.out.println("Disciplina1 " + disciplina1 + ": " + nota1disciplina1 + "  " + nota2disciplina1 + "  " + nota3disciplina1 + " " + resultd1);
		System.out.println("Disciplina2 " + disciplina2 + ": " + nota1disciplina2 + "  " + nota2disciplina2 + "  " + nota3disciplina2 + " " + resultd2);
		System.out.println("Disciplina3 " + disciplina3 + ": " + nota1disciplina3 + "  " + nota2disciplina3 + "  " + nota3disciplina3 + " " + resultd3);
		
	}
}