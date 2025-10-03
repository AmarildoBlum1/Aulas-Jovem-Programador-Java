package lista6;

 class Notebook extends DispositivoBase {
	 
	 private int nivelBateria;

	public Notebook(String nome) {
		super(nome);
		this.nivelBateria = 100;
	}
	
	public void resetar() {
        if (ligado) {
            System.out.println(nome + " sendo resetado (reiniciando sistema)...");
            System.out.println(nome + " desligado para reset.");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.ligado = true;
            this.nivelBateria = 100;
            System.out.println(nome + " resetado e ligado. Nível da bateria: " + nivelBateria + "%");
        } else {
            System.out.println(nome + " está desligado. Não é possível resetar.");
        }
    }

    public void exibirStatus() {
        super.exibirStatus();
        if (ligado) {
            System.out.println("  Nível da Bateria: " + nivelBateria + "%");
        }
    }

    public void carregarBateria(int porcentagem) {
        if (ligado && nivelBateria < 100) {
            nivelBateria = Math.min(100, nivelBateria + porcentagem);
            System.out.println(nome + ": Bateria carregada para " + nivelBateria + "%");
        } else if (ligado) {
            System.out.println(nome + ": Bateria já está cheia.");
        } else {
            System.out.println(nome + " está desligado. Não é possível carregar a bateria.");
        }
    }
 }
