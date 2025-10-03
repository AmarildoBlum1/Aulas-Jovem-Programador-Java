package lista4;

import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Digite o horário do Curso: ");
        String horarioCurso = scanner.nextLine();

        Curso meuCurso = new Curso(nomeCurso, horarioCurso);

        System.out.println("\n--- Informações do Professor ---");
        System.out.print("Nome do Professor: ");
        String nomeProf = scanner.nextLine();
        System.out.print("Departamento do Professor: ");
        String deptoProf = scanner.nextLine();
        System.out.print("Email do Professor: ");
        String emailProf = scanner.nextLine();
        meuCurso.setProfessor(new Professor(nomeProf, deptoProf, emailProf));

        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Cadastro do Aluno " + (i + 1) + " ---");
            System.out.print("Nome do Aluno: ");
            String nomeAluno = scanner.nextLine();
            System.out.print("Matrícula do Aluno: ");
            String matriculaAluno = scanner.nextLine();
            Aluno aluno = new Aluno(nomeAluno, matriculaAluno);

            System.out.println("Digite as 4 notas para " + nomeAluno + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                aluno.setNota(j, nota);
            }
            scanner.nextLine();
            meuCurso.adicionarAluno(aluno, i);
        }

        System.out.println("\n--- Resultados dos Alunos ---");
        for (Aluno aluno : meuCurso.getAlunos()) {
            if (aluno != null) {
                double media = aluno.calcularMedia();
                System.out.printf("%s (Matrícula: %s): Média = %.2f - Situação: %s%n",
                                   aluno.getNome(), aluno.getMatricula(), media,
                                   aluno.estaAprovado() ? "APROVADO" : "REPROVADO");
            }
        }

        System.out.printf("\n--- Média da Turma: %.2f ---%n", meuCurso.calcularMediaTurma());

        scanner.close();
    }
}