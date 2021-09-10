package arrays;

import java.util.Arrays;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class VetorForEach {
	
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
			
			double totalA = 0;
			for(double notaAlunoA: notasAlunoA) {
				totalA += notaAlunoA;
			}
			
			System.out.println("Média do aluno A " + totalA / notasAlunoA.length);
			
			//Iniciando o vetor e atribuindo nota
			double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
			System.out.println(Arrays.toString(notasAlunoB));
			
			double totalB = 0;
			for(double notaAlunoB: notasAlunoB) {
				totalB += notaAlunoB;
			}
			
			System.out.println("Média do aluno B " + totalB / notasAlunoB.length);
		}

}
