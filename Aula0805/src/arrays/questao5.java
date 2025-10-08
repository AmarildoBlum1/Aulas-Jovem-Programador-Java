package arrays;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = 10;
		int[] A = new int[n];  
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i); 
				A[i] = scanner.nextInt();
				A[i] = A[i] %5;
		}
	}
}
