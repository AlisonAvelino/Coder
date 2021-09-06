package controle;

import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String valor ="";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.printf("Digite algo: ");
			valor = sc.nextLine();
			
		}
		sc.close();
	}

}
