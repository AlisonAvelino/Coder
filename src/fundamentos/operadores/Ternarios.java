package fundamentos.operadores;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Ternarios {
	
	public static void main(String[] args) {
		
	double media = 8.6;
	String resultadoFinal = media >= 7 ? "aprovado." : "em recuperação.";
	
	System.out.println("O aluno está " + resultadoFinal);
	
	double nota = 9.9;
	boolean bomComportamento = false;
	boolean passouPorMedia = nota >= 7;
	boolean temDesconto = bomComportamento && passouPorMedia;
	String retorno = temDesconto ? "Sim." : "Não.";
	
	System.out.println("Tem desconto? " + retorno);
	
	
		
	}

}
