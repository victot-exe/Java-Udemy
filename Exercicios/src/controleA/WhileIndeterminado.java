package src.controleA;

import java.util.Scanner;
// enquanto não for digitado sair o while vai continuar repetindo

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			valor = entrada.nextLine();			
		}
		
		System.out.println("-----FIM!-----");
		
		
		entrada.close();

	}
	
}
