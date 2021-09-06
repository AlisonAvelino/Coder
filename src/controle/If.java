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
		
		System.out.print("Informe a média do aluno: ");
		try {
			double media = sc.nextDouble();
			
			if (media <= 10 && media >= 7) {
				System.out.println("Está aprovado.");
				System.out.println("Parabéns!!");
			}
			
			if (media < 7 && media >= 4.5) {
				System.out.println("Em recuperação.");
			}
			
			if (media < 4.5 && media >= 0) {
				System.out.println("Reprovado.");
			}
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não está correto.");
			
		}
		
		sc.close();
	}

}
