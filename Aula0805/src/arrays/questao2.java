package arrays;
import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 10;
		int[] A = new int[n];   
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i); 
				A[i] = scanner.nextInt();
				B[i] = A[i] * i;
				C[i] = A[i] % 2;
		
		}
		
		System.out.print("\n\nVetor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
			
		}
		
		System.out.print("\n\nVetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		System.out.print("\n\nVetor C: ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
	}
}
