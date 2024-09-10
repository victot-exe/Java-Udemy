package src.controleA;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;// continua na execução do laço mas interrompe a execução atual
				//forma não muito inteligente de imprimir apenas os números pares
			}

			System.out.println(i);

		}
	}

}
