package classe;

public class AreaCirc {
	
	double raio;
	
	//Atributo estático de instância/objeto.
	final static double PI = 3.1415;
	
	AreaCirc(double raio) {
		this.raio = raio;
	}
	
	double area() {
		double resultado = PI* Math.pow(raio, 2);
		return resultado;
	}
	
	static double area(double raio) {
		double resultado = PI* Math.pow(raio, 2);
		return resultado;
	}
	
	
	

}
