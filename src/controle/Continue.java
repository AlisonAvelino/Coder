package controle;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Continue {
	
	public static void main(String[] args) {
			/*O continue pula a sentença e continua na execução do laço*/
			for (int i = 0; i < 10; i++) {
				
				if(i % 2 == 1) {
					continue;
				}
				
				System.out.println(i);
			}
			System.out.println("Fim!");
		}

}
