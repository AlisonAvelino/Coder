package controle;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Break {
	
	public static void main(String[] args) {
		
		/*O break interrompe de forma abrupta a execução do laço*/
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		System.out.println("Fim!");
	}

}
