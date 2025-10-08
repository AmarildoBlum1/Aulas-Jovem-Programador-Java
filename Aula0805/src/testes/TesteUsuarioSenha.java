package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteUsuarioSenha {

	@Test
	void test() {
		
		UsuarioSenha user = new UsuarioSenha();
		
		//assertTrue(user.senhaValida("asdasdasdasdasd"));
		
		assertTrue(user.senhaValida("Odlffrt4edfhma1234."));
	}

}
