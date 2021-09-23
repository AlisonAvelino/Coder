package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
	
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

		//Temos acesso ao la�o de repeti��o
		
		System.out.println("Usando foreach:");
		for(String aprovado: aprovados) {
			System.out.println(aprovado);
		}
		
		//Temos acesso ao la�o de repeti��o
		System.out.println("\nUsando Iterator:");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Temos acesso ao la�o de repeti��o
		System.out.println("\nUsando Stream:");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}
}
