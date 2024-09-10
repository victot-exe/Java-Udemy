package src.lambdasA;

public class CalculoTeste2 {
	public static void main(String[] args) {

		Calculo calc = (x, y) -> {// implementou diretamente a instancia da interface usando a lambda, colocando o
									// mesmo n�mero de par�metros que a fun��o abstrata precisava
			return x + y;
		};

		System.out.println(calc.executar(2, 3));

		calc = (x, y) -> x * y;// quando n�o se coloca o par de chaves e s� a senten�a, o java entende que o
								// que � feito na senten�a j� � um return
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());//acessando m�todo default
		System.out.println(Calculo.muitoLegal());//acessando m�todo static
		
		
	}
}
