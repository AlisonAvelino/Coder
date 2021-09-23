package excecao;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ChecadaVSNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	//H� dois tipos de exce��es: Checadas e N�o Checadas
	
	/*N�o Checada / N�o Verificada:
		- N�o imp�e a tratativa de exce��o;
	*/
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	/*Checada / Verificada:
	- Imp�e a tratativa de exce��o ou o lan�amento;
	 */
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
