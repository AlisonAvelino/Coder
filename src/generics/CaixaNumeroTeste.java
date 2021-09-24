package generics;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA =  new CaixaNumero<>();
		caixaA.guardar(3.1415);
		Double coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaNumero<Double> caixaB =  new CaixaNumero<>();
		caixaB.guardar(1.618);
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
	
}
