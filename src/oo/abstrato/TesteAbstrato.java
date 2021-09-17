package oo.abstrato;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class TesteAbstrato {
	
	public static void main(String[] args) {
		Cachorro caramelo = new Cachorro();
		
		System.out.println(caramelo.respirar());
		System.out.println(caramelo.mover());
		System.out.println(caramelo.mamar());
	}
	
}
