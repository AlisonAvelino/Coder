package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class VetorBidimensional {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		int qtdAlunos = sc.nextInt();
		
		System.out.print("Informe a quantidade de notas por aluno: ");
		int qtdNotas = sc.nextInt();
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for(int i = 0; i < notasDaTurma.length; i++) {
			System.out.println();
			for(int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", (i+1), (j+1));
				notasDaTurma[i][j] = sc.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
			
		double mediaTurma = (total / (qtdAlunos * qtdNotas));
		
		System.out.println("A média da turma é: "+ mediaTurma);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		sc.close();
	}

}
