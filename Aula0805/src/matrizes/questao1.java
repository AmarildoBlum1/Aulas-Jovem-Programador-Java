package matrizes;

public class questao1 {

	public static void main(String[] args) {
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		int[][] matriz1 = {{1,2,3,4}, {3,4,5,6}, {6,7,8,9},{9,10,11,12}};
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = i + j;
			
		
				soma += matriz1[i][j];
				if(matriz1[i][j] %2 ==0) {
					somaPares += matriz1[i][j];

				}
				else {
					somaImpares += matriz1[i][j];
				}
			}
			
		}
		
		System.out.println(" Soma: " + soma);
		System.out.println(" SomaPares: " + somaPares);
		System.out.println(" SomaImpares: " + somaImpares);

	}

}