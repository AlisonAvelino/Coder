package fundamentos.desafios;

import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */
public class DesafioConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Informe o primeiro salário: ");
		 String salario1 = sc.next().replace(",", ".");
		 
		 System.out.print("Informe o segundo salário: ");
		 String salario2 = sc.next().replace(",", ".");
		 
		 System.out.print("Informe o terceiro salário: ");
		 String salario3 = sc.next().replace(",", ".");
		 
		 double numero1 = Double.parseDouble(salario1);
		 double numero2 = Double.parseDouble(salario2);
		 double numero3 = Double.parseDouble(salario3);
		 
		 double media = (numero1 + numero2 + numero3)/3;
		 
		 System.out.println("A média salárial é de R$ " + media);
		 
		 
		 sc.close();
	}
}
