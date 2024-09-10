package src.lambdasA;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		//Funcion<TipoEntrada, TipoSaida>
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		
		Function<String, String> oResultadoE =
				valor -> "O resultado é: " + valor;
				
		Function<String, String> empolgado =
				valor -> valor + "!!!";
		
		Function<String, String> duvida =
				valor -> valor + "???";
		
		String resultadoFinal1 =parOuImpar
				.andThen(oResultadoE)//andThen junta uma função na outra
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(parOuImpar.apply(32));//.apply aplica diretamente a funcion
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 =parOuImpar
				.andThen(oResultadoE)//andThen junta uma função na outra
				.andThen(duvida)
				.apply(33);
		
		System.out.println(parOuImpar.apply(33));//.apply aplica diretamente a funcion
		System.out.println(resultadoFinal2);
	}
}
