package aulas;
import java.util.Scanner;

public class teste5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] matriz = new int[5][5];
		
		int maiorNum = 0;
		int maiorLinha = 0;
		int maiorColuna = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
			System.out.println("Digite os valores da matriz:");
			matriz[i][j] = scanner.nextInt();
			
			if (matriz[i][j] > maiorNum) {
				maiorNum = matriz [i][j];
				maiorLinha = i;
				maiorColuna= j;
				
			}
			}
		}
		
		System.out.println("Maior valor: " + maiorNum);
		System.out.println("Localização -> Linha: " + maiorLinha + " | Coluna: " + maiorColuna);
		
	}
}
