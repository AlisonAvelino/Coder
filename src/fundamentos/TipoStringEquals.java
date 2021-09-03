package fundamentos;

import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class TipoStringEquals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Comparação de string de forma incorreta.
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		
		//Comparação de string de forma correta.
		System.out.println("2".equals(s1));
		
		String s2 = sc.next();
		System.out.println("2".equals(s2.trim()));
		
		sc.close();
		
	}
	
}
