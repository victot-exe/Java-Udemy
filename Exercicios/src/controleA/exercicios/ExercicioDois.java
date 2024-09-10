package src.controleA.exercicios;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Coloque o ano que deseja verificar: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
		
		if(bissexto == true ) {
			System.out.println(ano + " é bissexto");
		}else {
			System.out.println(ano + " não é bissexto");
		}
		
		entrada.close();
	}

}
