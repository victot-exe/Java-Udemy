package src.fundamentosA.tipos;

import java.util.Scanner;

public class Wrappers {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número --> ");
		String num = teclado.next();
		
//		Abaixo vão exemplos de como declarar tipos primitivos como wrappers (Tipos primitivos orientados a objetos)
//		Declara o Tipo com letra maiúscula
		
		Byte b = 100;
		Short s = 1000;
//		Integer i = Integer.parseInt("10000");
		Long l = 100000L;
		Integer i = Integer.parseInt(num);
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		
		Boolean bo = Boolean.parseBoolean("false");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		
		teclado.close();
		
	}

}
