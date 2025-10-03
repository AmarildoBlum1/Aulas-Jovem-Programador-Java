package teste;
import java.util.Scanner;

public class Aluno {
	
	private String nomeAluno;
	private int matricula;
	private String cpf;
	public Aluno(String nomeAluno, int matricula, String cpf) {
		super();
		
		}
		
		public void obterInfo() {
			System.out.println("Nome do aluno: " + nomeAluno + " matricula: " + matricula + " cpf: " + cpf + " Curso:");
		}
		
		public void criarAluno() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite o nome do aluno: ");
			Aluno aluno1 = new Aluno(nomeAluno, matricula, cpf);
			nomeAluno = scanner.next();
			
			System.out.println("Digite a matricula do aluno:");
			matricula = scanner.nextInt();
			
			System.out.println("Digite o cpf do aluno: ");
			cpf = scanner.next();
			
		}
	}













