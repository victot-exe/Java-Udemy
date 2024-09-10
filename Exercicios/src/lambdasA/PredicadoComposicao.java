package src.lambdasA;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		//Predicate é para operações logicas, return (true, false) se usa (and, or, negate)
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos =
				num -> num >= 100 && num <= 999;
				
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		System.out.println(isPar.or(isTresDigitos).test(123));
	}
}
