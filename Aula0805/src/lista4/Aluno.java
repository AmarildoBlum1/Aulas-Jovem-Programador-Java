package lista4;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNota(int indice, double nota) {
        if (indice >= 0 && indice < 4) {
            this.notas[indice] = nota;
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public String obterInformacoes() {
        return "Aluno: " + nome + ", Matrícula: " + matricula;
    }
}