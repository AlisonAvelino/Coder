package fundamentos.desafios;

import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Estrutura
		System.out.print("Informe o primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Informe a operação: ");
		String op = sc.next();
		
		System.out.print("Informe o segundo número: ");
		double num2 = sc.nextDouble();
		
		//Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		
		sc.close();
		
	}

}
