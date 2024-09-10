package src.classeA;

public class ValorVsReferencia {
	/*
	 * Atribuição de valor x atribuição por referência Atribuição por valor é feita
	 * em tipos primitivos, onde se aloca um espaço na memória e se registra o
	 * valor, mesmo que vc diga que uma variável é igual a outra quando vc atribui o
	 * valor ela apenas copia o valor e são duas variáveis diferentes e
	 * independentes, alterar uma não altera a outra. Diferente da atribuição por
	 * referência que é feita quando se instancia um objeto, nela se salva uma valor
	 * Hexadecimal que aponta para um espaço da memória e quando se atribui um
	 * objeto a outro fica salvo o mesmo número de referência da memória alocada e
	 * os objetos mesmo tendo nomes diferentes não são independentes, alterar um
	 * interfere no outro.
	 */
	public static void main(String[] args) {
		

		double a = 2;// criando com a atribuição por valor (quando se trabalha com tipos primitivos)
		double b = a;

		a++;
		b--;
		

		System.out.println(a + "\n" + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // quando se trabalha com objetos a atribuição é feita por referência

		d1.dia = 31;
		d2.mes = 12;
//		Exemplo para mostrar que os dois mesmo tendo nomes diferêntes ainda se relacionam e usam a referência ao mesmo espaço de memória.

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada()); // mesmo tendo alterado especificamente cada um os valores se
														// alteraram para ambos
		voltarDataParaValorPadrao(d2);// mesmo só d2 tendo sido alterado a alteração ocorre em d1 também, pois ambos
										// fazem referência ao mesmo espaço de memória
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		System.out.println(alterarPrimitivo(c));//mesmo tendo usado o c no método não se altera o valor da original
		System.out.println(c);
	}

// O mesmo da referência acontece quando vc da ela de valor como parâmetro para um método abaixo ex
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
//	Usando a atribuição de valor em metodos eles não alteram o valor da original, fazendo assim uma cópia do tipo primitivo e executando o método.]
	static int alterarPrimitivo(int a) {
		return a++;
	}

}
