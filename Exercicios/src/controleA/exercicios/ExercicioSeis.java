package src.controleA.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioSeis {
	/**
	 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
	 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
	 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
	 * que o número armazenado.
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numUser;
		Random gerador = new Random();
		Integer aleatorio = gerador.nextInt(101);

//		System.out.println(aleatorio);

		System.out.println("Escolha um numero entre 0 e 100.");

		for (int i = 0; i < 10; i++) {
			System.out.println("Tentativas restantes: " + (10 - i) + ".");
			System.out.print("Escolha um numero: ");
			numUser = entrada.nextInt();
			if (numUser == aleatorio) {
				System.out.println("Parabens voce acertou! o numero era: " + aleatorio + ".");
				i = 9;
				System.out.println();
				break;

			} else if (numUser > aleatorio) {
				System.out.println("Escolha um numero mais baixo.");
				System.out.println();

			} else if (numUser < aleatorio) {
				System.out.println("Escolha um numero mais alto.");
				System.out.println();
			}

			if (i == 9) {
				System.out.println("Esgotaram as tentativas o número era: " + aleatorio + ".");
			}

		}

		entrada.close();
	}

}
