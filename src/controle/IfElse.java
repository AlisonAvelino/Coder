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
		
		
		System.out.print("Informe um n�mero: ");
		
		try {
			int numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("O n�mero � par!");
			}else {
				System.out.println("O n�mero � impar!");
			}
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado n�o � compat�vel!");
		}
		
		sc.close();
	}

}
