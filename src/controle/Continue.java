package controle;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Continue {
	
	public static void main(String[] args) {
			/*O continue pula a senten�a e continua na execu��o do la�o*/
			for (int i = 0; i < 10; i++) {
				
				if(i % 2 == 1) {
					continue;
				}
				
				System.out.println(i);
			}
			System.out.println("Fim!");
		}

}
