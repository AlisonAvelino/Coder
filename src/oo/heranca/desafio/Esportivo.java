package oo.heranca.desafio;

/**
 * 
 * @author AlisonAvelino
 *
 */

public interface Esportivo {

	void ligarTurbo();
	void desligarTurbo();

	default int velocidadeDoAr() {
		return 1;
	}
}
