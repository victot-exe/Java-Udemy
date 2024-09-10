package src.arraysOk;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {
//	matriz são arrays dentro de arrays
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de alunos na sala: ");
		int qteAlunos = entrada.nextInt();
		System.out.print("Quantas notas compõe a média: ");
		int qteNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double [qteAlunos][qteNotas];
		double [] alunosMedias = new double[qteAlunos];
		
		double total = 0;
			
		for (int a = 0; a < notasDaTurma.length; a++) {
			double mediaInd = 0;
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Insira a %dº nota para o aluno %d:\n", (n + 1), (a + 1));
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
				
				mediaInd += notasDaTurma[a][n];//para calcular a soma das notas para a media individual
			}
			alunosMedias[a] = (mediaInd / qteNotas);//pega as notas e faz a media individual
		}
		
		double mediaDaTurma = total / (qteAlunos * qteNotas);
		System.out.println("A média da turma é: "+ mediaDaTurma);
		
		for(double[] notasAlunos: notasDaTurma) {
			System.out.println(Arrays.toString(notasAlunos));
		}
		//fazer o calculo da média de cada aluno
		System.out.println(Arrays.toString(alunosMedias));
		
		entrada.close();
	}

}
