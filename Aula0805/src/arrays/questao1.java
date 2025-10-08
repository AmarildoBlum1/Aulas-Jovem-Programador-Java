package arrays;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 15;
		int[] A = new int[n];   
		int[] B = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i); 
				A[i] = scanner.nextInt();
				B[i] = A[i] * A[i];
		
		}
			System.out.print("\n\nVetor B: ");
			for (int i = 0; i < B.length; i++) {
				System.out.print(B[i] + " ");
			
		}	
	}
}






