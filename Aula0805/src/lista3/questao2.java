package lista3;
import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		long num = scanner.nextLong();
		
		if (num == 0) {
			System.out.println("Número neutro!");
		}
		else if (num >0) {
			System.out.println("Número positivo!");
		}
		else {
			System.out.println("Número negativo!");
		}

	}

}
