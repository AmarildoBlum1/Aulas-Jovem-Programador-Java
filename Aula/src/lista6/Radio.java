package lista6;

class Radio extends DispositivoBase {
	
    private double frequencia;
    private String banda;

    public Radio(String nome) {
        super(nome);
        this.frequencia = 98.1;
        this.banda = "FM";    
    }

    public void resetar() {
        if (ligado) {
            System.out.println(nome + " sendo resetado...");
            this.frequencia = 98.1;
            this.banda = "FM";
            System.out.println(nome + " resetado. Frequência padrão: " + frequencia + ", Banda padrão: " + banda);
        } else {
            System.out.println(nome + " está desligado. Não é possível resetar.");
        }
    }

    public void exibirStatus() {
        super.exibirStatus();
        if (ligado) {
            System.out.println("  Frequência: " + frequencia + " " + banda);
        }
    }

    public void sintonizar(double novaFrequencia, String novaBanda) {
        if (ligado) {
            if (novaBanda.equalsIgnoreCase("AM") || novaBanda.equalsIgnoreCase("FM")) {
                this.frequencia = novaFrequencia;
                this.banda = novaBanda.toUpperCase();
                System.out.println(nome + ": Sintonizado em " + frequencia + " " + banda);
            } else {
                System.out.println(nome + ": Banda inválida. Use AM ou FM.");
            }
        } else {
            System.out.println(nome + " está desligado. Não é possível sintonizar.");
        }
    }
}