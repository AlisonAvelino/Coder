package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Pedro extends Ana{
		
	/*Como há uma ligação de hererança entre Pedro e Ana não se faz necessário 
	  uma instancia para acesso aos atributos da classe.*/
	
	//Ana mae = new Ana();
	
	void testeAcessos() {
		//System.out.println(segredo);
		//System.out.println(comportamento);
		System.out.println(dialogo);
		System.out.println(cabelos);
		
	}
	
	
}
