package src.fundamentosA.tipos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s.toUpperCase(); //.toUpperCase deixa o texto em maiúsculo porém não altera o valor original
		s = s.toUpperCase(); // Assim alteramos o valor da Var
		System.out.println(s);
		
		s = s.replace("X", "senhora");
		System.out.println(s);
		
		s = s.concat("!!!"); // Concat junta str's
		System.out.println(s);
		
		//Tipos primitivos não tem a notação ponto "."
	}
}
