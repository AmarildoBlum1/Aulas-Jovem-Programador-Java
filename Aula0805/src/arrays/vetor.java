package arrays;
import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 5;  //tamanho do vetor
		int[] A = new int[n];    //declarando vetor A
		int[] B = new int[A.length];       //declarando vetor B
		
		//preenchendo vetor
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i); {
				A[i] = scanner.nextInt();
				B[i] = A[i];
			}
			
			System.out.println("Vetor A: ");
			for (i = 0; i < A.length; i++) {
				System.out.println(A[i] + " ");
			}
			
			System.out.println("Vetor B: ");
			for (i = 0; i < B.length; i++) {
				System.out.println(B[i] + " ");
			}
		}
	}
}
