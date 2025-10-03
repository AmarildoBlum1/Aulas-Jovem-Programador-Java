package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteArrayUtils {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		ArrayUtils array = new ArrayUtils();
		
		//int[] arrayPar = {1, 2, 3, 4, 5, 6};
        //int[] esperadoPar = {6, 5, 4, 3, 2, 1};
        //assertArrayEquals(esperadoPar, array.inverter(arrayPar));
        
        int[] arrayVazio = {1};
        int[] esperadoVazio = {};
        assertArrayEquals(esperadoVazio, array.inverter(arrayVazio));
	}

}
