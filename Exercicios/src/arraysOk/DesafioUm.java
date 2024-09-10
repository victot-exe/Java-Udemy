package src.arraysOk;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioUm {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas quer informar por aluno?\n");
		int nElementos = entrada.nextInt();
		
		double[] nota = new double[nElementos];
		
		for(int i = 0; i < nota.length; i++) {
			System.out.printf("Digite a %dª nota: ", (i + 1));
			nota[i] = entrada.nextDouble();
		}
		System.out.println();
		System.out.println(Arrays.toString(nota));
		
		
		double total = 0;
		for (double d : nota) {
			total += d;
		}
		
		double media = (total / nota.length);
		System.out.printf("A média entre as notas é: %.2f!", media);
		
		
		
		entrada.close();
		
	}
}
