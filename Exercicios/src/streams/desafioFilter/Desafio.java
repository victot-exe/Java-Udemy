package src.streams.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
/*
 * 2 lambdas p filter
 * 1 map
 */
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Arroz", 7.89, false);
		Produto p2 = new Produto("Feijão", 15.34, false);
		Produto p3 = new Produto("Manteiga", 26.26, true);
		Produto p4 = new Produto("Maionse", 8.36, true);
		Produto p5 = new Produto("Queijo", 32.73, true);
		Produto p6 = new Produto("Gilete", 15.82, false);
		
		List<Produto> prateleira = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> geladeira =
				p -> p.vaiNaGeladeira;
		
		Predicate<Produto> barato =
				p -> p.preco <= 10.0;
		
		Function<Produto, String> precoGrama =
				p -> "O preço por grama do " + p.nome + " é: " + p.preco / 1000;
		
		prateleira.stream()
			.filter(geladeira)
			.filter(barato)
			.map(precoGrama)
			.forEach(System.out::println);
		
		
	}
}
