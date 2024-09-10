package src.fundamentosA.tipos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1;//conversão implicita quando o número vem de um tipo menor que o para qual está indo
		System.out.println(a);
		
		float b = (float) 1.123454676879807445;//aqui foi feito um cast (conversão explicita), onde de forma explicita armazenamos um float que foi convertido de um double
		System.out.println(b);//como o float não consegue armazenar daquele tamanho mas foi indicado de forma explicita que era um float não deu erro porém perdeu informação
		
		int c = 240;
		byte d = (byte) c;//neste caso como o número supera o range ele após o ultimo volta para o começo da sequência e segue avançando
		System.out.println(d);//por isso o println sai um número completamente diferente
		
		double e = 1.9999;
		int f = (int) e; //explicita (CAST)
		System.out.println(f);
		
		
	}

}
