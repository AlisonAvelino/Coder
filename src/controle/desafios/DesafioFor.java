package controle.desafios;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 0; i <= 5; i++) {
			System.out.println(valor);
			valor+="#";
		}
		
		/*O desafio � n�o utilizar valor num�rico para controlar o la�o*/
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}		
		
	}
	
}
