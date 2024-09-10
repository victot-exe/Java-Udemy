package src.controleA;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
//		não usar ; em estruturas de controle, tem uma exceção.
		if (media >= 10 && media >= 7.0) { // usar as chaves para associar o bloco de codigo ao if, se não ele se
											// encerra na pr�xima linha com ;
			System.out.println("Aprovado!");
			System.out.println("Parabens!");
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o!!");
		}
		boolean CriterioDeAprovacao = media >= 0 && media < 4.5; // Separar as condi��es do If em vari�veis pode
																			// ser interessante e facilitar o
																			// entendimento do codigo
		if (CriterioDeAprovacao) {
			System.out.println("Reprovado!");
		}

		entrada.close();
	}

}
