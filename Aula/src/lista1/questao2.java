package lista1;
import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o saldo");
		int saldo = scanner.nextInt();
		double reajust = saldo * 0.1;
		double valorajustado = saldo + reajust;
		
		System.out.println("O saldo é de: " + saldo);
		System.out.println("O saldo com reajuste é de: " + valorajustado);
		

	}

}
