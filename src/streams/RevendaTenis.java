package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class RevendaTenis {

	public static void main(String[] args) {
		
		Tenis t1 = new Tenis("Air Jordan 1", 38, true);
		Tenis t2 = new Tenis("Air Force 1", 38, true);
		Tenis t3 = new Tenis("Air Jordan 5", 39, false);
		Tenis t4 = new Tenis("Air Jordan 13", 40, true);
		Tenis t5 = new Tenis("Air Max 95", 41, false);
		Tenis t6 = new Tenis("Air Max One", 38, true);
		
		List<Tenis> tenis = Arrays.asList(t1, t2, t3, t4, t5, t6);
		
		Predicate<Tenis> size = t -> t.tamanho == 38;
		Predicate<Tenis> condicao = t -> t.novo;
		
		Function<Tenis, String> possivelCompra = 
				t -> "O modelo " + t.modelo + " está disponível na numeração: " + t.tamanho;
		
		tenis.stream()
		.filter(size)
		.filter(condicao)
		.map(possivelCompra)
		.forEach(System.out::println);
	}
	
}
