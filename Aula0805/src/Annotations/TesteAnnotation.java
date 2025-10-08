package Annotations;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TesteAnnotation {
	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("Pedro", "3214356456", LocalDate.of(2005, Month.JANUARY, 10));
		//Usuario usuario2 = new Usuario("João", "23423445346", LocalDate.of(2000, Month.JANUARY, 10));
		System.out.println(validador(usuario1));
	}
	
	public static <T> boolean validador(T objeto) {
		Class<?> classe = objeto.getClass();
		for (Field field: classe.getDeclaredFields()) {
			if (field.isAnnotationPresent(IdadeMinima.class)) {
				IdadeMinima idademinima = field.getAnnotation(IdadeMinima.class);
				
				try {
					field.setAccessible(true);
					LocalDate dataNascimento = (LocalDate) field.get(objeto);
					int anonasc = dataNascimento.getYear();
					int idade = LocalDate.now().getYear() - anonasc;
					System.out.println("Idade: " + idade);
					return Period.between(dataNascimento, LocalDate.now()).getYears() >= idademinima.valor();
					
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
}
