package fundamentos;

import java.util.Scanner;
/**
 * 
 * @author AlisonAvelino
 * 
 */
public class Console {
	
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 //Utilizando saídas no console
	 System.out.print("Hello");
	 System.out.print(" Dev!\n");
	 
	 System.out.println("Hello");
	 System.out.println("nice to meet you!");
	 
	 System.out.printf("Megasena: %d - %d - %d - %d - %d - %d %n",
			 			1, 2, 3, 4, 5, 6);
	 System.out.printf("Nome: %s%n", "Alison");
	 
	 System.out.print("Digite o sua idade: ");
	 int idade = sc.nextInt();
	 sc.nextLine(); //lê o "\\n" que o teclado.nextInt() deixa para
	 
	 System.out.print("Digite o seu nome: ");
	 String nome = sc.nextLine();
	 
	 System.out.print("Digite o seu sobrenome: ");
	 String sobrenome = sc.nextLine();
	 
	 
	 System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
	 
	 sc.close();
}
}
