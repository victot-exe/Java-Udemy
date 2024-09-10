package src.colecoesA;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;//lista de conjuntos que aceitam ordena��o
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		//Set<String> listaAprovados = new HashSet<>();// dentro dos <...> � onde define o tipo que ser� aceito no Set, se usar o
											// operador <> ele j� deixa por padr�o o String no HashSet
											//para encurtar o c�digo
		SortedSet<String> listaAprovados = new TreeSet<>();//TreeSet faz os conjuntos Set respeitarem a ordem de inser��o
//		lista.add(1.2);//Ele gera erro de compi�a��o se tentar adicionar um tipo diferente
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
		
//		nums.get(1); n�o � poss�vel acessar pelo �ndice.
		
		for(int n: nums) {
			System.out.println(n);
		} 
	}
}
