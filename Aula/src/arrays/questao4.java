package arrays;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] A = new int[10];   
		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i); 
				A[i] = scanner.nextInt();
		}
		int quantidadePares = 0;
		for (int i = 0; i < A.length; i++) {
			
			if (A[i] %2 == 0) {
				quantidadePares++;
			}
			
			System.out.println("Elementos pares no vetor: " + quantidadePares);
		}

	}

}
