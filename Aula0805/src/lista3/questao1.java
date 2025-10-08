package lista3;
import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo!");
		long num = scanner.nextLong();
		
		if (num > 0) {
			if(num %2 == 0) {
				System.out.println("Número: " + num + " é PAR");
			}
			else {
				System.out.println("Número: " + num + " é IMPAR");
			}
		}
	}
}
