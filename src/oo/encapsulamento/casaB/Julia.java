package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Julia {

	/*Como não há uma ligação de hererança e package entre Julia e Ana 
	  se faz necessário uma instancia para acesso aos atributos (public) da instancia.*/
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//System.out.println(sogra.segredo);
		//System.out.println(sogra.comportamento);
		//System.out.println(sogra.dialogo);
		System.out.println(sogra.cabelos);
		
	}
	
}
