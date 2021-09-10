package classe.desafios;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class JantarTeste {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.300);
		Comida c2 = new Comida("Feijoada", 0.900);
		Pessoa p = new Pessoa ("Thor", 99.8);
		
		System.out.println(p.apresentar());
		
		p.comer(c1);
		System.out.println(p.apresentar());

		p.comer(c2);
		System.out.println(p.apresentar());	
		
	}

}
