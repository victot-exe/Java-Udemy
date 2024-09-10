package src.controleA.exercicios;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String[] args) {
		
//		Exercicio 01 receber 1 numero e ver se ele esta entre 0 e 10 e é par
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva um número: ");
		double num = entrada.nextDouble();
		
		if(num % 2 == 0 && num >= 0 && num <= 10) {
			System.out.printf("O número %.2f é par e está entre 0 e 10.", num);
		}else if(num <= 10 && num >= 0){
			System.out.printf("O número %.2f não é par e está entre 0 e 10.", num);
		}else if(num % 2 != 0){
			System.out.println("O número não é par nem está entre 0 e 10.");
		}else {
			System.out.println("O número é par mas não está entre 0 e 10.");
		}
		
		
		
		
		
		
		entrada.close();
	}

}
