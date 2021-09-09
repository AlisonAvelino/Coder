package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data(15, 11, 1910);
		
		String dataFormatada1 = data1.obterDataFormatada();
		String dataFormatada2 = data2.obterDataFormatada();
		
		System.out.printf("%s\n",dataFormatada1);
		System.out.printf("%s\n",dataFormatada2);
		
		
		
	}

}
   