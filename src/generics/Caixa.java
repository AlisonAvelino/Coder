package generics;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Caixa <T> {
	/*Generics:
	 -Utilizado em Classes e Métodos
	 -Podemos resolver o tipo na herança ou restringir;
	 -Podemos resolver o tipo na instância do objeto;
	 */
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
	
}
