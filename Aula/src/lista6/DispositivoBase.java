package lista6;

 abstract class DispositivoBase implements DispositivoEletronico {
	 
	 protected  String nome;
	 protected boolean ligado;
	 
	 public DispositivoBase(String nome) {
		 this.nome = nome;
		 this.ligado = false;
	 }
	 
	 public void ligar() {
		 if (!ligado) {
			 ligado = true;
			 System.out.println(nome + " foi ligado.");
		 }
		 else {
			 System.out.println(nome + " já está ligado");
		 }
	 }
	 public void desligar() {
		 if (ligado) {
			 ligado = false;
			 System.out.println(nome + " foi desligado");
		 }
		 else {
			 System.out.println(nome + " já está desligado");
		 }
	 }
	public void exibirStatus() {
		String status = ligado ? "ligado" : "desligado";
        System.out.println("Status do " + nome + ": " + status);
	}

}
