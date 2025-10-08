package lista3;
import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int caixalaranja = 60;
		int caixalimao = 80;
		int caixamorango = 20;
		
		System.out.println("Digite o fruto desejado:");
		String fruto = scanner.next();
		
		System.out.println("Digite o preço da unidade:");
		int preco = scanner.nextInt();
		
		switch (fruto) {
		
		case "laranja":
			System.out.println("O preço da caixa de laranja é R$: " + (preco * caixalaranja));
			break;
			
		case "limão":
			System.out.println("O preço da caixa de limão é R$: " + (preco * caixalimao));
			break;
			
		case "morango":
			System.out.println("O preço da caixa de morango é R$: " + (preco * caixamorango));
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
	}
}
