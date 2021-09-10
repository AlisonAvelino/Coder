package classe;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ValorNulo {
	
	public static void main(String[] args) {
		
		//Vari�veis primitivas, mesmo que v�zias, obt�m o endere�o de mem�ria do objeto
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		
		//Vari�veis com o valor null n�o obt�m o endere�o de mem�ria do objeto
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("????"));
		}
		
	}

}
