package controle.desafios;

import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		double nota = 0;
		double total = 0;
		int quantidadeNotas = 0;
		
				
		while(nota != -1) {
			System.out.printf("Informe a nota (ou -1 para sair): ");
			nota = sc.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeNotas++;
			}else if(nota != -1) {
				System.out.println("Nota inválida!");
			}
		}
		
		double media = total / quantidadeNotas;
		System.out.println("Média = " + media);
		System.out.printf("Foram avaliadas %d notas.\n", quantidadeNotas);
		
		sc.close();
	}

}
