package controle.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade5 {

	public static void main(String[] args) {
		/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */

		int contadorDeDivisores = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nInforme um numero para validar se é primo:");
		
		try {
			int numero = sc.nextInt();
	
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					contadorDeDivisores++;
				}
			}
	
			switch (contadorDeDivisores) {
	
			case 0:
				System.out.println("O numero " + numero + " é um numero primo.");
				break;
	
			default:
				System.out.println("O numero " + numero + "  não é um numero primo.");
	
			}
	
			sc.close();
	
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não é número!");
		}
	}
	
}
