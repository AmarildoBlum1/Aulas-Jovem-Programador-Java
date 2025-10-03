package lista5;

public class ContaEspecial extends ContaBancaria {

	public ContaEspecial(String nomeCliente, int numeroConta, double saldo) {
		super(nomeCliente, numeroConta, saldo);
		
	}
	
	private int limite = 100;
	
		public void sacar() {
			System.out.println("Digite o valor do saque");
			double ValorSaque = scanner.nextDouble();
			
			if (ValorSaque < getSaldo()) {
				setSaldo(getSaldo() - ValorSaque);
			}
			else if(ValorSaque <= (getSaldo() + limite)) {
				setSaldo(getSaldo() + limite - ValorSaque);
					
				}
			else if (ValorSaque > (getSaldo() + limite)) {
				System.out.println("Saldo indisponível");
			
			}
		}
}