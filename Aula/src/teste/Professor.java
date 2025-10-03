package teste;
import java.util.Scanner;

public class Professor extends Funcionario {
	
	private String titulacao;
	private double valorDedicacaoExclusiva = 250;
	private double retribTitulacao = 200;
	private double salarioBase = 3000;

	public Professor(String nome, String endereco, String telefone, String cpf, Double salario) {
		super(nome, endereco, telefone, cpf, salario);
		
	}
	
	public void obterInfo() {
		System.out.println("Nome do professor: " + nome + " endereço: " + endereco + " telefone: " + telefone + " cpf:" + cpf);
		System.out.println("salário: " + calcSalario() + " Titulação: " + titulacao);
		
	}
	
	public double calcSalario() { 
		double salario = salarioBase + valorDedicacaoExclusiva + retribTitulacao;
		return salario;
	}
	
	public void criarProfessor() {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do professor: ");
		nome = scanner.next();
		
		System.out.println("Digite a titulação");
		titulacao = scanner.next();
		
		System.out.println("Digite o endereço:");
		endereco = scan.next();
		
		System.out.println("Digite o telefone:");
		telefone = scanner.next();
		
		System.out.println("Digite o cpf:");
		cpf = scanner.next();
		
		System.out.println("Digite o salário:");
		salario = scan.nextDouble();
	}
}
