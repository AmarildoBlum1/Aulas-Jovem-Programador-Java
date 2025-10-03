package testes;
import java.time.LocalDate;
import java.time.Period;

public class PessoaUtils {
	
	public int calcularIdade(LocalDate nascimento) {
	return Period.between(nascimento, LocalDate.now()).getYears();
	}
}