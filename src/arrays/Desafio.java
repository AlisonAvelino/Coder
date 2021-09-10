package arrays;

import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		int qtdNotas = sc.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota "+ (i+1) +": ");
			notas[i] = sc.nextDouble();
		};
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		double media = (total/qtdNotas);
		
		System.out.println("A média é: "+ media);
		
		sc.close();
		
	}
	
}
