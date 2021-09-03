package fundamentos.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a temperatura em °C: ");
		
		try {
			double celsius = sc.nextDouble();
						
			double fahrenheit  = (celsius * 1.8) + 32;
			 System.out.printf("A temperatura é "+"%.1f" +"°F",fahrenheit);
			 
			 }catch(InputMismatchException ime) {
				 System.out.println("O elemento informado não está correto!");
			 }
		sc.close();
	}

}
