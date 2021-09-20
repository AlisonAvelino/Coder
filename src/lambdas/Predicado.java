package lambdas;

import java.util.function.Predicate;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
				
		Produto produto = new Produto("Noteboook", 3899.90, 0.15);
		System.out.println(isCaro.test(produto));
	}
	
}
