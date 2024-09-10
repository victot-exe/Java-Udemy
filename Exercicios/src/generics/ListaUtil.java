package src.generics;

import java.util.List;

public class ListaUtil {
	//construção que precisa de casting(conversão)
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() -1);
	}
	//construção para não se preocupar com o casting
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() -1);
	}
	//pode ter mais de um parâmetro genérico
	public static <A, B, C> C teste(A paramA, B paramB) {
		C  teste = null;
		return teste;
	}
}
