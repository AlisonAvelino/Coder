package controle;

import java.util.Scanner;
/**
 * 
 * @author AlisonAvelino
 *
 */

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Ol� dev, fale as palavras m�gicas...");
			texto = sc.nextLine();
		}while(!texto.equalsIgnoreCase("hello world")); 
		
		System.out.println("Seja bem-vindo, pequeno gafanhoto!");
		sc.close();
	}
		
}


