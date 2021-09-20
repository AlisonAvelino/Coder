package lambdas;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class CalculoTeste {

	public static void main(String[] args) {
		
		//Forma comum
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar(); 
		System.out.println(calculo.executar(2, 3));
	}
	
}
