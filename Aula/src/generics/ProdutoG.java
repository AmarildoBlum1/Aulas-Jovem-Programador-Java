package generics;

public class ProdutoG<T> {
    private T codigo;
    private String nome;

    public ProdutoG(T codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public T getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + "]";
    }
}