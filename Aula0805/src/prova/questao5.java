package prova;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua altura");
		double altura = scanner.nextDouble();
		
		double pesoideal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoideal);
		
	}
}
