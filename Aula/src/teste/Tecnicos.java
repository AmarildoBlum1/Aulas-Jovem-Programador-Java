package teste;
import java.util.Scanner;

public class Tecnicos extends Funcionario {
	
	private String cargo;
	private double salarioBase;
	private double auxTransporte = 500;
	private double auxAlimentacao = 1000;

	public Tecnicos(String nome, String endereco, String telefone, String cpf, Double salario) {
		super(nome, endereco, telefone, cpf, salario);
	
	}
	public void obterInfo() {
		System.out.println("Nome do Técnico: " + nome + " endereço: " + endereco + " telefone: " + telefone + " cpf:" + cpf);
		System.out.println("salário: " + calcSalario() + " cargo: " + cargo);
	}
	
	public double calcSalario() { 
		double salario = salarioBase + auxTransporte + auxAlimentacao;
		return salario;
	}
	public double calcSalario(double QuantHoras, double valorHora) {
		double salario = salarioBase + auxTransporte + auxAlimentacao + (QuantHoras * valorHora);
		return salario;
	}
	
	public void criarTecnicos() {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do técnico: ");
		nome = scanner.next();
		
		System.out.println("Digite o cargo");
		cargo = scanner.next();
		
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















