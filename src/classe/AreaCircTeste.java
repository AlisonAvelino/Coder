package classe;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		//Atribuindo um valor ao parametro e instanciando o objeto
		AreaCirc a1 = new AreaCirc(10);
		//a1.raio = 10;
		
		//Instanciando o objeto.
		AreaCirc a2 = new AreaCirc(5);
		//a2.raio = 10;
		
		//Acessando o m�todo da inst�ncia.
		System.out.println(a1.area());
		
		//Acessando o m�todo da inst�ncia.
		System.out.println(a2.area());
		
		//Atribuindo um valor ao par�metro do m�todo area da nossa classe AreaCirc.
		System.out.println(AreaCirc.area(100));
		
		//Utilizando o objeto est�tico da nossa classe AreaCirc.
		System.out.println(AreaCirc.PI);
		
		//Utilizando o objeto est�tico da biblioteca do Java.
		System.out.println(Math.PI);
		
		
		 
		
	}

}
