package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Porteiro {
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner sc = new Scanner(System.in);
		
		String valor = "";
		
		while (!"sair".equalsIgnoreCase(valor)) {
			System.out.println("O aniversariante chegou?");
			valor = sc.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				//criando evento
				EventoChegadaAniversariante evento = 
						new EventoChegadaAniversariante(new Date());
				
				//notifica os observadores
				observadores.stream()
					.forEach(o -> o.chegou(evento));	
				valor = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
			
		}

		sc.close();
	}

}
