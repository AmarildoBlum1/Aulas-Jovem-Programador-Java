package lista3;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto comprado:");
		double valorprod = scanner.nextDouble();
		
		double desc = valorprod * 0.10;
		
		System.out.println("Digite D se o pagamento for em dinheiro ou C para cheque");
		char pag = scanner.next().charAt(0);
		
		switch (pag) {
			
		case 'C':
			System.out.println("O valor final a ser pago será de R$: " + valorprod);
			break;
		
		case 'D':
			
			if (valorprod >=100) {
				System.out.println("O valor final a ser pago será de R$: " + (valorprod - desc));
			}
			
			else {
				System.out.println("O valor final a ser pago será de R$: " + valorprod);	
			}
			
		}

	}

}
