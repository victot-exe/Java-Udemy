package src.excecao;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		System.out.println("Come�o");
		
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {//um c�digo que sempre � executado independente de ter erro ou n�o
			System.out.println("Finally #01...");
		}
	
		try {
			System.out.println(7 / entrada.nextInt());
		} finally {//um c�digo que sempre � executado independente de ter erro ou n�o
			System.out.println("Finally #02...");
			entrada.close();
		}
		
		System.out.println("Fim:)");

	}
}
