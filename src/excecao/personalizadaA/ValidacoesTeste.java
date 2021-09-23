package excecao.personalizadaA;

import excecao.Aluno;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ValidacoesTeste {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException sve) {
			System.out.println(sve.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException nfie) {
			System.out.println(nfie.getMessage());
		}
		
		System.out.println("Fim :)");
		
	}
	
}
