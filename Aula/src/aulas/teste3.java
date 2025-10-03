package aulas;
import java.util.Scanner;

public class teste3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int Numpar = 0;
		int Numimp = 0;
		int [][]matriz = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.println("Digite os valores da matriz");
				matriz[i][j] = scanner.nextInt();
				
				if (matriz[i][j] % 2 ==0) {
					Numpar++;
				}
				
				else {
					Numimp++;
				}
				
			}
			
		}
		System.out.println("A quantidade de números pares é: " + Numpar);
		System.out.println("A quantidade de números impares é: " + Numimp);
	}

}
