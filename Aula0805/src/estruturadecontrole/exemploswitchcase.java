package estruturadecontrole;
import java.util.Scanner;

public class exemploswitchcase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno:");
		char nota = scanner.next().charAt(0); //pegar o scan como CHAR
		nota = Character.toUpperCase(nota); //torna funcional tanto letras maiusculas quanto minusculas
		
		switch(nota) {
		 
		case 'A':
			System.out.println("Aluno aprovado, conceito excelente!");
			break;
		
		case 'B':
			System.out.println("Aluno aprovado, conceito bom!");
			break;
			
		case 'C':
			System.out.println("Aluno aprovado, conceito médio!");
			break;
			
		case 'D':
			System.out.println("Aluno reprovado!");
			break;
		
		default :
			System.out.println("Nota inválida!");
			break;
			
		}

	}

}
