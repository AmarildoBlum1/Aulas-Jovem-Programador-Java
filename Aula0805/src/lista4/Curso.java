package lista4;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        this.alunos = new Aluno[5];
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno, int posicao) {
        if (posicao >= 0 && posicao < alunos.length) {
            this.alunos[posicao] = aluno;
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public double calcularMediaTurma() {
        double somaMedias = 0;
        int numAlunosComNota = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                somaMedias += aluno.calcularMedia();
                numAlunosComNota++;
            }
        }
        return numAlunosComNota > 0 ? somaMedias / numAlunosComNota : 0;
    }
}