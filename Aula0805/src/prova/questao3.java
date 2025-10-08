package prova;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a receita da sua empresa:");
		double receita = scanner.nextDouble();
		
		System.out.println("Digite as despesas da sua empresa:");
		double despesa = scanner.nextDouble();
		
		Double lucro = receita - despesa;
		Double percentdespesa = despesa / 100 * receita;
		
		System.out.println("O seu lucro será de R$: " + lucro);
		System.out.println("O seu percentual de despesa é de: " + percentdespesa + "%");

	}

}
