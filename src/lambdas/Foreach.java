package lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana","Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional: ");
		for(String aprovado: aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("\nLambda: versão 01");
		aprovados.forEach((aprovado) -> {System.out.println(aprovado);});
		
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda: versão 02");
		aprovados.forEach(aprovado ->meuImprimir(aprovado));
		
		System.out.println("\nMethod Reference 2...");
		aprovados.forEach(Foreach::meuImprimir);
		
		
	}
	
	static void meuImprimir(String aprovado) {
		System.out.println("Oi! Meu nome é " + aprovado);
	}
	
}
