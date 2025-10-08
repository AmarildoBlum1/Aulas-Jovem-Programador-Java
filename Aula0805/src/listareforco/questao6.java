package listareforco;
import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preço do pruduto 1:");
		double prod1 = scanner.nextDouble();
		
		System.out.println("Digite o preço do pruduto 2:");
		double prod2 = scanner.nextDouble();
		
		System.out.println("Digite o preço do pruduto 3:");
		double prod3 = scanner.nextDouble();
		
		System.out.println("Digite o preço do pruduto 4:");
		double prod4 = scanner.nextDouble();
		
		System.out.println("Digite o preço do pruduto 5:");
		double prod5 = scanner.nextDouble();
		
		double valor = prod1 + prod2 + prod3 + prod4 + prod5;
		double imposto = valor *0.06;
		double valortotal = valor + imposto;
		
		System.out.println("O valor do imposto é: " + imposto);
		System.out.println("O valor total a ser pago é: " + valortotal);
		

	}

}
