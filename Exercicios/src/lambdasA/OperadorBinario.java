package src.lambdasA;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (x, y) ->  (x + y) / 2;//se não usa as chaves não precisa escrever o return
		System.out.println(media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(9.7, 5.1));
		
		Function<Double, String> conceito =
				m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.7, 4.1));
		
	}
}
