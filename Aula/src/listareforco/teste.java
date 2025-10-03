package listareforco;
import java.util.Scanner;

public class teste {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ingredientes base para 48 biscoitos
	        double acucarBase = 1.5;
	        double manteigaBase = 1.0;
	        double farinhaBase = 2.75;
	        int biscoitosBase = 48;

	        System.out.print("Quantos biscoitos você deseja fazer? ");
	        int biscoitosDesejados = scanner.nextInt();

	        // Calcula o fator de ajuste
	        double fator = (double) biscoitosDesejados / biscoitosBase;

	        // Calcula as novas quantidades dos ingredientes
	        double acucarNecessario = acucarBase * fator;
	        double manteigaNecessaria = manteigaBase * fator;
	        double farinhaNecessaria = farinhaBase * fator;

	        System.out.println("\nPara fazer " + biscoitosDesejados + " biscoitos, você precisará de:");
	        System.out.printf("%.2f xícaras de açúcar\n", acucarNecessario);
	        System.out.printf("%.2f xícaras de manteiga\n", manteigaNecessaria);
	        System.out.printf("%.2f xícaras de farinha\n", farinhaNecessaria);

	        scanner.close();
	    }
	}



