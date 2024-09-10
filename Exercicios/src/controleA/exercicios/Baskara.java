package src.controleA.exercicios;

import java.util.Scanner;

public class Baskara {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os valores de a, b e c \n\"ax2 + bx + c = 0\"\n");
		

		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		System.out.printf("%.2fx2 + %.2fx + %.2f", a, b, c);
		
		double delta = (b * b) - (4 * a * c);
		
		System.out.println("\n" + delta);
//		-b +-raiz de delta dividido por 2*a
		double xI = (- b + Math.sqrt(delta))/ (2 * a);
		double xII = (- b - Math.sqrt(delta))/ (2 * a);
		
		System.out.printf("xI = %.2f %nxII = %.2f", xI, xII);
			
		

		entrada.close();
	}

}
