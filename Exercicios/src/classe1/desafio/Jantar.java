package src.classe1.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Ronaldo", 78.00);
		System.out.printf("%s %.2f \n", p1.nome, p1.peso);
		
		var c1 = new Comida("Pastel de brócolis", 0.3);
		System.out.printf("%s %.2f \n", c1.nome, c1.peso);
		
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		
	}

}
