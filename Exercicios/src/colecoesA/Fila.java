package src.colecoesA;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
//FIFO(First In First Out) Queue
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
//		Filas podem ter tamanho definido, ficarem cheias
//		.add e .offer adicionam elementos na lista, a != é quando a fila está cheia
		fila.add("Ana");//lançará uma exceção caso a fila esteja cheia.
		fila.offer("Bia");//retorna falso caso a fila esteja cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
//		A != de comportamento é quando a fila está vazia
		System.out.println(fila.peek());//le o elemento da fila mas não remove
		System.out.println(fila.peek());//retorna null se a fila está vazia
		System.out.println(fila.element());//le o elemento mas não remove
		System.out.println(fila.element());//Abre uma exeption(da erro)
		
		
//		.remove e .poll a != é quando isEmpty = true
		System.out.println(fila.poll());//retorna o primeiro elemento e exclui, null if isEmpty
		System.out.println(fila.remove());//retorna o primeiro elemento e exclui, Exeption if isEmpty
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();//verifica se a fila está vazia ou não
		//fila.contains(...)
	}
}
