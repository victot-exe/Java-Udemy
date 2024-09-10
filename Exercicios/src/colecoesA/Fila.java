package src.colecoesA;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
//FIFO(First In First Out) Queue
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
//		Filas podem ter tamanho definido, ficarem cheias
//		.add e .offer adicionam elementos na lista, a != � quando a fila est� cheia
		fila.add("Ana");//lan�ar� uma exce��o caso a fila esteja cheia.
		fila.offer("Bia");//retorna falso caso a fila esteja cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
//		A != de comportamento � quando a fila est� vazia
		System.out.println(fila.peek());//le o elemento da fila mas n�o remove
		System.out.println(fila.peek());//retorna null se a fila est� vazia
		System.out.println(fila.element());//le o elemento mas n�o remove
		System.out.println(fila.element());//Abre uma exeption(da erro)
		
		
//		.remove e .poll a != � quando isEmpty = true
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
		//fila.isEmpty();//verifica se a fila est� vazia ou n�o
		//fila.contains(...)
	}
}
