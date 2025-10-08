package arrays;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Scanner scan = new Scanner(System.in);
		
		int n = 10;
		int[] A = new int[n];   
		int[] B = new int[n];
		int[] C = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i); 
				A[i] = scanner.nextInt();
		}
				
				
		for (int i = 0; i < B.length; i++) {
			System.out.println("Entre com o valor da posição " + i); 
				B[i] = scan.nextInt();
				C[i] = A[i] + B[i];
				
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
		
		C[i] = A[i] - B[i];
		}
		System.out.print("\n\nVetor C: ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		
		C[i] = A[i] * B[i];
		}
		System.out.print("\n\nVetor C: ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		
		C[i] = A[i] / B[i];
		}
		System.out.print("\n\nVetor C: ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
		
	}
}
