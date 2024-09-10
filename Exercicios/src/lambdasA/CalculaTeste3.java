package src.lambdasA;

import java.util.function.BinaryOperator;


//olhar o Interface Sumary
public class CalculaTeste3 {
	public static void main(String[] args) {
		//java não permite int para Double
		//Sim: double para Double
		
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y;};
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y;};
		System.out.println(calc2.apply(2, 3));
		
		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
		
	}
}
