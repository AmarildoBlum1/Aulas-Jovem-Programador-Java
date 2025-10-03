package desafios;

public class inverterpalavras {
	
	public String inverterpalavras(String frase) {
		String[] palavras = frase.split(" ");
	
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i].length() >= 5) {
				palavras[i] = new StringBuilder(palavras[i]).reverse().toString();
			}
		}
		
		return String.join(" ", palavras);
	}

}
