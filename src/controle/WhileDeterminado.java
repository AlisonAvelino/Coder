package controle;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class WhileDeterminado {
	
	public static void main(String[] args) {
		/*O while obt�m a inicializa��o da vari�vel fora do bloco e o incremento dentro do bloco*/
		
		int cont = 0;
		while(cont <= 10) {
			System.out.printf("i = %d\n", cont);
			cont++;
		}
	}

}
