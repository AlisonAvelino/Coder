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
		 -N�o suporta primitivos;
		 -N�o ordenado;
		 -N�o indexado;
		 -N�o aceita repeti��o.
		 */
		
		HashSet conjunto = new HashSet();
		
		
		//Adicionando atributos ao HashSet.
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho � " + conjunto.size());
		
		//Ignorando os atributos repetidos.
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("O tamanho � " + conjunto.size());
		
		//Removendo os atributos.
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("O tamanho � " + conjunto.size());
		
		//Criando um novo HashSet.
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//Uni�o entre dois conjuntos de Set.
		//conjunto.addAll(nums);
		
		//Somente interse��o entre os conjuntos. 
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
	}

}
