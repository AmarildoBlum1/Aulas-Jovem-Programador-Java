package listareforco;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor projetado do total de vendas");
		double valor = scanner.nextInt();
		
		double percent = valor * 0.23;
	
		System.out.println("O lucro a ser obtido é: " + percent);
	}

}
