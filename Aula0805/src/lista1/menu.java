package lista1;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Seja Bem Vindo à Blum Restaurantes");
		System.out.println("MENU");
		System.out.println("Hot dog R$ 1,00");
		System.out.println("Hambúrguer R$ 1,30");
		System.out.println("Cheeseburguer R$ 1,50");
		System.out.println("Refrigerante em lata R$ 1,00");
		System.out.println("Batatas fritas R$ 0,80");
		
		System.out.println("Escreva seu nome");
		String nome = Scanner.nextLine();
		
		System.out.println("Digite quantos Hot dog de R$ 1,00 você deseja");
		int hotdog = Scanner.nextInt();
		
		System.out.println("Digite quantos Hambúrgueres de R$ 1,30 você deseja");
		int hamburguer = Scanner.nextInt();
		
		System.out.println("Digite quantos Cheeseburgueres de R$ 1,50 você deseja");
		int cheeseburguer = Scanner.nextInt();
		
		System.out.println("Digite quantos Refrigerantes em lata de R$ 1,00 você deseja");
		int refri = Scanner.nextInt();
		
		System.out.println("Digite quantas Batatas fritas de R$ 0,80 você deseja");
		int potatos = Scanner.nextInt();
		
		double valorpg = (hotdog * 1.00 + hamburguer * 1.30 + cheeseburguer * 1.50 + refri * 1.00 + potatos * 0.80);
		
		System.out.println("A quantidade de hotdogs é:" + hotdog);
		System.out.println("A quantidade de hamburgueres é:" + hamburguer);
		System.out.println("A quantiadde de cheeseburgueres é:" + cheeseburguer);
		System.out.println("A quantidade de refrigerantes é:" + refri);
		System.out.println("A quantidade de batatas fritas é:" + potatos);
		System.out.println("O valor a ser pago é de: R$ " + valorpg + "0");
		System.out.println("Obrigado pela preferencia " + nome);

	}

}
