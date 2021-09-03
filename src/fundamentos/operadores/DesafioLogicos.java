package fundamentos.operadores;

/**
 * 
 * @author AlisonAvellino
 *
 */

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Compramos a TV de 50\"? " + comprouTV50);
		System.out.println("Compramos a TV de 32\"? " + comprouTV32);
		System.out.println("Compramos sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
		
			
	}
}
