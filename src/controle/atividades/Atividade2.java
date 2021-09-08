package controle.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade2 {

	/** 2. Criar um programa informa se o ano atual é um ano bissexto; */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		
		try {
			int ano = sc.nextInt();
	
			int bissexto = ano % 4;
	
			if (bissexto == 0) {
				System.out.println(ano + " é um ano bissexto");
			} else {
				System.out.println(ano + " não é um ano bissexto");
			}
			sc.close();
			}catch(InputMismatchException ime) {
				System.out.println("O elemento informado não é um ano!");
			}
		}
	
}
