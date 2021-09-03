package fundamentos;
/**
 * 
 * @author AlisonAvelino
 * 
 */
public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//Implícita
		double a = 1;
		System.out.println(a);
		
		//Explícita(CAST)
		float b = (float) 1.123456788888;
		System.out.println(b);
		
		//Explícita(CAST)
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		//Explícita(CAST)
		double e = 1.9999999999;
		int f = (int) e;
		System.out.println(f);
	}
}
