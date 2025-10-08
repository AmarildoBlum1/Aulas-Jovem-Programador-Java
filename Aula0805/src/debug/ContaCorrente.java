package debug;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	String[] situacaoConta = new String[2];
	
	boolean realizarSaque(double valorSaque) {
		
		if(saldo >= valorSaque ){ // tem saldo em conta
			this.saldo -=valorSaque;
			return true;
		}else { // n�o tem saldo em conta suficiente
			if(especial) {// verifica se � especial
				double limite = limiteEspecial + saldo;
				if(limite >= valorSaque) {// verifica se o limite especial tem saldo 
					//saldo -=valorSaque;
					limite -=valorSaque;
					return true;
				}else {
					return false;
				}
				
			}else {// n�o � especial e n�o tem saldo suficiente
				return false;
			}
		}
	}
	
	void depositar(double valorDepositado) {
		this.saldo =+ valorDepositado;
	}
	
	void consultarSaldo() {
		//int teste = 0;
		System.out.println("Saldo atual da conta � " + saldo);
		//teste = teste +1;
	
		}
	
	boolean verificarUsoChequeEspecial() {
		return (saldo < 0);
	}	
}