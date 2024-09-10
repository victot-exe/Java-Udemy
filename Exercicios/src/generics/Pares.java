package src.generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
//import java.util.TreeSet;

public class Pares<C extends Number, V> {
	
	private final Set<Par<C, V>> itens = new LinkedHashSet<>();//interface com equals x hashmap
//	private final Set<Par<C, V>> itens = new TreeSet<>();//exige que o valor dentro do Treeset tenha uma interface Comparable
	
	public void adicionar(C chave, V valor) {
		//se a chave for nula ele sai do método automaticamente sem adicionar a chave.
		if(chave == null) return;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent()
				? parOpcional.get().getValor() : null;
	}
}
