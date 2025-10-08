package arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] valores = new double[6];
		
		valores[0] = 5.0;
		valores[1] = 4.8;
		valores[2] = 7.9;
		valores[3] = 4.2;
		valores[4] = 6.4;
		valores[5] = 3.5;
		
		System.out.println("Index 1 do array: " + valores[0]);
		System.out.println("Index 2 do array: " + valores[1]);
		System.out.println("Index 3 do array: " + valores[2]);
		System.out.println("Index 4 do array: " + valores[3]);
		System.out.println("Index 5 do array: " + valores[4]);
		System.out.println("Index 6 do array: " + valores[5]);
		
		System.out.println("Tamanho do array: " + valores.length);
		
		valores[0] = 1.0;
		
		System.out.println(valores[0]);
		
		double total = 0;
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]); //somar os elementos do array
			total += valores[i];
		}
		System.out.println("O total " + total);
		
		
	}
	
}










