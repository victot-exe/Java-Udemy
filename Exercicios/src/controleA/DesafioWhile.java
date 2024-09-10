package src.controleA;

import java.util.Scanner;

// pedir nota entre 0 e 10, armazenar em total, e somar e outra var para saber quantas notas tem sai se digitar -1
public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double soma = 0;
		int contagem = 0;

//		boolean sair = nota != -1 ? true : false;
		while (nota != -1) {

			System.out.print("Digite uma nota: ");
			nota = entrada.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				System.out.println("if");
				soma += nota;
				contagem++;
			}else if(nota != -1) {
				System.out.print("Digite uma nota válida: ");
				nota = entrada.nextDouble();
			}
		}

		double media = soma / contagem;
		System.out.printf("A somatória é : %.2f, a média entra as %d notas da turma é %.2f.", soma, contagem, media);
		System.out.println("---FIM!---");

		entrada.close();
	}

}
