package fundamentos.operadores;

/**
 * 
 * @author AlisonAvelino
 *
 */
public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
	double numeradorA = Math.pow((6*(3+2)), 2);
	double denominadorA = (3*2);
	double resultadoA = (numeradorA/denominadorA);
	
	double numeradorB = ((1-5)*(2-7));
	double denominadorB = 2;
	double resultadoB = Math.pow((numeradorB/denominadorB), 2);
	
	double numeradorC = Math.pow(resultadoA - resultadoB, 3);
	double denominadorC = Math.pow(10, 3);
	double resultadoEquacao = (numeradorC/denominadorC);
	
	System.out.println(resultadoEquacao);
	
		
	}
}
