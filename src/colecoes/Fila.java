package colecoes;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		/*Offer e Add: Adicionam elementos na fila.
		  A diferen�a � o comportamento que ocorre quando a fila
		  est� cheia.
		 */
		
		//Retorna false.
		fila.add("Ana");
		fila.add("Bia");
		fila.add("Carlos");
		
		//Retorna uma exce��o.
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		/*Peek e Element: obt�m o pr�ximo elemento da lista e remover.
		 A diferen�a � o comportamento que ocorre quando a lista est�
		 v�zia.
		*/
		
		//Retorna null.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		
		//Retorna uma exce��o.
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		/*Poll e Remove: obt�m o pr�ximo elemento da lista(sem remover).
		 A diferen�a � o comportamento que ocorre quando a lista est�
		 v�zia.
		*/
		
		//Retorna null.
		System.out.println(fila.poll());
		
		//Retorna uma exce��o.
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
		
	}

}
