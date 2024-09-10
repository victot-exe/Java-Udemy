package src.fundamentosA.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condiacao1 = true;
		boolean condicao2 = 3 > 7; //false
		
		System.out.println(condiacao1 && condicao2); //operador logico and(e) representado pelo &&
		System.out.println(condiacao1 || condicao2); //operador logico or(ou) representado por ||
		System.out.println(condiacao1 ^ condicao2); //operador lógio xor(xou) representado pelo ^, nele temos true quando os resultados são !=
		System.out.println(!condiacao1); //operador lógico de negação (not) representado pelo !
		System.out.println(!condicao2);
		
//		Tabela verdade E
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true); a advertência gerada na linha é devido a código morto (código que nunca será lido)
//		System.out.println(false && false); devido ao java já saber o resultado na primeira parte ele marca o resto como código morto
		
//		Tabela verdade ou
		System.out.println("Tabela verdade OU (OR)");
//		System.out.println(true || true); 
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
//		Tabela verdade ou exclusivo
		System.out.println("Tabela verdade OU exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
//		Tabela verdade ou exclusivo
		System.out.println("Tabela verdade negação (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
		
	}

}
