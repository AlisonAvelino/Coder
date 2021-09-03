package fundamentos.atividades;

import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade5 {
	

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite a Base:");
		double base = sc.nextDouble();
		
		System.out.println("Digite a Altura:");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A Área do Triângulo é: " + area);
		
		sc.close();
	}

}
