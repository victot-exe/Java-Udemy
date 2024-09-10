package src.fundamentosA.tipos;

import java.util.Scanner;

public class TesteNextIntDouble {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual seu sobrenome?");
		String sobrenome = teclado.nextLine();

		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		/*
		 * No código acima quando executado quando damos um enter após digitar a idade o
		 * teclado lê o enter como um \n o armazenando na próxima variável. para
		 * resolver colocamos um teclado.nextLine() após a idade para que ela pegue o \n
		 * do enter, segue o código abaixo
		 */

		
		System.out.println("Qual a sua idade?");
		idade = teclado.nextInt();
		teclado.nextLine(); //usamos esse para pegar o \n após o 23
		System.out.println("Qual o seu nome?");
		nome = teclado.nextLine();
		System.out.println("Qual seu sobrenome?");
		sobrenome = teclado.nextLine();

		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

		teclado.close();
		

	}
}
