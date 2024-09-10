package src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4 ,5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac += n;
		
		Integer total1 = nums.parallelStream().reduce(soma).get();//reduce é uma função terminadora, após não pode ser feito outro stram
		//0precisa de uma var para armazenar o resultado//o . get é para ter um retorno do resultado
		System.out.println(total1);
								//parallelStream faz a operação com os elementos de forma paralela (Considera cada com um unico)
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
		
		//Resultado foi um Optional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}
