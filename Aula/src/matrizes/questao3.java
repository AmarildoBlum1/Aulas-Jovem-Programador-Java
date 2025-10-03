package matrizes;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		int pares = 0;
		int impares = 0;
		
		System.out.println("Digite os valores para a matriz 3x3: ");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = scanner.nextInt();
				
				if (matriz[i][j] %2 == 0) {
					pares++;
					
				}
				else {
					impares++;
				}
			}
		}

		
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);
	}
}


