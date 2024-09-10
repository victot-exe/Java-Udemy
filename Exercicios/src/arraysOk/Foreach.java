package src.arraysOk;

public class Foreach {
	// é o jeito de fazer um for mais simples para percorrer todos os elementos da
	// array um a um	
	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };

		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}

		System.out.println();

		for (double nota : notas) {// montando o foreach
			System.out.print(nota + " ");
		}
	}

}
