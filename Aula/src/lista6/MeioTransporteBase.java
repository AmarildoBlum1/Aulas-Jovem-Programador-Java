package lista6;

abstract class MeioTransporteBase implements Transporte {
    protected String nome;
    protected boolean viagemEmAndamento;

    public MeioTransporteBase(String nome) {
        this.nome = nome;
        this.viagemEmAndamento = false; 
    }

    public void iniciarViagem() {
        if (!viagemEmAndamento) {
            viagemEmAndamento = true;
            System.out.println(nome + " iniciou a viagem.");
        } else {
            System.out.println(nome + " já está em uma viagem.");
        }
    }

    public void finalizarViagem() {
        if (viagemEmAndamento) {
            viagemEmAndamento = false;
            System.out.println(nome + " finalizou a viagem.");
        } else {
            System.out.println(nome + " não está em uma viagem para finalizar.");
        }
    }

    public void exibirStatus() {
        String statusViagem = viagemEmAndamento ? "em andamento" : "parado";
        System.out.println("Status do " + nome + ": " + statusViagem);
    }
}