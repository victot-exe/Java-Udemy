package src.controleA;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;// continua na execu��o do la�o mas interrompe a execu��o atual
				//forma n�o muito inteligente de imprimir apenas os n�meros pares
			}

			System.out.println(i);

		}
	}

}
