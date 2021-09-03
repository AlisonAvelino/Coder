package fundamentos.atividades;

import java.util.Scanner;


/**
 * 
 * @author AlisonAvelino
 *
 */
public class Atividade4 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		double valor = sc.nextDouble();
		
				
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
		sc.close();
	}
}
