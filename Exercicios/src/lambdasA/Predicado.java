package src.lambdasA;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = // faz semelhante ao operador ternário retornando true or false
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;

		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
}
