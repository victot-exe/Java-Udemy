package src.fundamentosA.tipos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Bom"); //o print continua escrevendo na mesma linha != do print ln que começa na linha escreve e depois da o \n
		System.out.print("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); //printf é para strings formatadas, não da quebra de linha no final, %n tambem quebra a lina
		System.out.printf("\nSalario: %.1f%n", 2400.1234);
		
		//Scanner pega o que o usuário digita no console para usar no programa
		Scanner entrada = new Scanner(System.in); //System.in faz o scanner ir para o teclado e pegar tudo que é digitado, temos outros métodos para outras entradas
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); //quando a entrada não vai ser str não pode usar .nextLine()
			
		
		System.out.printf("%n%n%s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close();//Depois de utilizar o Scanner() deve-se fecha-lo para que ele não continue a ocupar recursos da máquina.
		
		
		
	}

}
