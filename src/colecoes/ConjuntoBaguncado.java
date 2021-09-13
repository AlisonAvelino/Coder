package colecoes;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		/*HashSet:
		 -Não suporta primitivos;
		 -Não ordenado;
		 -Não indexado;
		 -Não aceita repetição.
		 */
		
		HashSet conjunto = new HashSet();
		
		
		//Adicionando atributos ao HashSet.
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho é " + conjunto.size());
		
		//Ignorando os atributos repetidos.
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("O tamanho é " + conjunto.size());
		
		//Removendo os atributos.
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("O tamanho é " + conjunto.size());
		
		//Criando um novo HashSet.
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//União entre dois conjuntos de Set.
		//conjunto.addAll(nums);
		
		//Somente interseção entre os conjuntos. 
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
	}

}
