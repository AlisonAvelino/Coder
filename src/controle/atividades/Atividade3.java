package controle.atividades;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Atividade3 {

	/**
	 * 3. Criar um programa que receba duas notas parciais, calcular a média
	 * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
	 * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
	 * "Recuperação", caso contrário imprime no console "Reprovado".
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Nota Parcial 1: ");
			double nota1 = sc.nextDouble();
	
			System.out.println("Nota Parcial 2: ");
			double nota2 = sc.nextDouble();
	
			double media = (nota1 + nota2) / 2;
	
			if (media >= 7) {
				System.out.println("Sua média foi " + media + " e você está Aprovado.");
			} else if (media >= 4) {
				System.out.println("Sua média foi " + media + " e você está de Recuperação.");
			} else {
				System.out.println("Sua média foi " + media + " e você está Reprovado.");
			}
	
			sc.close();
		}catch(InputMismatchException ime) {
			System.out.println("O elemento informado não é um número!");
		}
	}
	
}
