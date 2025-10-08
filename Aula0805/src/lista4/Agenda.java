package lista4;
import java.util.Scanner;

public class Agenda {
	
    private String nome;
    private Contatos[] contatos;

    public Agenda(String nome) {
        this.nome = nome;
        this.contatos = new Contatos[3];
    }

    public String getNome() {
        return nome;
    }

    public void adicionarContato(int posicao, Contatos contato) {
        if (posicao >= 0 && posicao < contatos.length) {
            this.contatos[posicao] = contato;
        } else {
            System.out.println("Posição inválida para adicionar contato.");
        }
    }

    public String obterInformacoesContato(int posicao) {
        if (posicao >= 0 && posicao < contatos.length && contatos[posicao] != null) {
            return contatos[posicao].obterInformacoes();
        }
        return "Contato não encontrado na posição " + posicao;
    }

    public String obterTodosOsContatos() {
        StringBuilder infoCompleta = new StringBuilder();
        infoCompleta.append("--- Agenda: ").append(nome).append(" ---\n");
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                infoCompleta.append("Contato ").append(i + 1).append(": ").append(contatos[i].obterInformacoes()).append("\n");
            } else {
                infoCompleta.append("Contato ").append(i + 1).append(": Vazio\n");
            }
        }
        return infoCompleta.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da Agenda: ");
        String nomeAgenda = scanner.nextLine();
        Agenda minhaAgenda = new Agenda(nomeAgenda);

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Cadastrando Contato " + (i + 1) + " ---");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            Contatos novoContato = new Contatos(nome, telefone, email);
            minhaAgenda.adicionarContato(i, novoContato);
        }

        System.out.println("\n" + minhaAgenda.obterTodosOsContatos());

        System.out.println(minhaAgenda.obterInformacoesContato(0));
        System.out.println(minhaAgenda.obterInformacoesContato(1));

    }
}