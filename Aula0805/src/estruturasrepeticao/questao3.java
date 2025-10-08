package estruturasrepeticao;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja ver a tabuada");
		int numero = scanner.nextInt();
		
		for (int i = 1; i <=10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}

}
