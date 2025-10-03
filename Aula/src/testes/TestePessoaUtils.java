package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestePessoaUtils {

	@Test
	void test() {
		
		PessoaUtils pessoa = new PessoaUtils();
		
		//LocalDate nascimentoPassadoDistante = LocalDate.of(1980, 5, 15);
       // int idadePassadoDistante = pessoa.calcularIdade(nascimentoPassadoDistante);
        //assertEquals(45, idadePassadoDistante);

        LocalDate nascimentoEsteAnoNaoAniversario = LocalDate.of(2025, 12, 10);
        int idadeEsteAnoNaoAniversario = pessoa.calcularIdade(nascimentoEsteAnoNaoAniversario);
        assertEquals(1, idadeEsteAnoNaoAniversario);
        
	}
}