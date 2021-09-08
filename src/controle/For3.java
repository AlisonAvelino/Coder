package controle;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class For3 {
	
	public static void main(String[] args) {
			
		/*Utilizando um for para percorrer um array bidimensional*/
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					System.out.printf("[%d %d]", i, j);
				}
				System.out.println();
			}
	}

}
