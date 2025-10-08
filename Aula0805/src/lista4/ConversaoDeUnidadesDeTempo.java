package lista4;

public class ConversaoDeUnidadesDeTempo {

    public static double minutoParaSegundo(double minutos) {
        return minutos * 60;
    }

    public static double horaParaMinuto(double horas) {
        return horas * 60;
    }

    public static double diaParaHora(double dias) {
        return dias * 24;
    }

    public static double semanaParaDia(double semanas) {
        return semanas * 7;
    }

    public static double mesParaDia(double meses) {
        return meses * 30;
    }

    public static double anoParaDia(double anos) {
        return anos * 365.25;
    }

}