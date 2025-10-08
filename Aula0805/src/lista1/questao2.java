package lista1;
import java.util.Scanner;

public class questao2 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			double saldo, reajuste, valorajustado;
			reajuste = 0.1;
			System.out.println("Digite o saldo");
			saldo = scanner.nextDouble();
			saldo = saldo +(saldo * reajuste);
			saldo += (saldo * reajuste);
			valorajustado = saldo + (saldo * reajuste);
			
			System.out.println("O valor reajustado é " + saldo);
			System.out.println("O valor reajustado é " + valorajustado);
			
			
		

	}

}
