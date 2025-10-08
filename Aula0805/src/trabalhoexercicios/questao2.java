package trabalhoexercicios;
import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int contador = 0;
		
		while(contador >= 0) {
		System.out.println("Digite a senha de verificação.");
		int X = scanner.nextInt();
		contador = contador+1;
		
		if (X == 1234) {
			System.out.println("ACESSO PERMITIDO.");
			System.out.println("O número de tentativas foi: " + contador);
			break;
			
		}
		else {
			System.out.println("ACESSO NEGADO.");
			}
		}
	}
}
