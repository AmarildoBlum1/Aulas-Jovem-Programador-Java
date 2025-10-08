package matrizes;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		
		Scanner scanner = new Scanner(System.in);


		int maior = Integer.MIN_VALUE;
		int linhaMaiorValor = -1;
		int colunaMaiorValor = -1;

		System.out.println("Digite os valores para a matriz 5x5(não poderá repetir números): ");

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = scanner.nextInt();
				
				if (matriz[i][j] > maior) {
					maior = matriz [i][j];
					linhaMaiorValor = i;
					colunaMaiorValor = j;
				}
				
				
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(matriz[i][j]);
			}
		}

		System.out.println("Maior valor: " + maior);
		System.out.println("Localização -> Linha: " + linhaMaiorValor + " | Coluna: " + colunaMaiorValor);
	}

}