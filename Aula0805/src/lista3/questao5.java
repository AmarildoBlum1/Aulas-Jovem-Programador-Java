package lista3;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double gas = 2.53;
		double eta = 2.09;
		double die = 1.92;
		
		System.out.println("Digite qual combustivel deseja usar:");
		String comb = scanner.next();
		
		System.out.println("Digite a quantidade de combustível desejada:");
		double litros = scanner.nextDouble();
		
		switch (comb) {
		
		case "gasolina":
			System.out.println("O total a pagar é R$:" + (litros * gas));
			System.out.println("Você não ganhou a troca de óleo");
			break;
		
		case "diesel":
			System.out.println("O total a pagar é R$:" + (litros * die));
			System.out.println("Você não ganhou a troca de óleo");
			break;
			
		case "etanol":
			
			if (litros > 30) {
				System.out.println("O total a pagar é R$:" + (litros * eta));
				System.out.println("Você ganhou a troca de óleo!");
			}
			else {
				System.out.println("O total a pagar é R$:" + (litros * eta));
				System.out.println("Você não ganhou a troca de óleo");
			}
			
		}
		
		

	}

}
