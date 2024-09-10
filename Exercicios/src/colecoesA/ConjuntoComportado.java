package src.colecoesA;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;//lista de conjuntos que aceitam ordenação
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		//Set<String> listaAprovados = new HashSet<>();// dentro dos <...> é onde define o tipo que será aceito no Set, se usar o
											// operador <> ele já deixa por padrão o String no HashSet
											//para encurtar o código
		SortedSet<String> listaAprovados = new TreeSet<>();//TreeSet faz os conjuntos Set respeitarem a ordem de inserção
//		lista.add(1.2);//Ele gera erro de compiçação se tentar adicionar um tipo diferente
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
//		nums.get(1); não é possível acessar pelo índice.
		
		for(int n: nums) {
			System.out.println(n);
		} 
	}
}
