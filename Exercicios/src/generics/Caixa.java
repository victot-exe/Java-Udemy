package src.generics;//generics � usado para deixar o tipo para ser definido no momento que o objeto for instanciado
//exemplo COM generics
public class Caixa<T> {//<>simbolo que indica o gen�rics para que o TIPO<T> seja especificado quando for utilizada a classe

	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}
}
