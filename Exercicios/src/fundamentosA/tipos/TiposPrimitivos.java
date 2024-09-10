package src.fundamentosA.tipos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
//		imformações do funcionário
		
//		tipo numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		//usar _ para colocar os pontos e ficar mais facil de visualizar o número
		long pontosAcumulados = 3_234_222_999L; /*usar um 'L' ou 'l'para dizer que o número ainda é inteiro do tipo long e não dar erro, caso contrario
													o java entende que a var deve ser dos tipos de ponto flutuante */
//		tipos numéricos reais com ,
		float salario = 11_445.44F;//mesmo esquema do L só que usando o F já q o tipo real padrão é o double, precisa ser indicado que é float
//		o java não analisa o valor, ele analisa o tipo, os tipos de numeros padrão são int e double. Por isso o float e o long precisam ser indicados com F e L
		double vendasAcumuladas = 2_991_797_103.01;

		
//		tipo boolean
		boolean estaDeFeras = true; //true or false
		
//		tipo char
		char status = 'A'; //Apenas um caractere (letra, numero, simbolo)
		
//		Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
//		Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
//		pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "-> ganha -> " + salario + "R$");
		System.out.println("Férias ->" + estaDeFeras);
		System.out.println("Status ->" + status);
		
		
	
	}
}
