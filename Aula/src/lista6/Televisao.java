package lista6;

 class Televisao extends DispositivoBase {
	 
	 private int volume;
	 private int canal;
	 
	 public Televisao(String nome) {
		super(nome);
		this.volume = 20;
		this.canal = 1;
	 }
	 
	 public void resetar() {
	        if (ligado) {
	            System.out.println(nome + " sendo resetada...");
	            this.volume = 20;
	            this.canal = 1;
	            System.out.println(nome + " resetada. Volume padrão: " + volume + ", Canal padrão: " + canal);
	        } else {
	            System.out.println(nome + " está desligada. Não é possível resetar.");
	        
	        }
	 	}
	 
	 
	 public void exibirStatus() {
	        super.exibirStatus();
	        if (ligado) {
	            System.out.println("  Volume: " + volume);
	            System.out.println("  Canal: " + canal);
	        }
	 }
	 
	 public void aumentarVolume() {
	        if (ligado && volume < 100) {
	            volume++;
	            System.out.println(nome + ": Volume aumentado para " + volume);
	        } else if (ligado) {
	            System.out.println(nome + ": Volume máximo atingido.");
	        } else {
	            System.out.println(nome + " está desligada. Não é possível aumentar o volume.");
	        }
	    }    
	 
	 public void diminuirVolume() {
	        if (ligado && volume > 0) {
	            volume--;
	            System.out.println(nome + ": Volume diminuído para " + volume);
	        } else if (ligado) {
	            System.out.println(nome + ": Volume mínimo atingido.");
	        } else {
	            System.out.println(nome + " está desligada. Não é possível diminuir o volume.");
	        }
	    }

	    public void mudarCanal(int novoCanal) {
	        if (ligado && novoCanal > 0) {
	            this.canal = novoCanal;
	            System.out.println(nome + ": Canal alterado para " + canal);
	        } else if (ligado) {
	            System.out.println(nome + ": Canal inválido.");
	        } else {
	            System.out.println(nome + " está desligada. Não é possível mudar o canal.");
	        }
	}
}
