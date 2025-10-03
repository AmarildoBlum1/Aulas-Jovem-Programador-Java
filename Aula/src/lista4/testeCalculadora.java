package lista4;

public class testeCalculadora {

	 public static void main(String[] args) {
		 
	        Calculadora minhaCalculadora = new Calculadora();

	        double resultadoSoma = minhaCalculadora.somar(10, 5);
	        System.out.println("10 + 5 = " + resultadoSoma);

	        double resultadoSubtracao = minhaCalculadora.subtrair(20, 7);
	        System.out.println("20 - 7 = " + resultadoSubtracao);

	        double resultadoMultiplicacao = minhaCalculadora.multiplicar(4, 6);
	        System.out.println("4 * 6 = " + resultadoMultiplicacao);

	        try {
	            double resultadoDivisao = minhaCalculadora.dividir(100, 4);
	            System.out.println("100 / 4 = " + resultadoDivisao);

	            
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        double resultadoPotencia1 = minhaCalculadora.potencia(2, 3);
	        System.out.println("2 elevado a 3 = " + resultadoPotencia1);

	        double resultadoPotencia2 = minhaCalculadora.potencia(5, 0);
	        System.out.println("5 elevado a 0 = " + resultadoPotencia2);

	        double resultadoPotencia3 = minhaCalculadora.potencia(3, 4);
	        System.out.println("3 elevado a 4 = " + resultadoPotencia3);
	    }

}
