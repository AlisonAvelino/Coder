package fundamentos;
/**
 * 
 * @author AlisonAvelino
 * 
 */
public class ConversaoNumeroString {

	public static void main(String[] args) {
		/* Com a conversão para String podemos tratar o objeto com métodos
		 */
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
	
	}
	
}
