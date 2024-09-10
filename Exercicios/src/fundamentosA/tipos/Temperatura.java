package src.fundamentosA.tipos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
//		(F°-32) * 5/9 = C°
//		tecla de atalho Alt + seta para mover a linha de código
//		ctrol + Alt + down duplica a linha
		
		final double DIF = 32;
		final double FATOR = 5.0 / 9.0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a temperatura em fahrenheit: ");
		double fah = entrada.nextDouble();
		
		double celcius = ((fah -  DIF ) * FATOR);
		System.out.println(fah + " °F é igual a " + celcius + "° C.");
//		----Esta parte era sem o Scanner v1
//		fah = 172;
//		celcius = ((fah -  DIF ) * FATOR);
//		System.out.println(fah + " °F é igual a " + celcius + "° C.");

		entrada.close();
		
	}

}
