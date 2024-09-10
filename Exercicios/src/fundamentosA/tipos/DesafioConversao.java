package src.fundamentosA.tipos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o salário o primeiro mês?");
		String mes1 = entrada.nextLine().replace(',', '.').replace(" ", "");
		System.out.println("Qual o salário o primeiro mês?");
		String mes2 = entrada.nextLine().replace(',', '.');
		System.out.println("Qual o salário o primeiro mês?");
		String mes3 = entrada.nextLine().replace(',', '.');
		
		double mes1d = Double.valueOf(mes1).doubleValue();
//		double mes1d = Double.parseDouble(mes1);
//		double mes2d = Double.parseDouble(mes2);
		double mes2d = Double.valueOf(mes2).doubleValue();
//		double mes3d = Double.parseDouble(mes3);
		double mes3d = Double.valueOf(mes3).doubleValue();
		
		double media = (mes1d + mes2d + mes3d) / 3;
		
		System.out.printf("A média entre os salários:%n %.2f%n %.2f%n %.2f%n é de %.2f", mes1d, mes2d, mes3d, media);
		
		entrada.close();
		
		
		
		
	}

}
