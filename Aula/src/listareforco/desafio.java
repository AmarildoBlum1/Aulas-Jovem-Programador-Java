package listareforco;
import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double acucar = 1.5;
		double  manteiga = 1.0;
		double farinha = 2.75;
		int qntbiscoitos = 48;
		
		System.out.println("Quantos cookies você deseja fazer?");
		int cookiesdesejados = scanner.nextInt();
		
		double result = (double) cookiesdesejados / qntbiscoitos;
		
		double qtdacucar = acucar * result;
		double qtdmanteiga = manteiga * result;
		double qtdfarinha = farinha * result;
		
		System.out.println("Para fazer " + cookiesdesejados + "você precisará de:");
		System.out.println(qtdacucar + " xícaras de açucar");
		System.out.println(qtdmanteiga + " xícaras de manteiga");
		System.out.println(qtdfarinha + " xícaras de farinha");
		
	}
}
