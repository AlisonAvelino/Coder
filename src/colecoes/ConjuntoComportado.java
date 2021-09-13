package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Aceita apenas um tipo de atributo e não respeita a ordem.
		Set<String> listaAprovados = new HashSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		//Aceita apenas um tipo de atributo e respeita a ordem.
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
	
}
