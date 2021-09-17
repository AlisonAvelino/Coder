package oo.composicao.desafio;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Sistema {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 2.00, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10.0, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000.00), 1);
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.printf("Cliente: %s \n", cliente.nome);
		System.out.printf("Total: R$ %.2f.\n", cliente.obterValorTotal());
	}
	
}
