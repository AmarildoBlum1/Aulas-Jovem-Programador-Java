package teste;
import java.util.Scanner;

public class testeAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int option;
		
		do {
			System.out.println("\n---Sistema de Gestão Acadêmica---");
			System.out.println("Digite 1 para adicionar um Professor");
			System.out.println("Digite 2 para adicionar um técnico administrativo");
			System.out.println("Digite 3 para adicionar um Curso");
			System.out.println("Digite 4 para adicionar uma Disciplina");
			System.out.println("Digite 5 para adicionar um aluno");
			option = scanner.nextInt();
			scanner.nextLine();
			

			switch (option) {
			
			case 1:
				Professor professor1 = null;
				professor1.criarProfessor();
				break;
				
			case 2:
				Tecnicos tecnico1 = null;
				tecnico1.criarTecnicos();
				break;
				
			case 3:
				Curso curso1 = null;
				curso1.criarCurso();
				break;
			}
		}	while (option!=0);
	}
}

