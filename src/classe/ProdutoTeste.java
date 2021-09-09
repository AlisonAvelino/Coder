package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		//Atribuindo ao construtor os parâmetros
		Produto p1 = new Produto("GPU", 4535.89);
		
		//Utilizando o construtor sem parâmetros
		var p2 = new Produto();
		p2.nome = "RAM";
		p2.preco = 630.85;
		
		//Desconto para todos os objetos/instancias
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("Valor do carrinho: R$%.2f.", mediaCarrinho);
		
		
		
	}

}
