package testes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteStringUtils {

	@Test
	void test() {
		
		StringUtils palindromo = new StringUtils();
		
		//assertTrue(palindromo.isPalindromo("arara"));
		
		assertTrue(palindromo.isPalindromo("papagaio"));
		
	}
}
