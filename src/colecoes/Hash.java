package colecoes;

import java.util.HashSet;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Hash {
	/*Hash:
	 - O hashCode() é usado para objetos do tipo Collection;
	 - Serve como filtro para o equals.
	 */
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario ("Pedro"));
		usuarios.add(new Usuario ("Ana"));
		usuarios.add(new Usuario ("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario ("Guilherme"));
		
		System.out.println(resultado);
		
		
	}

}
