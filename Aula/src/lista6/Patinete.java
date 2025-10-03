package lista6;

class Patinete extends MeioTransporteBase implements Avaliavel {
    private boolean eletrico;
    private double autonomiaKm;
    private double mediaAvaliacoes;
    private int totalAvaliacoes;

    public Patinete(String nome, boolean eletrico, double autonomiaKm) {
        super(nome);
        this.eletrico = eletrico;
        this.autonomiaKm = autonomiaKm;
        this.mediaAvaliacoes = 0.0;
        this.totalAvaliacoes = 0;
    }

    public void avaliar(int nota) {
        if (nota >= 1 && nota <= 5) {
            double somaAtual = mediaAvaliacoes * totalAvaliacoes;
            totalAvaliacoes++;
            mediaAvaliacoes = (somaAtual + nota) / totalAvaliacoes;
            System.out.println("O patinete " + nome + " foi avaliado com nota " + nota + ". Média atual: " + String.format("%.1f", mediaAvaliacoes));
        } else {
            System.out.println("Nota inválida para o " + nome + ". Por favor, insira uma nota entre 1 e 5.");
        }
    }

    public void exibirDetalhesPatinete() {
        System.out.println("Detalhes do Patinete: " + nome);
        System.out.println("  Elétrico: " + (eletrico ? "Sim" : "Não"));
        System.out.println("  Autonomia: " + autonomiaKm + " km");
        exibirStatus();
        System.out.println("  Avaliação Média: " + String.format("%.1f", mediaAvaliacoes) + " (" + totalAvaliacoes + " avaliações)");
    }
}