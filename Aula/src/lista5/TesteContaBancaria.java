package lista5;
import java.util.Scanner;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite '1' para criar uma conta poupança ou '2' para criar uma conta especial");
		
		int option = input.nextInt();

		    switch (option) {
		 
		    
		        case 1: 
		ContaPoupanca cliente1 = new ContaPoupanca(null, 0, 0);
		System.out.println("Digite o nome do cliente");
		cliente1.setNomeCliente(scanner.next());
		
		System.out.println("Digite o número da conta");
		cliente1.setNumeroConta(scan.nextInt());
		
		System.out.println("Digite o valor do saldo");
		cliente1.setSaldo(scan.nextDouble());
		
		cliente1.sacar();
		
		cliente1.mostrarInfo();
		
		cliente1.depositar();
		
		cliente1.calcularNovoSaldo();
		
		cliente1.mostrarInfo();
		
			break;
		    
		
		      case 2: 
		    ContaEspecial cliente = new ContaEspecial(null, 0, 0);
			System.out.println("Digite o nome do cliente");
			cliente.setNomeCliente(scanner.next());
				
			System.out.println("Digite o número da conta");
			cliente.setNumeroConta(scan.nextInt());
				
			System.out.println("Digite o valor do saldo");
			cliente.setSaldo(scan.nextDouble());
			
			cliente.sacar();
			
			cliente.mostrarInfo();
			
			cliente.depositar();
			
			cliente.mostrarInfo();
			   	
			
			break;
			
		    
		   
		    }   	    
	}

}
