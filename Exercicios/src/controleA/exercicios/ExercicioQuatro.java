package src.controleA.exercicios;

import java.util.Scanner;

// programa que recebe um numero e verifica se o mesmo � primo
public class ExercicioQuatro {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int contadorDeNumero = 0;

		System.out.print("Insira um n�mero para verificar se � primo: ");
		int num = entrada.nextInt();

		for (int i = 2; i < num; i++) {//neste for testamos o n�mero para ver por quantos n�meros o resto de divis�o da 0
			if (num % i == 0) {
				contadorDeNumero++;//se o contador de numero (ele conta quantos numeros foi possivel fazer a divis�o) continuar 0
				//o numero � primo
			}
		}
		if(contadorDeNumero == 0) {
			System.out.println(num + " � um n�mero primo.");
		}else {
			System.out.println(num + " n�o � um n�mero primo");
		}

		entrada.close();

	}

}
