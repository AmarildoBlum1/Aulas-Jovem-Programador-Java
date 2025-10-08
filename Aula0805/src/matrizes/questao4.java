package matrizes;
import java.util.Random;

public class questao4 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		
		Random numeroRandom = new Random();
		
		for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                matriz[i][j] = numeroRandom.nextInt(10);
                
                System.out.print(matriz[i][j]+" ");
                
            }
		}
                
                int linha = 4;
                int MaiorLinha = Integer.MIN_VALUE;
                int MenorLinha = Integer.MAX_VALUE;
                
                for (int j = 0; j <10; j++) {
                	if (matriz[linha][j] > MaiorLinha) {
                		MaiorLinha = matriz[linha][j];
                	}
                	
                	if (matriz[linha][j] < MenorLinha) {
                		MenorLinha = matriz[linha][j];
                	}
                }
                
                int coluna = 6;
                int MaiorColuna = Integer.MIN_VALUE;
                int MenorColuna = Integer.MAX_VALUE;
                
                for (int i = 0; i <10; i++) {
                	if (matriz[coluna][i] > MaiorColuna) {
                		MaiorColuna = matriz[coluna][i];
                	}
                	
                	if (matriz[coluna][i] < MenorColuna) {
                		MenorColuna = matriz[coluna][i];
                	}
                }
                
                System.out.println("\nLinha 5 -> Maior: " + MaiorLinha + " | Menor: " + MenorLinha);
                System.out.println("\nColuna 7 -> Maior: " + MaiorColuna + " | Menor: " + MenorColuna);
            
		
		
	}
}
