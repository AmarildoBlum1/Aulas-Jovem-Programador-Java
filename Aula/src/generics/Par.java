package generics;

public class Par<T, U> {
    private T primeiro;
    private U segundo;

    public Par(T primeiro, U segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Par [primeiro=" + primeiro + ", segundo=" + segundo + "]";
    }
}