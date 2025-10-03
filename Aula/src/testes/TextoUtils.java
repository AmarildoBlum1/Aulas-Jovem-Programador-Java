package testes;

public class TextoUtils {
	
	public int contarVogais(String texto) {
		 int count = 0;
		 for (char c : texto.toLowerCase().toCharArray()) {
		 if ("aeiou".indexOf(c) != -1) {
		 count++;
		 }
	}
		 return count;
	}
}

