package src.controleA;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
//		nÃ£o usar ; em estruturas de controle, tem uma exceÃ§Ã£o.
		if (media >= 10 && media >= 7.0) { // usar as chaves para associar o bloco de codigo ao if, se nÃ£o ele se
											// encerra na próxima linha com ;
			System.out.println("Aprovado!");
			System.out.println("Parabens!");
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação!!");
		}
		boolean CriterioDeAprovacao = media >= 0 && media < 4.5; // Separar as condições do If em variáveis pode
																			// ser interessante e facilitar o
																			// entendimento do codigo
		if (CriterioDeAprovacao) {
			System.out.println("Reprovado!");
		}

		entrada.close();
	}

}
