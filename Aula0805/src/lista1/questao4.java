package lista1;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor1, valor2, soma, prod;
		
		
		System.out.println("Digite o valor 1:");
		valor1 = scanner.nextInt();
		
		System.out.println("Digite o valor 2:");
		valor2 = scanner.nextInt();
		
		soma = valor1 + valor2;
		System.out.println("A soma dos dois valores é: " + soma);
		
		prod = soma*2;
		System.out.println("O resultado da soma é: " + prod);
		
		

	}

}
