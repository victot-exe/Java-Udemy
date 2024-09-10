package src.colecoesA;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	/*
	 * Set � um conjunto n�o ordenado(mas que pode ser) e n�o indexado(n�o possui
	 * �ndice) que pode armazenar valores diferentes (repetidos ele ignora) e de
	 * tipos diferentes (heterog�neo, mas o mais indicado � ser homog�neo (mesmo
	 * tipo)). Collections no geral n�o suportam tipos primitivos, conertendo
	 * automaticamente os tipos primitivos para wrappers (as classes dos tipos
	 * primitivos): double -> Double | int -> Integer, etc...
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" }) // comando para retirar as advert�ncias do c�digo, elas ser�o
													// explicadas depois
													// ctrl + 1 para remover
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);// .add � o metodo que usamos para adicionar um novo elemento ao conjunto
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("O tamanho �: " + conjunto.size());// .size diz o tamanho do conjunto.

		conjunto.add("teste");// aqui ele adiciona pois o T � != do t
		conjunto.add("Teste");// aqui ele ignora pois o valor � repetido
		System.out.println("O tamanho �: " + conjunto.size());// mesmo tendo adicionado 2 elementos ele s� considerou o
																// que n�o era repetido

		System.out.println(conjunto.remove("teste"));// retorna true or false para conseguiu ou n�o remover
		System.out.println(conjunto.remove('y'));// false pois y n�o pertence ao conjunto
		System.out.println(conjunto.remove('x'));
		System.out.println(conjunto.remove("Teste"));

		System.out.println("O tamanho �: " + conjunto.size());// mostrar o numero depois de remover

		System.out.println(conjunto.contains('x'));// .contains verifica se o elemento est� ou n no conjunto, retorta
													// true or false

		Set nums = new HashSet(); // principios da OO que ser�o observados em outras aulas
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

//		conjunto.addAll(nums);//uni�o entre dois conjuntos
		conjunto.retainAll(nums);// ret�m apenas elementos repetidos em ambos os conjuntos
		System.out.println(conjunto);

		conjunto.clear();// limpa o conjunto
		System.out.println(conjunto);

	}
}
