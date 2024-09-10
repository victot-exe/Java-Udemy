package src.lambdasA;

import java.util.function.UnaryOperator;

public class OperadorUnario {//recebe e retorna o mesmo tipo depois de fazer a função
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado//compose é o contrário do andThen
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
	}
}
