package debug;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseContaCorrente {

	@Test
	void testRealizarSaque() {
		//fail("Not yet implemented");
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.saldo = 1000;
		assertTrue(conta.realizarSaque(999));
	}
}