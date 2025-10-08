package exerciciocontacorrente;
import java.util.Scanner;

public class ContaCorrente {

		private String nome;
		private int numeroconta;
		private double saldo;
		private double limite;
		private boolean chequeespecial;
		
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		ContaCorrente() { }
		
		ContaCorrente(String nome, int numeroconta, double saldo, double limite, boolean chequeespecial) {
			this.nome = nome;
			this.numeroconta = numeroconta;
			this.saldo = saldo;
			this.limite = limite;
			this.chequeespecial = chequeespecial;
		
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

		public int getNumeroconta() {
			return numeroconta;
		}

		public void setNumeroconta(int numeroconta) {
			this.numeroconta = numeroconta;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}

		public boolean isChequeespecial() {
			return chequeespecial;
		}

		public void setChequeespecial(boolean chequeespecial) {
			this.chequeespecial = chequeespecial;
		}
		
		
		public void cadastrarcliente() {
			
			System.out.println("Digite o nome do usuário da conta");
			this.nome = scanner.next();
			
			System.out.println("Digite o numero da conta");
			this.numeroconta = scan.nextInt();
			
			System.out.println("Digite o saldo da conta");
			this.saldo = scan.nextDouble();
			
			System.out.println("Digite o limite da conta");
			this.limite = scan.nextDouble();
			
			System.out.println("Seja bem vindo(a) " + nome);
			System.out.println("Número da conta: " + numeroconta);
			System.out.println("Saldo da conta: R$ " + saldo);
			System.out.println("Limite da conta:R$ " + limite);
	
		}

		public void saque() {
			System.out.println("Informe o valor do saque");
			double valorsaque = scanner.nextDouble();
			if (valorsaque <= (saldo + limite)) {
				saldo  = saldo - valorsaque;
				System.out.println("Saque realizado");
			}
			else {
				System.out.println("Saldo indisponível");
			}
		}
			
		public void depositar() {
			System.out.println("Digite o valor que deseja depositar");
			double valordeposito = scanner.nextDouble();
			saldo = (saldo + valordeposito);
	}
		
		public void consultarsaldo() {
			System.out.println("Saldo disponível é: R$ " + saldo);
		}
		
		public void consultacheque() {
			if (saldo < 0) {
				chequeespecial = true;
				System.out.println("Essa conta está utilizando cheque especial");
				
			}
			else {
				chequeespecial = false;
				System.out.println("Essa conta não está utilizando cheque especial");
			}
		}
		
		
}

