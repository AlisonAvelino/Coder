package fundamentos;

/**
 * 
 * @author AlisonAvelino
 *
 */
public class TipoString {

		public static void main(String[] args) {
			
			//Manipulando o tipo String
			System.out.println("Olá pessoal".charAt(2));
			
			String s = "Boa tarde Mr. Alison";
			System.out.println(s.concat("!!!"));
			System.out.println(s + "!!!");
			System.out.println(s.startsWith("Boa"));
			System.out.println(s.toLowerCase().startsWith("boa"));
			System.out.println(s.toUpperCase().endsWith("ALISON"));
			System.out.println(s.length());
			System.out.println(s.toLowerCase().equals("boa tarde mr. alison"));
			System.out.println(s.equalsIgnoreCase("boa tarde mr. alison"));
			
			var nome = "Alison";
			var sobrenome = "Avelino";
			var idade = 23;
			var salario = 12345.987;
			
			String frase = "Nome: " + nome + "\nSobrenome: " + sobrenome +
							"\nIdade: " +  idade + "\nSalario: " + salario +"\n";
			
			System.out.println(frase);
			
			System.out.printf("O Mr. %s %s tem %d anos e ganha R$%.2f.", 
								nome, sobrenome, idade, salario);
			
			System.out.println("Um dev aleatorio".contains("aleatorio"));
			System.out.println("Um dev aleatorio".indexOf("dev"));
			System.out.println("Um dev aleatorio".substring(3));
			System.out.println("Um dev aleatorio".substring(8, 9));		
			
		}
}
