package fundamentos;

/**
 * 
 * @author AlisonAvelino
 *
 */
public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia Mr. X";
		s = s.replace("X", "Dev");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Alison".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia Mr. X"
					.replace("X", "Alison")
					.toUpperCase()
					.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		
		
	}

}	
