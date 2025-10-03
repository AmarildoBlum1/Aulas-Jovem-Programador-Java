package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteStringUtilss {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		StringUtilss String = new StringUtilss();
		
		assertEquals("Java é a melhor linguagem do mundo!", String.removerEspacosExtras("Java  é a   melhor   linguagem  do  mundo!"));
	
	
		//assertEquals("", String.removerEspacosExtras("  c   "));
	}

}
