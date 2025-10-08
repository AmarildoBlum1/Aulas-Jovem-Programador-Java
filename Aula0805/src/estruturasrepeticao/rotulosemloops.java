package estruturasrepeticao;

public class rotulosemloops {

	public static void main(String[] args) {
		
		loop1:
		for(int i=3; i>0; i--) {
			loop2:
			for(int j=1; j<=3; j++) {
			System.out.println("i " + i + " J " + j);
			if(i==2 && j==2) {
				break loop1;
				}
			}
		}
	}
}
