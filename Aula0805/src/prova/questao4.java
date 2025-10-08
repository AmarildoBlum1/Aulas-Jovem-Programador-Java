package prova;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = scanner.next();
		
		System.out.println("Digite o ano do seu nascimento:");
		int ano = scanner.nextInt();
		
		int idade = 2025 - ano;
		int dias = idade * 365;
		
		System.out.println(nome + ", seus dias vividos são aproximadamente " + dias);

	}

}
