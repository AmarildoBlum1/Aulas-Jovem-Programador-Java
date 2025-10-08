package listareforco;
import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a sua idade");
		int anos = scanner.nextInt();
		
		double dias = anos * 365.25;
		
		System.out.println("Dias vividos " + dias);
	}
}

//esse programa pergunta ao usuario sua idade e retorna quantos dias ele viveu
