package generics;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Caixa <T> {
	/*Generics:
	 -Utilizado em Classes e M�todos
	 -Podemos resolver o tipo na heran�a ou restringir;
	 -Podemos resolver o tipo na inst�ncia do objeto;
	 */
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
	
}
