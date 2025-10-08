package matrizes;
import java.util.Random;

public class questao2 {

	public static void main(String[] args) {
		
		int[][] m = new int[4][4];
		
		Random numeroRandom = new Random();
		
		int maiorNumero = Integer.MIN_VALUE;
        int linhaMaior = -1;
        int colunaMaior = -1;
		
		 System.out.println("Sorteando números...");
	   
	        for(int i = 0; i < 4; i++) {
	            for(int j = 0; j < 4; j++) {
	                m[i][j] = numeroRandom.nextInt(10);
	                
	                System.out.println(m[i][j]);
	                
	                if (m[i][j] > maiorNumero) {
	                	maiorNumero = m[i][j];
	                	linhaMaior = i;
	                	colunaMaior = j;
	                }
	              
	            }      
	            
	        }
	                
	        System.out.println("O maior número da matriz é: " + maiorNumero);
	        System.out.println("Ele está na posição: [" + linhaMaior + "][" + colunaMaior + "]");
	        
		}
	
   }
