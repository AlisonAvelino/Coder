package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Pilha {
	
	/*Stack:
	 - Implmenta uma pilha;
	 - Last In / First Out (LIFO)
	 */
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		/*Add e Push: Adicionam elementos na pilha.
		  A diferen�a � o comportamento que ocorre quando a fila
		  est� cheia.
		 */
		
		//Retorna false.
		livros.add("O Pequeno Pr�ncipe");
		
		//Restorna uma exce��o.
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro : livros) {
			System.out.println(livro);			
		}
		
		/*Peek e Element: obt�m o pr�ximo elemento da pilha e remove.
		 A diferen�a � o comportamento que ocorre quando a lista est�
		 v�zia.
		*/
		
		//Retorna null.
		System.out.println(livros.peek());
		
		//Retorna uma exce��o.
		System.out.println(livros.element());
		
		
		/*Poll e Remove: obt�m o pr�ximo elemento da pilha(sem remover).
		 A diferen�a � o comportamento que ocorre quando a lista est�
		 v�zia.
		*/
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//Retorna null.
		System.out.println(livros.poll());
				
		//Retorna uma exce��o.
		System.out.println(livros.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
	}	
}
