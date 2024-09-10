package src.lambdasA;

public class CalculoTeste2 {
	public static void main(String[] args) {

		Calculo calc = (x, y) -> {// implementou diretamente a instancia da interface usando a lambda, colocando o
									// mesmo número de parâmetros que a função abstrata precisava
			return x + y;
		};

		System.out.println(calc.executar(2, 3));

		calc = (x, y) -> x * y;// quando não se coloca o par de chaves e só a sentença, o java entende que o
								// que é feito na sentença já é um return
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());//acessando método default
		System.out.println(Calculo.muitoLegal());//acessando método static
		
		
	}
}
