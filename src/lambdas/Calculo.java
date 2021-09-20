package lambdas;

/**
 * 
 * @author AlisonAvelino
 *
 */

@FunctionalInterface
public interface Calculo {

	/*A functional interface permite apenas um método/função abstrato.
	  Mas permite métodos/função default e static.
	 */
	
	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
