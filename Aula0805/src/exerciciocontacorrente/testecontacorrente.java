package exerciciocontacorrente;

public class testecontacorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.cadastrarcliente();
		
		conta.depositar();
		
		conta.consultarsaldo();
		
		conta.saque();
		
		conta.consultarsaldo();
		
		conta.consultacheque();
		
	}
}
