package lista5;

public class ContaPoupanca extends ContaBancaria {
	

	public ContaPoupanca(String nomeCliente, int numeroConta, double saldo) {
		super(nomeCliente, numeroConta, saldo);
		
	}
	
	public void calcularNovoSaldo() {
		double diaRendimento = getSaldo() * 0.01;
		setSaldo(getSaldo() + diaRendimento); 
		
		System.out.println("Saldo após um rendimento: " + getSaldo());
	
	}
} 