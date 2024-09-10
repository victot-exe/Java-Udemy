package src.arraysOk;

import java.util.Arrays;

//fazer o exercicio1 usando o foreach
public class Exercicio2 {
	
	public static void main(String[] args) {
		int e = 4;
		double[] notasAlunoA;//criando
		notasAlunoA = new double[e];//inicializando
		System.out.println(notasAlunoA);//imprimir o endereço de memoria da array
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		for(double notas : notasAlunoA) {
			totalA += notas;
		}
		System.out.println(totalA / notasAlunoA.length);
		
		double a = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, a, 10 };
		
		double totalB = 0;
		for (double notas : notasAlunoB) {
			totalB += notas;
		}
		
		System.out.println(totalB / notasAlunoB.length);
		
		
	}
}
