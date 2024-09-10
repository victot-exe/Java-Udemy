package src.classeA;

public class ValorVsReferencia {
	/*
	 * Atribui��o de valor x atribui��o por refer�ncia Atribui��o por valor � feita
	 * em tipos primitivos, onde se aloca um espa�o na mem�ria e se registra o
	 * valor, mesmo que vc diga que uma vari�vel � igual a outra quando vc atribui o
	 * valor ela apenas copia o valor e s�o duas vari�veis diferentes e
	 * independentes, alterar uma n�o altera a outra. Diferente da atribui��o por
	 * refer�ncia que � feita quando se instancia um objeto, nela se salva uma valor
	 * Hexadecimal que aponta para um espa�o da mem�ria e quando se atribui um
	 * objeto a outro fica salvo o mesmo n�mero de refer�ncia da mem�ria alocada e
	 * os objetos mesmo tendo nomes diferentes n�o s�o independentes, alterar um
	 * interfere no outro.
	 */
	public static void main(String[] args) {
		

		double a = 2;// criando com a atribui��o por valor (quando se trabalha com tipos primitivos)
		double b = a;

		a++;
		b--;
		

		System.out.println(a + "\n" + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // quando se trabalha com objetos a atribui��o � feita por refer�ncia

		d1.dia = 31;
		d2.mes = 12;
//		Exemplo para mostrar que os dois mesmo tendo nomes difer�ntes ainda se relacionam e usam a refer�ncia ao mesmo espa�o de mem�ria.

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada()); // mesmo tendo alterado especificamente cada um os valores se
														// alteraram para ambos
		voltarDataParaValorPadrao(d2);// mesmo s� d2 tendo sido alterado a altera��o ocorre em d1 tamb�m, pois ambos
										// fazem refer�ncia ao mesmo espa�o de mem�ria
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		System.out.println(alterarPrimitivo(c));//mesmo tendo usado o c no m�todo n�o se altera o valor da original
		System.out.println(c);
	}

// O mesmo da refer�ncia acontece quando vc da ela de valor como par�metro para um m�todo abaixo ex
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
//	Usando a atribui��o de valor em metodos eles n�o alteram o valor da original, fazendo assim uma c�pia do tipo primitivo e executando o m�todo.]
	static int alterarPrimitivo(int a) {
		return a++;
	}

}
