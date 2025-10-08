package lista3;
import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double num1 = scanner.nextDouble();
		
		System.out.println("Digite a operação que deseja realizar:");
		String op = scanner.next();
		
		System.out.println("Digite o segundo número:");
		double num2 = scanner.nextDouble();
		
		switch (op) {
		
		case "+":
			System.out.println("O resultado é: " + num1 + num2);
			break;
			
		case "-":
			System.out.println("O resultado é: " + (num1 - num2));
			break;
			
		case "/":
			System.out.println("O resultado é: " + num1 / num2);
			break;
			
		case "*":
			System.out.println("O resultado é: " + num1 * num2);
			break;
		}
	}
}
