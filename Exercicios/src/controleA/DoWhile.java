package src.controleA;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//if(...) sentença; ou {...}
		//while(...) Sente�a; ou {...}
		//for(...;...;...) Senten�a; ou {...}
		
		//do {} while(...); unica que termina com ";"
		
		//preferencias procura templete java/editor/template trechos de codigo para serem atalhos syso
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
//		Pelo menos uma vez ele executa o c�digo do do e s� para quando o while ap�s o bloco � falso
		do {
			System.out.println("Voc� precisa falar" 
								+ "as palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		System.out.println("---Fim!!!---");
		
		entrada.close();
		
		
	}
}
