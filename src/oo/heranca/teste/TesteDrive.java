package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class TesteDrive {
	
	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		
		System.out.println("Civic");
		System.out.println("Velocidade atual é: " + c1.velocidade + "Km/h");
		c1.acelerar();
		c1.acelerar();
		System.out.println("Velocidade atual é: " + c1.velocidade + "Km/h");
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Velocidade atual é: " + c1.velocidade + "Km/h");
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println("Velocidade atual é: " + c1.velocidade + "Km/h");
		c1.frear();
		System.out.println("Velocidade atual é: " + c1.velocidade + "Km/h");
		
		Ferrari c2 = new Ferrari(300);
		System.out.println("Ferrari");
		System.out.println("Velocidade atual é: " + c2.velocidade + "Km/h");
		c2.acelerar();
		System.out.println("Velocidade atual é: " + c2.velocidade + "Km/h");
		c2.acelerar();
		System.out.println("Velocidade atual é: " + c2.velocidade + "Km/h");
		c2.acelerar();
		System.out.println("Velocidade atual é: " + c2.velocidade + "Km/h");
		
		System.out.println("Acionei o turbo!");
		c2.ligarTurbo();
		
		c2.acelerar();
		System.out.println("Velocidade atual é: " + c2.velocidade + "Km/h");
		c2.acelerar();
		System.out.println("Velocidade atual é: " + c2.velocidade + "Km/h");
		
		System.out.println("Velocidade do ar: " + c2.velocidadeDoAr());
		
		c2.frear();
		System.out.println("Velocidade atual é: " + c2.velocidade + "Km/h");
		c2.frear();
		System.out.println("Velocidade atual é: " + c2.velocidade + "Km/h");
		
	}

}
