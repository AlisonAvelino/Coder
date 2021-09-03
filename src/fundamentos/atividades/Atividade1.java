package fundamentos.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */
public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a temperatura em °F: ");
		
		try {
			double fahrenheit = sc.nextDouble();
			int X = 32;
			double Y = 5.0/9.06;
			
			double celsius = (fahrenheit - X) * Y;
			 System.out.printf("A temperatura é "+"%.2f" +"°C",celsius);
			 
			 }catch(InputMismatchException ime) {
				 System.out.println("O elemento informado não está correto!");
			 }
		sc.close();
	}

}
