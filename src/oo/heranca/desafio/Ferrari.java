package oo.heranca.desafio;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Ferrari extends Carro implements Esportivo, Luxo{
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		this(300);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setAceleracao(15);
	}
	
	@Override
	public void acelerar() {
		super.acelerar();
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getAceleracao() {
		if(ligarTurbo && !ligarAr) {
			return 45;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else {
			return 15;
		}
	}
}
