package src.lambdasA;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioResposta {
	/*
	 * 1. A partir do produto calcular o preço real (com desconto)
	 * 2. Imposto municipal : >= 2500 (8.5%)/ <2500 (Isento)
	 * 3. Frete: 3000 (100)/ < 3000 (50)
	 * 4. Arredondar: Deixar duas casas decimais
	 * 5. Formatar: R$1234,56 
	 */
	public static void main(String[] args) {
//		Produto w = new Produto("nome", 3000, 0.1);
		//1
		Function<Produto, Double> precoFinal =
				produto -> produto.preco * (1 - produto.desconto);
//				System.out.println(precoFinal.apply(w));
		//2
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
//				System.out.println(precoFinal.andThen(impostoMunicipal).apply(w));
		//3
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
//				System.out.println(precoFinal.andThen(impostoMunicipal).andThen(frete).apply(w));
		//4
		UnaryOperator<Double> arredondar =
				preco -> Double.parseDouble((String.format("%.2f", preco)).replace(",", "."));
				//como meu java está em ptbr ele troca o . por , na hora da string, por isso o replae na hora do parseDouble
//				System.out.println(arredondar.apply(2.7876656));
		//5
		Function<Double, String> formatar =
				preco -> ("R$" + preco);
		
//		------------------
		Produto p = new Produto("iPad", 3235.89, 0.13);

		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é " + preco);
	}
}
