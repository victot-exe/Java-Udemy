package src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	/*
	 *  1. Numero para String binaria... 6 => "110"
	 *  2. Inverter a String... "110" => "011"
	 *  3. Converter de volta para inteiro... "011" => 3
	 *  
	 *  Integer
	 */
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		Consumer<Object> println = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		nums.stream().forEach(println);

//		1. Número para String Binary
		Function<Integer, String> toBinary = n ->{
			return "|" + Integer.toBinaryString(n) + "|";
			//return Integer.toBinaryString(n);
		};
		System.out.println("#01: Integer to BinaryString...");
		nums.stream().map(toBinary).forEach(print);
//		2. Inverter a String
		UnaryOperator<String> invertendo = n ->{
			String inverso = "";
			for(int i = n.length() - 1; 0 <= i; i --) {
				inverso += n.charAt(i);
			}
			return inverso;
		};
		System.out.println("\n#02: Invertendo a String...");
		nums.stream().map(toBinary).map(invertendo).forEach(print);
//		3. Converter de volta o BinaryString para o Integer
		Function<String, Integer> toInteger = n->{
//			Integer teste = Integer.parseInt(n, 2);
			n = n.replace("|", "");
			return Integer.parseInt(n, 2);
		};
		System.out.println("\n#03: BinaryString to Integer...");
		nums.stream().map(toBinary).map(invertendo).map(toInteger).forEach(println);
		
	}
}
