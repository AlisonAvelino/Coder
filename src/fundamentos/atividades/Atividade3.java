package fundamentos.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade3 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		try {
			System.out.print("Informe a sua altura: ");
			double alturaPessoa = sc.nextDouble();
			System.out.print("Informe o seu peso: ");
			double pesoPessoa = sc.nextDouble();
						
			double altura  = Math.pow(alturaPessoa, 2);
			
			double imc =(pesoPessoa/altura);
			
			 System.out.println("O IMC é " + imc);
			 
			 }catch(InputMismatchException ime) {
				 System.out.println("O elemento informado não está correto!");
			 }
		sc.close();
	}
}
