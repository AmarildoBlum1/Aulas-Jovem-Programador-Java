package generics;
import java.text.NumberFormat;
import java.util.Locale;

public class ValorM {
	private double valor;

    public ValorM(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return nf.format(valor);
    }
}

