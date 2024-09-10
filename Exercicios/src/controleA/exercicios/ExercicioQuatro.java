package src.controleA.exercicios;

import java.util.Scanner;

// programa que recebe um numero e verifica se o mesmo é primo
public class ExercicioQuatro {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int contadorDeNumero = 0;

		System.out.print("Insira um número para verificar se é primo: ");
		int num = entrada.nextInt();

		for (int i = 2; i < num; i++) {//neste for testamos o número para ver por quantos números o resto de divisão da 0
			if (num % i == 0) {
				contadorDeNumero++;//se o contador de numero (ele conta quantos numeros foi possivel fazer a divisão) continuar 0
				//o numero é primo
			}
		}
		if(contadorDeNumero == 0) {
			System.out.println(num + " é um número primo.");
		}else {
			System.out.println(num + " não é um número primo");
		}

		entrada.close();

	}

}
