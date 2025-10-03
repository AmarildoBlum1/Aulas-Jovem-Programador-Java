package lista6;

class Bicicleta extends MeioTransporteBase implements Avaliavel {
    private String tipo;
    private int marchas;
    private double mediaAvaliacoes;
    private int totalAvaliacoes;

    public Bicicleta(String nome, String tipo, int marchas) {
        super(nome);
        this.tipo = tipo;
        this.marchas = marchas;
        this.mediaAvaliacoes = 0.0;
        this.totalAvaliacoes = 0;
    }

    public void avaliar(int nota) {
        if (nota >= 1 && nota <= 5) {
            double somaAtual = mediaAvaliacoes * totalAvaliacoes;
            totalAvaliacoes++;
            mediaAvaliacoes = (somaAtual + nota) / totalAvaliacoes;
            System.out.println("A bicicleta " + nome + " (" + tipo + ") foi avaliada com nota " + nota + ". Média atual: " + String.format("%.1f", mediaAvaliacoes));
        } else {
            System.out.println("Nota inválida para a " + nome + ". Por favor, insira uma nota entre 1 e 5.");
        }
    }

    public void exibirDetalhesBicicleta() {
        System.out.println("Detalhes da Bicicleta: " + nome);
        System.out.println("  Tipo: " + tipo);
        System.out.println("  Marchas: " + marchas);
        exibirStatus();
        System.out.println("  Avaliação Média: " + String.format("%.1f", mediaAvaliacoes) + " (" + totalAvaliacoes + " avaliações)");
    }
}