package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Vilao;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Jogo {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(10, 10);

		Vilao vilao = new Vilao(10, 11);
		
		System.out.println("::::::::::::::In�cio::::::::::::::");
		System.out.printf("Her�i possui: %d de vida.\n", heroi.vida);
		System.out.printf("Vil�o possui: %d de vida.\n", vilao.vida);
		
		heroi.atacar(vilao);
		vilao.atacar(heroi);
		
		System.out.printf("Her�i possui: %d de vida.\n", heroi.vida);
		System.out.printf("Vil�o possui: %d de vida.\n", vilao.vida);
		
			
		
	}
	
}
