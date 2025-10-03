package lista4;

public class testeConversaoDeUnidadesDeTempo {

	public static void main(String[] args) {

        System.out.println("2 minutos equivalem a " + ConversaoDeUnidadesDeTempo.minutoParaSegundo(2) + " segundos.");
        System.out.println("1.5 horas equivalem a " + ConversaoDeUnidadesDeTempo.horaParaMinuto(1.5) + " minutos.");
        System.out.println("0.5 dias equivalem a " + ConversaoDeUnidadesDeTempo.diaParaHora(0.5) + " horas.");
        System.out.println("3 semanas equivalem a " + ConversaoDeUnidadesDeTempo.semanaParaDia(3) + " dias.");
        System.out.println("2 meses equivalem a " + ConversaoDeUnidadesDeTempo.mesParaDia(2) + " dias.");
        System.out.println("1 ano equivale a " + ConversaoDeUnidadesDeTempo.anoParaDia(1) + " dias.");
        System.out.println("0.25 anos equivalem a " + ConversaoDeUnidadesDeTempo.anoParaDia(0.25) + " dias.");
    }
}


