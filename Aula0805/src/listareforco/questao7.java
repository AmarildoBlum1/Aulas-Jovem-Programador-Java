package listareforco;
import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double valorcompra = 32.87 * 1000;
		double comissaopagaaocomprar = valorcompra * 0.02;
		double valorvenda = 33.92 * 1000;
		double valorvendaacao = valorvenda * 0.02;
		double lucro = valorvenda - valorcompra;
		
		System.out.println("José pagou pelas ações o valor de R$: " + valorcompra);
		System.out.println("José pagou de comissão na compra das ações um valor de R$: " + comissaopagaaocomprar);
		System.out.println("José vendeu as ações por R$: " + valorvenda);
		System.out.println("José pagou de comissão na venda das ações um valor de R$: " + valorvendaacao);
		System.out.println("José lucrou com as transações um total de R$: " + lucro);
		
	}

}
