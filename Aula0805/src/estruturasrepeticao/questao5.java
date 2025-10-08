package estruturasrepeticao;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro");
		int number1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número inteiro");
		int number2 = scanner.nextInt();
		
		int menorNum;
		int maiorNum;
		
		if ( number1 < number2) {
			menorNum = number1;
			maiorNum = number2;
		
		}else {
			menorNum = number2;
			maiorNum = number1;
		}
		
		if (maiorNum - menorNum <= 1) {
			System.out.println("Não há números inteiros entre " + number1 + " e " + number2);
			
		}else {
			for (int i = menorNum +1; i < maiorNum; i++) {
				System.out.println(i);
			}
		}

	}

}
