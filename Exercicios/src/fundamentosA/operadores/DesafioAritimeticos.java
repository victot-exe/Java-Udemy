package src.fundamentosA.operadores;

public class DesafioAritimeticos {
//	refazer utilizando menos variáveis
	
	public static void main(String[] args) {
		
//------primeira parte da conta------
		int supI = (int)Math.pow((6*(3+2)), 2);
		int I = (int)supI / (3 * 2);
//------segunda parte da conta-------		
		int supII = (1 - 5) * (2 - 7);
		int infII = supII / 2;
		int II = (int)Math.pow(infII, 2);
//------terceira parte da conta------
		int III = I - II;
		III = (int)Math.pow(III, 3);
		
		int fim = III / (int)Math.pow(10, 3);
		
		
		System.out.println(fim);
		
		
	}

}
