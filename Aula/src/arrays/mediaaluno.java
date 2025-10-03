package arrays;
import java.util.Scanner;

public class mediaaluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno:");
		double nota2 = scanner.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno:");
		double nota3 = scanner.nextDouble();
		
		System.out.println("Digite a quarta nota do aluno:");
		double nota4 = scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media ==10) {
			System.out.println("Aprovado com louvor!");
			
			}
			
			else if(media ==7) {
				System.out.println("Aprovado na estica!");
				
			}
				
			else if(media >=8) {
					System.out.println("Aprovado!");
					
			}else {
					System.out.println("Reprovado!");
		}
	}
}

