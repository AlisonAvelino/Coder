package controle.atividades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade6 {
	
	/**
	 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
	 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
	 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
	 * que o número armazenado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		try {
			do {
				System.out.println("Sorteando numero entre 0 e 100...\n");
				Random numeroAleatorio = new Random();
				numeroSorteado = numeroAleatorio.nextInt(101);
	
				System.out.println("Começou o jogo! Sera que consegue me vencer?");
				tentativas = 0;
	
				do {
					tentativas++;
					System.out.printf("Tentativa %d: ", tentativas);
					numero = sc.nextInt();
	
					if (numero > numeroSorteado) {
	
						System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);
	
					} else if (numero < numeroSorteado) {
	
						System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);
	
					} else {
	
						System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
	
					}
	
				} while (numero != numeroSorteado);
	
				System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
				continuar = sc.nextInt();
	
			} while (continuar != 0);
	
			sc.close();
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não é um número!");
		}
	}

}
