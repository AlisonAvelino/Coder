package lambdas;

import java.util.function.BinaryOperator;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//Lambda
		/*Após o arrow temos um par de chaves o que possibilita outra
		 sentença de código*/
		BinaryOperator<Double> calculo = (x, y) -> {return x + y;};
		System.out.println(calculo.apply(2.0, 3.0));
		
		/*Após o arrow não temos um par de chaves o que não possibilita
		  outra sentença de código*/
		BinaryOperator<Integer> calculo2 = (x, y) -> x * y;
		System.out.println(calculo2.apply(2, 3));
		
	}
	
}
