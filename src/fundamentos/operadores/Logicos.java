package fundamentos.operadores;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicional1 = true;
		boolean condicional2 = 3 > 7;
		
				
		// E - AND - &&
		System.out.println(condicional1 && condicional2);
		
		// OU - OR - ||
		System.out.println(condicional1 || condicional2);
		
		// XOR - ^
		System.out.println(condicional1 ^ condicional2);
		
		// NOT - !
		System.out.println(!condicional1);
		
		
	}

}
