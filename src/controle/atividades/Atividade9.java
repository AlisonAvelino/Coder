package controle.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade9 {

	/**
	 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;
		
		
		try {
			do {
				System.out.print("Digite um numero: ");
				int valor = sc.nextInt();
	
				if (valor > maiorValor) {
					maiorValor = valor;
				}
	
				contador++;
			} while (contador != 10);
	
			System.out.printf("O maior valor foi: " + maiorValor);
			sc.close();
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não é um número.");
		}
		
	}
	
}
