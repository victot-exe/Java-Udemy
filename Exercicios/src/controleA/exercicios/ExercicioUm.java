package src.controleA.exercicios;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String[] args) {
		
//		Exercicio 01 receber 1 numero e ver se ele esta entre 0 e 10 e � par
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva um n�mero: ");
		double num = entrada.nextDouble();
		
		if(num % 2 == 0 && num >= 0 && num <= 10) {
			System.out.printf("O n�mero %.2f � par e est� entre 0 e 10.", num);
		}else if(num <= 10 && num >= 0){
			System.out.printf("O n�mero %.2f n�o � par e est� entre 0 e 10.", num);
		}else if(num % 2 != 0){
			System.out.println("O n�mero n�o � par nem est� entre 0 e 10.");
		}else {
			System.out.println("O n�mero � par mas n�o est� entre 0 e 10.");
		}
		
		
		
		
		
		
		entrada.close();
	}

}
