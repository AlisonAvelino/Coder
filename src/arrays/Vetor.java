package arrays;

import java.util.Arrays;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Vetor {

	public static void main(String[] args) {
		
		//Iniciando o vetor e determinando o tamanho
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));

		//Atribuindo as notas ao vetor indexadamente
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println("Média do aluno A " + total / notasAlunoA.length);
		
		//Iniciando o vetor e atribuindo nota
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		for(int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		
		System.out.println("Média do aluno B " + total / notasAlunoB.length);
	}
	
}
