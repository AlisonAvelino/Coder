package classe;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		
		//Atribução por valor (Primitivo).
		double b = a;
		
		a++;
		b--;
		
		System.out.println("A = " + a +" B = " + b);
		
		Data d1 = new Data(1, 6, 2022);
		
		//Atribução por referência (Objeto).
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		//Chamada do método 
		resetData(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		int c = 5;
		//Chamada do método 
		alteracaoPrimitivo(c);
		System.out.println(c);
		
	}
	
	
	//Gera alteração nos valores do objeto devido os parâmetros
	static void resetData(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	//Não gera alteração nos valores do objeto devido a copia do valor 
	static void alteracaoPrimitivo(int a) {
		a++;
	}
	
}
