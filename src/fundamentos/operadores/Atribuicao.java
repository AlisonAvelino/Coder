package fundamentos.operadores;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		//Operadores de atribuição binarios
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		c %= 2; // c = c % 2;
		
		System.out.println(c);
		
	}
}
