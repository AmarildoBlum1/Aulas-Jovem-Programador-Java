package lista1;
import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor1, valor2, dif;
		
		
		System.out.println("Digite o valor 1:");
		valor1 = scanner.nextInt();
		
		System.out.println("Digite o valor 2:");
		valor2 = scanner.nextInt();
		
		dif = valor1 - valor2;
		System.out.println("O resultado da diferença é: " + dif);
		

	}

}
