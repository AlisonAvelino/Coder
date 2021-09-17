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
		
		System.out.println("::::::::::::::Início::::::::::::::");
		System.out.printf("Herói possui: %d de vida.\n", heroi.vida);
		System.out.printf("Vilão possui: %d de vida.\n", vilao.vida);
		
		heroi.atacar(vilao);
		vilao.atacar(heroi);
		
		System.out.printf("Herói possui: %d de vida.\n", heroi.vida);
		System.out.printf("Vilão possui: %d de vida.\n", vilao.vida);
		
			
		
	}
	
}
