package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	 
	//Construtor default expl�cito
	Produto() {}
	
	//Construtor inicializado com par�metros
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Criando metodo para calcular desconto
	double precoComDesconto() {
		return preco*(1-desconto);
	}
	
	//Criando metodo para calcular desconto com gerente
	double precoComDesconto(double descontoGerente) {
		return preco*(1 - desconto + descontoGerente);
	}

}
