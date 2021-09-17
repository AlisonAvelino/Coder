package oo.polimorfismo;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Pessoa {

	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	/*Polimorfismo Dinâmico:
	 - Utiliza o mesmo método em apenas uma classe genérica que extende herança;
	 - Utiliza a herança;
	*/
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	/*Polimorfismo Estático:
	 - Utiliza o mesmo método em classes diferentes;
	 - Utiliza a sobrecarga;
	*/
	
	/*public void comer(Comida arroz) {
		this.peso += arroz.getPeso();
	}
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}*/

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
		this.peso = peso;
		}
	}
} 
