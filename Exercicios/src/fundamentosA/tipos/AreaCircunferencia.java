package src.fundamentosA.tipos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
//		System.out.println(2 + 3);
//		para declarar variáveis "tipo nome_da_var = valor_atribuido"
		double raio = 3.4;
//		para fazer uma var virar const colocamos final antes do tipo (colocar os nomes de const com MAIUSCULA)
		final double PI = 3.14159;
				
		double area = PI * raio *raio;
//		Atalho para print syso ctrl + space
		System.out.println(area);
		
		raio = 2.4444;
		area = PI * raio * raio;
		System.out.println("Area = " + area + " m2");
		
	}
}
