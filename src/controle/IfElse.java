package controle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class IfElse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe um número: ");
		
		try {
			int numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("O número é par!");
			}else {
				System.out.println("O número é impar!");
			}
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não é compatível!");
		}
		
		sc.close();
	}

}
