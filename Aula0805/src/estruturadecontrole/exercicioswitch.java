package estruturadecontrole;
import java.util.Scanner;

public class exercicioswitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana:");
		int dia = scanner.nextInt();
		
		switch (dia) {
		
		case 2:
			System.out.println("Segunda");
			break;
		
		case 3:
			System.out.println("Terça");
			break;
		
		case 4:
			System.out.println("Quarta");
			break;
			
		case 5:
			System.out.println("Quinta");
			break;
		
		case 6:
			System.out.println("Sexta");
			break;
		
		case 7:
			System.out.println("Sabado");
			break;
		
		case 1:
			System.out.println("Domingo");
			break;
		
		default:
			System.out.println("Opção inválida");
			break;
		
		
		
		
		}

	}

}
