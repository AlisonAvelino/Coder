package fundamentos;

import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */
public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		/* Com a convers�o para numero podemos efetuar c�lculos e chamar m�todos 
		 * a partir de um objeto instanciado 
		 */
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Digite o primeiro n�mero: ");
		 String valor1 = sc.next();
		 
		 System.out.print("Digite o segundo n�mero: ");
		 String valor2 = sc.next();		 
		 
		 System.out.println(valor1 + valor2);
		 
		 double numero1 = Double.parseDouble(valor1);
		 double numero2 = Double.parseDouble(valor2);
		 
		 double soma = numero1 + numero2;
		 System.out.println("Soma � " + soma);
		 System.out.println("M�dia � " + soma / 2);
		 
		 sc.close();
	}
}
