package src.generics;

import java.util.TreeSet;

public class ComparableTeste {
	
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();//TreeSet ordena do menor para o maior
		
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-13);
		
		System.out.println("Stream API");
		nums.stream().forEach(System.out::println);
		
//		ou
		System.out.println("\nLaço for");
		for(Integer n: nums) {
			System.out.println(n);
		}
	}
}
