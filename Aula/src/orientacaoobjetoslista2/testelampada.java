package orientacaoobjetoslista2;
import java.util.Scanner;

public class testelampada {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a marca da lampada");
		String marca = scanner.next();
		
		System.out.println("Digite o tipo da lâmpada");
		String tipo = scanner.next();
		
		System.out.println("Digite a potencia da lampada");
		double potencia = scan.nextDouble();
		
		System.out.println("Digite a vida util da lampada");
		double vidautil = scan.nextDouble();
		
		Lampada lampada = new Lampada(marca, tipo, potencia, vidautil, false);
		
		System.out.println(lampada.getMarca());
		System.out.println(lampada.getTipo());
		System.out.println(lampada.getPotência());
		System.out.println(lampada.getVidautil());
	}
	
}










//private String marca;
//public String tipo;
//public double potência;
//public double vidautil;
//public boolean ligada;