package lista4;

public class Contador {

    private static int contagem = 0;

    public Contador() {
        contagem++;
    }

    public static void zerar() {
        contagem = 0;
    }

    public static void incrementar() {
        contagem++;
    }

    public static int getContagem() {
        return contagem;
    }
}