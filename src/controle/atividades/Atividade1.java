package controle.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade1 {
	
	/*
	  1. Criar um programa que receba um número e verifique se ele está entre 0 e
	  10 e é par;
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		try {
			int numero = sc.nextInt();
	
			if (numero >= 0 && numero <= 10) {
				if (numero % 2 == 0) {
					System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
				} else {
					System.out.println("O numero " + numero + " está entre 0 e 10 mas não é um par.");
				}
			} else {
				System.out.println("O numero " + numero + " não está entre 0 e 10.");
			}
			sc.close();
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não é um número!");
		}
	}

}
