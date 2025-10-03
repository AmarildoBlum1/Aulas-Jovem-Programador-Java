package teste;
import java.util.Scanner;

public class Curso {
	
	private double codigocurso;
	private String nomeCurso;
	
	public Curso(double codigo, String nomeCurso) {
		super();

	}
	
	public double getCodigocurso() {
		return codigocurso;
	}

	public void setCodigocurso(double codigocurso) {
		this.codigocurso = codigocurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public void obterInfo() {
		System.out.println("código do curso: " + codigocurso + "Nome do curso: " + nomeCurso);
	}
	
	public void criarCurso() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso");
		nomeCurso = scanner.next();
		
		System.out.println("Digite o código do curso");
		codigocurso = scanner.nextDouble();
		
	}
}