package fundamentos;

/**
 * 
 * @author AlisonAvelino
 * 
 */
public class Wrappers {
	
	public static void main(String[] args) {
		
		/* Os Wrappers são objetos dos primitivos que permitem notação e 
		  valores nulos*/
		
		//byte
		Byte b = 100;
		
		//short
		Short s = 1000;
		
		//int
		Integer i = 1000;
		
		//long
		Long l = 10000L;
		
		//float
		Float f = 123.10f;
		
		//double
		Double d = 1234.5678;
		
		//boolean
		Boolean bo = Boolean.parseBoolean("true");
		
		//char
		Character c = '#';
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bo.toString().toUpperCase());
		System.out.println(c + "...");
	}
}
