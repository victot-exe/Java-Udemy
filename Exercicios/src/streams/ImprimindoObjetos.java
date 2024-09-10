package src.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
	List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
	
	System.out.println("Usando for...");
	for(int i = 0; i < aprovados.size(); i++) {//for convencional
		System.out.println(aprovados.get(i));
	}
	
	System.out.println("\nUsando forEach...");
	for(String nome: aprovados) {
		System.out.println(nome);
	}
	
	System.out.println("\nUsando Iterator...");
	Iterator<String> iterator = aprovados.iterator();
	while(iterator.hasNext()) {//hasNext � uma var que retorna true or false caso tenha ou n�o um pr�ximo item
		System.out.println(iterator.next());
	}
	System.out.println("\nUsando stream...");
	//Stream -> Sequ�ncia de dados
	Stream<String> stream = aprovados.stream();
	stream.forEach(System.out::println); //La�o interno
	}
}
