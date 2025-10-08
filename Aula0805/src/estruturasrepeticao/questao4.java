package estruturasrepeticao;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoUser;
		int senhaUser;
		boolean entradavalida = false;
		
		
		System.out.println("Cadastro de usuário");
		
		do {
			System.out.println("Digite o código do usuário:");
			codigoUser = scanner.nextInt();
		
		if (codigoUser <= 0) {
			System.out.println("Erro: Código do usuário deve ser um número inteiro positivo. Tente novamente!");
			continue;
		}
		
		System.out.println("Digite a senha do usuário:");
		senhaUser = scanner.nextInt();
		
		if (senhaUser <=0) {
			System.out.println("Erro: a senha do usuário deve ser um número inteiro positivo. Tente novamente!");
			
		}else {
			entradavalida = true;
			System.out.println("Cadastro realizado!");
			System.out.println("Código do Usuário: " + codigoUser);
			System.out.println("Senha do Usuário: " + senhaUser);
		}
		
		}while (!entradavalida);
	}

}
