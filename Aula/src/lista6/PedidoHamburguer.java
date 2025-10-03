package lista6;
import java.util.Scanner;

 class PedidoHamburguer extends PedidoBase {

	public PedidoHamburguer(String nomePedido, double preco, boolean status) {
		super(nomePedido, preco, status);
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void realizarPedido() {
		System.out.println("Digite o nome do pedido");
		this.nomePedido = scanner.next();
		
		System.out.println("Digite o preço do produto");
		this.preco = scanner.nextDouble();

		System.out.println("Digite 'sim' se estiver disponivel ou 'não' se não estiver");
		this.status = scanner.nextBoolean();
	}
}
