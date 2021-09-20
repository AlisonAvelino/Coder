package lambdas;

/**
 * 
 * @author AlisonAvelino
 *
 */

@FunctionalInterface
public interface Calculo {

	/*A functional interface permite apenas um m�todo/fun��o abstrato.
	  Mas permite m�todos/fun��o default e static.
	 */
	
	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
