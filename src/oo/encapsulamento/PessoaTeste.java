package oo.encapsulamento;

/**
* 
* @author AlisonAvelino
*
*/

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", "Amorim", -45);
		
		//Set faz alteração
		p1.setIdade(230);
		
		//Get faz leitura
		System.out.println(p1.toString());
		
		System.out.println(p1.getNomeCompleto());
	}
	
}
