package src.fundamentosA.operadores;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;// é o ou exclusivo pois ele vai comprar a tv de 50 caso de certo os dois trabalhos e se comprar a de 50 n compra a de 32
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"? " + comprouTV50);
		System.out.println("Comprou Tv 32\"? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudavel? " + maisSaudavel);
		
		
		
		
		
	}

}
