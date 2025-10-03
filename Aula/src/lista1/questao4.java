package lista1;
import java.util.Scanner;

public class questao4 {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor 1:");
		int valor1 = scanner.nextInt();
		
		System.out.println("Digite o valor 2:");
		int valor2 = scanner.nextInt();
		
		int soma = valor1 + valor2;
		
		int dobro = soma*2;
		
		System.out.println("A soma dos dois valores é: " + soma);
		System.out.println("O dobro dos dois valores é: " + dobro);
		
	}

}
