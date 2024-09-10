package src.colecoesA;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
// LIFO(Last In First Out)
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Principe");//return true or false se conseguiu ou n�o adicionar
		livros.push("Dom Quixote");//Exepion se n�o foi poss�vel adicionar
		livros.push("O hobbit");
		
		System.out.println(livros.peek());//retorna o ultimo elemento
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.pop());//Exeption quando a pilha est� vazia
		
//		livros.size();
//		livros.clear();
//		livros.contains("");
//		livros.isEmpty();
		
		//fazer uso do . para ver mais metodos dentro da API em todas
	}
}
