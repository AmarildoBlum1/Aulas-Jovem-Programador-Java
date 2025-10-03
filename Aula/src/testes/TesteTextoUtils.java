package testes;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TesteTextoUtils {

	@Test
	void testContarVogais() {
		
		TextoUtils textoUtils = new TextoUtils();
        String texto = "AEIOU";
        int esperado = 5;
        int resultado = textoUtils.contarVogais(texto);
        assertEquals(esperado, resultado);
        
        
        String texto2 = "ABCDEFG";
        int esperad = 10;
        int result = textoUtils.contarVogais(texto2);
        //assertEquals(esperad, result);
	}
}
