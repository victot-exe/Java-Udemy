package src.lambdasA;

@FunctionalInterface //força a a interface a ter apenas um método(função) abstrato

//quando a interface tem mais de uma função o java não sabe qual vai ser implementada
public interface Calculo {
	                                                                           
	public abstract double executar(double a, double b);
	
//	double teste();//teste para mostrar que não da pra por mais de uma função (método) em uma @FuncionalInterface;
	
	default String legal() {//se eu implemento um método default não da erro na validação @FuncionalInterface
		return "legal";
	}
	
	static String muitoLegal() {//se eu implemento um método static não da erro na validação @FuncionalInterface
		return "Muito Legal";
	}
}
