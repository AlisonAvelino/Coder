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
		  A diferença é o comportamento que ocorre quando a fila
		  está cheia.
		 */
		
		//Retorna false.
		livros.add("O Pequeno Príncipe");
		
		//Restorna uma exceção.
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro : livros) {
			System.out.println(livro);			
		}
		
		/*Peek e Element: obtêm o próximo elemento da pilha e remove.
		 A diferença é o comportamento que ocorre quando a lista está
		 vázia.
		*/
		
		//Retorna null.
		System.out.println(livros.peek());
		
		//Retorna uma exceção.
		System.out.println(livros.element());
		
		
		/*Poll e Remove: obtêm o próximo elemento da pilha(sem remover).
		 A diferença é o comportamento que ocorre quando a lista está
		 vázia.
		*/
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//Retorna null.
		System.out.println(livros.poll());
				
		//Retorna uma exceção.
		System.out.println(livros.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
	}	
}
