package Calculadora;
import java.util.Scanner;

public class testeCalc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		double num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número");
		double num2 = scanner.nextInt();
		
		System.out.println("Digite o calculo que deseja fazer");
		String calc = scanner.next();
		
		if (calc.equals("+")) {
			System.out.println(num1 + num2);
		}
		else if (calc.equals("-")) {
			System.out.println(num1 - num2);
		}
		else if (calc.equals("*")) {
			System.out.println(num1 * num2);
		}
		else if (calc.equals("/")) {
			System.out.println(num1 / num2);
		}
		else {
			System.out.println("Caractere inválido");
			System.exit(0);
		}
		
	}

}
