package estruturasrepeticao;

public class whilefor {

	public static void main(String[] args) {
		
		int contador =0;
		
		while (contador < 10) {
			System.out.println("Eu amo bacon!");
			
			contador = contador +1;
			
			//while quando sabemos o numero de repetições
			
		//flag quando nao sabemos o numero de repetiçoes
			
		//for 
			
			for (int i = 0 ; i <10; i++); {
				System.out.println("Eu amo bacon!");
			}
			
			//do-while
			
			int i = 0;
			
			do{
				System.out.println("Eu amo bacon!");
				i++;
			}while(i <10);
		}
		
		//for (int i = 0 ; i <10; i++) {
		//	System.out.println("Vou imprimir o i do for EXTERNO " + i++);
			//for (int j = 0 ; j <10; i++) {
				System.out.println("Vou imprimir 100 vezes");
			//}
		//}
		
		//break
		
		int xis, ypsilon;
		xis = 100;
		ypsilon = 500;
		
		
		for (int i = xis; i<ypsilon; i++) {
			if(i%19 == 0) {
				System.out.println("Achei um numero divisivel por 19 entre x e y: " +i);
				break; 
			}
		}
				
				
			//continue; // obriga o loop a executar o proximo laço
		for (int i = 0 ; i <100; i++) {
			if (60 > 50 && 51 < 60) {
				continue;
			}
			System.out.println(i);
		}
	}
}
