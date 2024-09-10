package src.lambdasA;

@FunctionalInterface //for�a a a interface a ter apenas um m�todo(fun��o) abstrato

//quando a interface tem mais de uma fun��o o java n�o sabe qual vai ser implementada
public interface Calculo {
	                                                                           
	public abstract double executar(double a, double b);
	
//	double teste();//teste para mostrar que n�o da pra por mais de uma fun��o (m�todo) em uma @FuncionalInterface;
	
	default String legal() {//se eu implemento um m�todo default n�o da erro na valida��o @FuncionalInterface
		return "legal";
	}
	
	static String muitoLegal() {//se eu implemento um m�todo static n�o da erro na valida��o @FuncionalInterface
		return "Muito Legal";
	}
}
