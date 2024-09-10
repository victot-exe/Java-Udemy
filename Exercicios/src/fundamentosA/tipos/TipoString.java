package src.fundamentosA.tipos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(0)); // O .charAt chega no caractere de indice do numero entre ()
		
		String s = "Ola pessoal";
		System.out.println(s + "!!!");
		System.out.println(s.concat("!!!")); // O + tem a mesma função que o concat nesse caso
		//A String é imutável, você não pode modificicar o valor, quando altera você subistitui o antigo
		System.out.println(s.startsWith("Ola")); // Verifica se a str inicia com ("..."), retorna um boolean
		System.out.println(s.startsWith("boa"));
		System.out.println(s.length()); // retorna um inteiro com o número do ultimo indice da  str
		System.out.println(s.endsWith("l"));
		System.out.println(s.equals("ola pessoal"));
		System.out.println(s.equalsIgnoreCase("ola pessoal"));
		
		var nome = "Victor";
		var sobrenome = "Faria";
		var idade = 23;
		var salario = 2400.00;
		
		System.out.printf("O senhor %s %s tem %d anos e recebe %.2f",
				nome, sobrenome, idade, salario);//	%d para int
		
		System.out.println("\n----------------------\n");
		String frase = String.format("O senhor %s %s tem %d anos e recebe %.2f",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}
}
