package excecao;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch (NullPointerException npe) {
			System.out.println("Ocorreu um erro ao exibir o nome do usuário.");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException ame) {
			System.out.println("Ocorreu um erro: " + ame.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
	
}
