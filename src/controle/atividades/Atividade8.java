package controle.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade8 {
	
	/**
	 * 7. Criar um programa que enquanto estiver recebendo números positivos,
	 * imprime no console a soma dos números inseridos, caso receba um número
	 * negativo, encerre o programa. Tente utilizar a estrutura do while.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		try {
			while (numero >= 0) {
				System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
				numero = sc.nextInt();
				if (numero >= 0) {
					somadorDeNumeros += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
					System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
				}
			}
			sc.close();
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não é um número!");
		}
	}

}
