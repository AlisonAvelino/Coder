package controle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class If {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a m�dia do aluno: ");
		try {
			double media = sc.nextDouble();
			
			if (media <= 10 && media >= 7) {
				System.out.println("Est� aprovado.");
				System.out.println("Parab�ns!!");
			}
			
			if (media < 7 && media >= 4.5) {
				System.out.println("Em recupera��o.");
			}
			
			if (media < 4.5 && media >= 0) {
				System.out.println("Reprovado.");
			}
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado n�o est� correto.");
			
		}
		
		sc.close();
	}

}
