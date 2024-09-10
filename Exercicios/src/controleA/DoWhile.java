package src.controleA;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//if(...) sentenÃ§a; ou {...}
		//while(...) Senteça; ou {...}
		//for(...;...;...) Sentença; ou {...}
		
		//do {} while(...); unica que termina com ";"
		
		//preferencias procura templete java/editor/template trechos de codigo para serem atalhos syso
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
//		Pelo menos uma vez ele executa o código do do e só para quando o while após o bloco é falso
		do {
			System.out.println("Você precisa falar" 
								+ "as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		System.out.println("---Fim!!!---");
		
		entrada.close();
		
		
	}
}
