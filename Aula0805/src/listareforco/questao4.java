package listareforco;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		double A = scanner.nextDouble();
		
		
		System.out.println("Digite o valor de B");
		double B = scanner.nextDouble();
		
		System.out.println("Digite o valor de C");
		double C = scanner.nextDouble();
		
		double SOMAAB = A + B;
		double PRODBC = B * C;
		double TOTAL = SOMAAB * PRODBC;
		
		System.out.println("O produto das duas novas variáveis é: " + TOTAL);
		
	}

}
