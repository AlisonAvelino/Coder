package fundamentos;
/**
 * 
 * @author AlisonAvelino
 * 
 */
public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//Impl�cita
		double a = 1;
		System.out.println(a);
		
		//Expl�cita(CAST)
		float b = (float) 1.123456788888;
		System.out.println(b);
		
		//Expl�cita(CAST)
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		//Expl�cita(CAST)
		double e = 1.9999999999;
		int f = (int) e;
		System.out.println(f);
	}
}
