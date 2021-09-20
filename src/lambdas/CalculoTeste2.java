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
		/*Ap�s o arrow temos um par de chaves o que possibilita outra
		 senten�a de c�digo*/
		BinaryOperator<Double> calculo = (x, y) -> {return x + y;};
		System.out.println(calculo.apply(2.0, 3.0));
		
		/*Ap�s o arrow n�o temos um par de chaves o que n�o possibilita
		  outra senten�a de c�digo*/
		BinaryOperator<Integer> calculo2 = (x, y) -> x * y;
		System.out.println(calculo2.apply(2, 3));
		
	}
	
}
