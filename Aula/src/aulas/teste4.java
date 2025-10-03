package aulas;
import java.util.Random;

public class teste4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int [][]matriz = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			for(int j = 0; j <10; j++) {
				matriz[i][j] = random.nextInt(10);
				
				System.out.println(matriz[i][j] + " ");
				
			}
		}
		
		int linha = 5;
		int maiorlinha = Integer.MIN_VALUE;
		int menorlinha = Integer.MAX_VALUE;
				
		for (int j = 0; j < 10; j++) {	
				if (matriz[linha][j] > maiorlinha) {
					maiorlinha = matriz[linha][j];
				}
					
					if(matriz[linha][j] < menorlinha) {
						menorlinha = matriz[linha][j];
						
			}
		}
		int coluna = 7;
		int maiorcolun = Integer.MIN_VALUE;
		int menorcolun = Integer.MAX_VALUE;
		
		for (int i = 0; i < 10; i++) {
			if (matriz[coluna][i] > maiorcolun) {
				maiorcolun = matriz[coluna][i];
			}
				
				if(matriz[coluna][i] < menorcolun) {
					menorcolun = matriz[coluna][i];
				}		
			}
		
		 System.out.println("\nLinha 5 -> Maior: " + maiorlinha + " | Menor: " + menorlinha);
         System.out.println("\nColuna 7 -> Maior: " + maiorcolun + " | Menor: " + menorcolun);
		
	}

}
