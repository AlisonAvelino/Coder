package controle.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade4 {
	
	/**
	 * 4. Criar um programa que receba um número e diga se ele é um número primo.
	 */
	public static void main(String[] args) {

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
	
			if (contadorDeDivisores == 0) {
				System.out.println("\nO numero " + numero + " é primo.");
			} else {
				System.out.println("\nO numero " + numero + " não é primo.");
			}
	
			sc.close();
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não é um número");
		}
		
	}

}
