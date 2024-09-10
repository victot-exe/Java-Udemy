package src.fundamentosA.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {//argumentos que vc vai colocar na hora que chama o metodo
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));//o . equals compara o conteúdo das strings e assim conseguimos o resultado desejado
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();//o next tira os espaços em branco != do nextLine
		System.out.println("2" == s2.trim());//.trim remove os espaços
		System.out.println("2".equals(s2.trim()));//.trim remove os espaços
		
		
		entrada.close();
		
		
		
	}

}
