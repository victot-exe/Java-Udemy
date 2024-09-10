package src.fundamentosA.tipos;

public class Inferencia {
	
	public static void main(String[] args) {
//		as variaveis em java não podem ter o seu tipo alterado, a inferência define automaticamente o tipo da var pelo valor que damos a ela
		int a; //declarando a variável
		a = 2; // iniciando a variável
		System.out.println(a);
		
		double b = 12.75; //declarando e iniciando a var na mesma sentença
		System.out.println(b);
		
		var c = "Mucho tecxto"; //aqui fazemos uso da inferência, que define auto o tipo de c para str
		System.out.println(c);
		/*		var d; não podemos apenas declarar variáveis que usam o var pois o Java já define na declaração o tipo da mesma
 * já que sem um valor declarado o Java não consegue definir o tipo */
		
		
				
		
		
	}

}
