package lista6;

	abstract class PedidoBase implements Pedido {
	
	protected String nomePedido;
	protected  double preco;
	protected  boolean status;
	
	public PedidoBase(String nomePedido, double preco, boolean status) {
		super();
		this.nomePedido = nomePedido;
		this.preco = preco;
		this.status = false;
	}

		public void preparar() {
			status = true;
		}
		
		public void entregar() {
			if (status) {
				status = true;
				System.out.println("Seu pedido saiu para entrega");
			}
			else {
				
				System.out.println("Seu pedido ainda não está pronto");
			}
		}	
}

