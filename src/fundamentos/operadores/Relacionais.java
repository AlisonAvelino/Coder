package fundamentos.operadores;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 8+2;
		
		//Operadores relacionais
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(3 > 4);
		System.out.println(3 < 7);
		System.out.println(3 >= 3);
		System.out.println(10 <= 7);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}
}
