package padroes.observer;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Namorada implements ObservadorChegadaAniversariante{

	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar para os convidados");
		System.out.println("Apaguem �s luzes!");
		System.out.println("Sil�ncio...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("Surpreeeesa!!!");
		
	}
}
