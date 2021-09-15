package oo.composicao;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Jo�o Pedro";
		
		compra1.adicionarItem("Caneta", 10, 2.50);
		compra1.adicionarItem(new Item("Borracha", 5, 1.50));
		compra1.adicionarItem(new Item("Borracha", 4, 18.70));
	
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		//Demonstrando a rela��o bidirecional
		double total = compra1.itens.get(0).compra
				.itens.get(1).compra.obterValorTotal();
		
		System.out.println("O total � R$ " + total);
	}

}
