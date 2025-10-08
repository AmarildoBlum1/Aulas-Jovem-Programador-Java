package estruturadecontrole;
import java.util.Scanner;
public class exemploifelse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota 1:");
		int nota1 = scanner.nextInt();
		
		System.out.println("Digite a nota 2:");
		int nota2 = scanner.nextInt();
		
		System.out.println("Digite a nota 3:");
		int nota3 = scanner.nextInt();
		
		System.out.println("Digite a nota 4:");
		int nota4 = scanner.nextInt();
		
		int media = nota1 + nota2 + nota3 + nota4 / 4;
		
		if (media == 10) { 
			System.out.println("Aluno aprovado com louvor!");
			
		}
		else if (media ==7) {
			System.out.println("Aluno aprovado na estica!");
			
		}
		else if (media >=8) {
			System.out.println("Aluno aprovado!");
			
		}
		else {
			System.out.println("Aluno reprovado!");
		
		}

	}

}
