package streams;

import java.util.function.UnaryOperator;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Utilitarios {
	
	private Utilitarios() {
		
	}
	
	public final static UnaryOperator<String> maiscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public final static UnaryOperator<String> atencao = n -> n + "!!!";
	
}
