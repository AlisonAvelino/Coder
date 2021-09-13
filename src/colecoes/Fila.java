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
		  A diferença é o comportamento que ocorre quando a fila
		  está cheia.
		 */
		
		//Retorna false.
		fila.add("Ana");
		fila.add("Bia");
		fila.add("Carlos");
		
		//Retorna uma exceção.
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		/*Peek e Element: obtêm o próximo elemento da lista e remover.
		 A diferença é o comportamento que ocorre quando a lista está
		 vázia.
		*/
		
		//Retorna null.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		
		//Retorna uma exceção.
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		/*Poll e Remove: obtêm o próximo elemento da lista(sem remover).
		 A diferença é o comportamento que ocorre quando a lista está
		 vázia.
		*/
		
		//Retorna null.
		System.out.println(fila.poll());
		
		//Retorna uma exceção.
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
		
	}

}
