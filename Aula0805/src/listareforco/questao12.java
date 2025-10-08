package listareforco;
import java.util.Scanner;

public class questao12 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a hora");
		double hora = scanner.nextDouble();
		
		double minutos = (hora%3600)*60;
		double segundos = (hora%3600)*60*60;
		
		System.out.println(hora + " horas são: " + minutos + " minutos, e: " + segundos + " segundos");
	}
}


//esse programa pede ao usuario a hora do dia e devolve a ele quantos minutos e segundos ja se passaram