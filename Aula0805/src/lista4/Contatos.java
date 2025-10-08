package lista4;
import java.util.Scanner;

public class Contatos {
    private String nome;
    private String telefone;
    private String email;

    public Contatos(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String obterInformacoes() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
