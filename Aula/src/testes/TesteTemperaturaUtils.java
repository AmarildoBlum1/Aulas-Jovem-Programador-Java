package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTemperaturaUtils {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		TemperaturaUtils temperatura = new TemperaturaUtils();
		
		//assertEquals(32.0, temperatura.celsiusParaFahrenheit(0.0), 0.001);
		
		assertEquals(14.0, temperatura.celsiusParaFahrenheit(-11.0), 0.001);
	}

}
