package lista1;
import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor 1:");
		int valor1 = scanner.nextInt();
		
		System.out.println("Digite o valor 2:");
		int valor2 = scanner.nextInt();
		
		int dif = valor1 - valor2;
		
		System.out.println("A diferença é: " + dif);
	}

}
