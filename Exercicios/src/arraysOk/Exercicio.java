//um conjunto de dados estático, o tamanho não pode ser alterado e deve ser definido na inicialização da array.
package src.arraysOk;

import java.util.Arrays;//classe que permite varias funções com arrays



public class Exercicio {
	
	public static void main(String[] args) {
//		metodo construtor de uma array
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));

		//		para acessar as partes da array usamos o indice, começando em 0
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
//		percorrendo a array
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {//.lenght é um atributo retorna um int do número de elementos da array
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		System.out.println(notasAlunoA[notasAlunoA.length -1]);//para acessar o ultimo elemento da array
//		System.out.println(notasAlunoA[4]); ERRO! um número que vai alem do limite a array.
		
		final  double notaArmazenada = 5.9;//também podemos utilizar vars desde que sejam do tipo da array
		//metodo menos utilizado devido a de onde os dados vão vir
		double notasAlunoB[] = {6.9, 8.9, notaArmazenada, 10};//outra metodo construtor de uma array
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
