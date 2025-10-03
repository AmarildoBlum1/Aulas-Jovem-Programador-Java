package teste;
import java.util.Scanner;

public class Disciplinas {
	
	private int codigoDisciplina;
	private String nomeDisciplina[] = new String[4];
	private int cargahoraria;
	private Professor professor;
	
	public Disciplinas(double codigoDisciplina, String[] nomeDisciplina, double cargahoraria) {
		super();
	
	}         
	
	public void criarDisciplinas() {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i < nomeDisciplina.length; i++) {
		
		System.out.println("Digite o nome da Disciplina " + i);
	
		nomeDisciplina[i] = scanner.next();
		}
		
		System.out.println("Digite o código da disciplina:");
		codigoDisciplina = scanner.nextInt();
		
		System.out.println("Digite a carga horária:");
		cargahoraria = scanner.nextInt();
		
	}
	public void obterInfo() {
		System.out.println("Nome das disciplinas: " + nomeDisciplina[1] + ", " + nomeDisciplina[2] + ", " + nomeDisciplina[3] + ", " + "Código da disciplina: " + codigoDisciplina + " Carga horária: " + cargahoraria);
	}
}
