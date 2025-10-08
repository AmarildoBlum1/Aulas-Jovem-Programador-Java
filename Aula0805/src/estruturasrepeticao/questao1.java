package estruturasrepeticao;
import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		long produtosImpares = 1;
		long somaPares = 0;
		int numero;
		
		System.out.println("Digite um número inteiro positivo. Digite 0 ou um número negativo para encerrar.");
		
		do{
			System.out.println("Digite um número");
			numero = scanner.nextInt();
			
			if (numero > 0) {
				if (numero %2 !=0) {
				produtosImpares *= numero;
			
			}else {
				somaPares += numero;
			}
				
		}
				
		}while (numero > 0);
		
		System.out.println("Produto dos numeros impares: " + produtosImpares);
		System.out.println("Soma dos produtos pares: " + somaPares);

	}	
}


