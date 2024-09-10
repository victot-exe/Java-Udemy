package src.streams.desafioFilterProf;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioProf {
/*
 * Site,
 * Produtos com mais que 30% de desconto
 * Produtos com frete gratis
 * nome preco e super promocao
 */
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3999.00, 0.3, 0.0);
		Produto p2 = new Produto("iPhone", 5049.90, 0.25, 50.00);
		Produto p3 = new Produto("Poco Phone", 2490.69, 0.5, 0.0);
		Produto p4 = new Produto("Galaxy S22", 4587.27, 0.3, 80.0);
		Produto p5= new Produto("MacBook", 13999.73, 0.35, 0.0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> desconto =
				p -> p.desconto >= 0.3;
		
		Predicate<Produto> frete =
				p -> p.freteGratis;
		
		Function<Produto, String> promocao =
				p -> p.nome + "Por apenas R$ " + p.valorComDesconto() + " SUPER PROMOÇÃO!!!";
		
		produtos.stream()
			.filter(desconto)
			.filter(frete)
			.map(promocao)
			.forEach(System.out::println);
	}
}
