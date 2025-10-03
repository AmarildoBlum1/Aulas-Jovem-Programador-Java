package aulas;
import java.util.Random;

public class teste {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] matriz = new int[4][3];
		
		int somaPos = 0;
		int somaNeg = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
			matriz[i][j] = random.nextInt(100);	
			
			System.out.println(matriz[i][j] + " ");
		
			
			if (matriz[i][j] >= 0) {
				somaPos++;
				
			}
			else if (matriz [i][j] < 0) {
				somaNeg++;
			}
			}
			
			System.out.println("A soma dos números positvos é: " + somaPos);
			System.out.println("A soma dos números negativos é: " + somaNeg);
		}
		
	}
}