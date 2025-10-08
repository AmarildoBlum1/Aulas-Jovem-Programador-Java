package prova1606;
import java.util.Scanner;

public class testeAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso");
		Curso curso = new Curso(null, null);
		curso.nomeCurso = scanner.next();
		System.out.println("Digite o código do curso");
		curso.codigo = scanner.next();
		curso.verInfo();
		
		System.out.println("Digite o nome do tecnico administrativo");
		Tecnicos tecnico = new Tecnicos(null, null, null, null, 0, null);
		tecnico.setNome(scanner.next());
		System.out.println("Digite o salário");
		tecnico.setSalario(scanner.nextDouble());
		tecnico.calcsalario();
		tecnico.verInfo();
	
		System.out.println("Digite o nome do Aluno:");
		Aluno aluno1 = new Aluno(null, 0, null, null);
		aluno1.setNomeAluno(scanner.next());
		System.out.println("Digite a matricula do aluno");
		aluno1.setMatricula(scanner.nextInt());
		System.out.println("Digite o cpf do aluno");
		aluno1.setCpf(scanner.next());
		System.out.println("Digite o Curso");
		aluno1.setNomeAluno(scanner.next());
		
		System.out.println("Digite o nome do professor");
		Professor professor1 = new Professor(null, null, null, null, 0, null);
		professor1.setNome(scanner.next());
		System.out.println("Digite o salário do professor");
		professor1.setSalario(scan.nextDouble());
		professor1.calcasalario();
		professor1.mostrarInfo();
		
		
		
		
		
		
		
		

	}

}
