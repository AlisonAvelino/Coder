package classe;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		
		//Atribu��o por valor (Primitivo).
		double b = a;
		
		a++;
		b--;
		
		System.out.println("A = " + a +" B = " + b);
		
		Data d1 = new Data(1, 6, 2022);
		
		//Atribu��o por refer�ncia (Objeto).
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		//Chamada do m�todo 
		resetData(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		int c = 5;
		//Chamada do m�todo 
		alteracaoPrimitivo(c);
		System.out.println(c);
		
	}
	
	
	//Gera altera��o nos valores do objeto devido os par�metros
	static void resetData(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	//N�o gera altera��o nos valores do objeto devido a copia do valor 
	static void alteracaoPrimitivo(int a) {
		a++;
	}
	
}
