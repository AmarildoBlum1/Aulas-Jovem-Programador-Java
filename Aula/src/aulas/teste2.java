package aulas;
import java.util.Random;

public class teste2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int maiorNum = 0;
		int colun = 0;
		int linha = 0;
		
		int[][] matriz = new int[4][4]; 
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = random.nextInt(100);	
				
				System.out.println(matriz[i][j] + " ");
				
				if (matriz[i][j] > maiorNum) {
					maiorNum = matriz[i][j];
					linha = i;
					colun = j;
				}
			}
			
		}
		System.out.println("O maior número da matriz é: " + maiorNum);
		System.out.println("A sua linha é: " + linha);
		System.out.println("A sua coluna é: " + colun);
	}

}
