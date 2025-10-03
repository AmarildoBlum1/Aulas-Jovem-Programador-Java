package lista6;

class Carro extends MeioTransporteBase implements Avaliavel {
    private String placa;
    private int anoFabricacao;
    private double mediaAvaliacoes;
    private int totalAvaliacoes;

    public Carro(String nome, String placa, int anoFabricacao) {
        super(nome);
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.mediaAvaliacoes = 0.0;
        this.totalAvaliacoes = 0;
    }

    public void avaliar(int nota) {
        if (nota >= 1 && nota <= 5) {
            double somaAtual = mediaAvaliacoes * totalAvaliacoes;
            totalAvaliacoes++;
            mediaAvaliacoes = (somaAtual + nota) / totalAvaliacoes;
            System.out.println("O carro " + nome + " (" + placa + ") foi avaliado com nota " + nota + ". Média atual: " + String.format("%.1f", mediaAvaliacoes));
        } else {
            System.out.println("Nota inválida para o " + nome + ". Por favor, insira uma nota entre 1 e 5.");
        }
    }

    public void exibirDetalhesCarro() {
        System.out.println("Detalhes do Carro: " + nome);
        System.out.println("  Placa: " + placa);
        System.out.println("  Ano de Fabricação: " + anoFabricacao);
        exibirStatus();
        System.out.println("  Avaliação Média: " + String.format("%.1f", mediaAvaliacoes) + " (" + totalAvaliacoes + " avaliações)");
    }
}
