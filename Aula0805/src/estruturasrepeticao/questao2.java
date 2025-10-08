package estruturasrepeticao;

public class questao2 {

	public static void main(String[] args) {
		
		int contador = 0;
		int numeroAtual = 1001;
		int quintoNumero =0;
		
		System.out.println("Encontrando o quinto numero maior que 1000,cuja divisão por 11 tenha o resto 5");
		
		while (contador <5) {
			if (numeroAtual %11 ==5) {
				contador++;
				quintoNumero = numeroAtual;
				
				System.out.println("Número encontrado " + contador + ": " +numeroAtual);
			}
			numeroAtual++;
		}
		System.out.println("Quinto numero maior que 1000, cuja divisão por 11 tenha o resto 5 é: " + quintoNumero);
	}

}
