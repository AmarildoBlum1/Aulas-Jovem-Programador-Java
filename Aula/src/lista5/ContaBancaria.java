package lista5;
import java.util.Scanner;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numeroConta;
	private static double saldo;
	
	Scanner scanner = new Scanner(System.in);
	
	
	public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void sacar() {
	System.out.println("Digite o valor do saque");
	double ValorSaque = scanner.nextDouble();
	
	if (ValorSaque <= saldo) {
		saldo = saldo - ValorSaque;
	}
	else {
		System.out.println("Saldo Indisponível");
		}
	}
	
	public void depositar() {
		System.out.println("Digite o valor do deposito");
		double valorDeposito = scanner.nextDouble();
		saldo = saldo + valorDeposito;
		
	}
	
	public void mostrarInfo() {
		System.out.println("Nome do cliente: " + nomeCliente);
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Saldo da conta: R$" + saldo);
			
	}
}
