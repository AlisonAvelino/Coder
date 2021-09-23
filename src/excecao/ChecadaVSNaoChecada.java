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
	
	//Há dois tipos de exceções: Checadas e Não Checadas
	
	/*Não Checada / Não Verificada:
		- Não impõe a tratativa de exceção;
	*/
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	/*Checada / Verificada:
	- Impõe a tratativa de exceção ou o lançamento;
	 */
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
