package src.controleA.exercicios;

import java.util.Scanner;

//Mesmo do 4 porem utilizando switch
public class ExercicioCinco {
	
	public static void main(String[] args) {
		
		int contadorDeDivisao = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o n�mero para verificar se � primo: ");
		int num = entrada.nextInt();
		
		for(int i = 2; i < num ; i++) {
			if(num % i == 0) {
				contadorDeDivisao++;
			}
		}
		
		switch(contadorDeDivisao) {
		case 0:
			System.out.println(num + " � um n�mero primo.");
			break;
		default:
			System.out.println(num + " n�o � um n�mero primo.");
		}
		
		

		entrada.close();
	}

}
