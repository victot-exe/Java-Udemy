package src.generics;

import java.util.List;

public class ListaUtil {
	//constru��o que precisa de casting(convers�o)
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() -1);
	}
	//constru��o para n�o se preocupar com o casting
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() -1);
	}
	//pode ter mais de um par�metro gen�rico
	public static <A, B, C> C teste(A paramA, B paramB) {
		C  teste = null;
		return teste;
	}
}
