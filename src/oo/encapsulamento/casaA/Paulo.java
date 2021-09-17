package oo.encapsulamento.casaA;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Paulo {
	
	/*Como há uma ligação de package entre Paulo e Ana se faz necessário 
	  uma instancia para acesso aos atributos(dafault, protected e public) 
	  da classe.*/
	Ana esposa = new Ana();
	
	void testeAcessos() {		
		//System.out.println(esposa.segredo);
		System.out.println(esposa.comportamento);
		System.out.println(esposa.dialogo);
		System.out.println(esposa.cabelos);
		
	}
 
}
