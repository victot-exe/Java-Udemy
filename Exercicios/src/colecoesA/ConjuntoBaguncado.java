package src.colecoesA;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	/*
	 * Set é um conjunto não ordenado(mas que pode ser) e não indexado(não possui
	 * índice) que pode armazenar valores diferentes (repetidos ele ignora) e de
	 * tipos diferentes (heterogêneo, mas o mais indicado é ser homogêneo (mesmo
	 * tipo)). Collections no geral não suportam tipos primitivos, conertendo
	 * automaticamente os tipos primitivos para wrappers (as classes dos tipos
	 * primitivos): double -> Double | int -> Integer, etc...
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" }) // comando para retirar as advertências do código, elas serão
													// explicadas depois
													// ctrl + 1 para remover
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);// .add é o metodo que usamos para adicionar um novo elemento ao conjunto
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("O tamanho é: " + conjunto.size());// .size diz o tamanho do conjunto.

		conjunto.add("teste");// aqui ele adiciona pois o T é != do t
		conjunto.add("Teste");// aqui ele ignora pois o valor é repetido
		System.out.println("O tamanho é: " + conjunto.size());// mesmo tendo adicionado 2 elementos ele só considerou o
																// que não era repetido

		System.out.println(conjunto.remove("teste"));// retorna true or false para conseguiu ou não remover
		System.out.println(conjunto.remove('y'));// false pois y não pertence ao conjunto
		System.out.println(conjunto.remove('x'));
		System.out.println(conjunto.remove("Teste"));

		System.out.println("O tamanho é: " + conjunto.size());// mostrar o numero depois de remover

		System.out.println(conjunto.contains('x'));// .contains verifica se o elemento está ou n no conjunto, retorta
													// true or false

		Set nums = new HashSet(); // principios da OO que serão observados em outras aulas
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

//		conjunto.addAll(nums);//união entre dois conjuntos
		conjunto.retainAll(nums);// retém apenas elementos repetidos em ambos os conjuntos
		System.out.println(conjunto);

		conjunto.clear();// limpa o conjunto
		System.out.println(conjunto);

	}
}
