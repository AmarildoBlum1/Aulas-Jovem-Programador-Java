package lista3;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o código do produto:");
		int cod = scanner.nextInt();
		
		switch (cod) {
		
		case 1:
			System.out.println("Produto não-perecivel");
			break;
			
		case 2, 3, 4:
			System.out.println("Produto perecivel");
			break;
			
		case 5, 6:
			System.out.println("Vestuário");
			break;
			
		case 7:
			System.out.println("Higiene pessoal");
			break;
			
		case 8, 9, 10, 11, 12, 13, 14, 15:
			System.out.println("Limpeza e utensílios domésticos");
			break;
			
		default:
			System.out.println("Inválido");
			
		}

	}

}
