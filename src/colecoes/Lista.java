package colecoes;

import java.util.ArrayList;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Lista {

	public static void main(String[] args) {
		/*
		 List:
		 -Pode ser heterogêneo;
		 -Pode ser homogêneo;
		 -Aceita objetos duplicados;
		 -É ordenado;
		 -É indexado;
		 */
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		//Acessando o atributo pelo índice
		System.out.println(lista.get(3));
		
		//Retorna o atributo do objeto
		System.out.println(">>>> " + lista.remove(1));
		
		//Retorna um booleano
		System.out.println(lista.remove(new Usuario("Manu")));
		
		//
		System.out.println("Tem? " + lista.contains(new Usuario("Alison")));
		System.out.println("Tem? " + lista.contains(u1));
		
		
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
	}
	
}
