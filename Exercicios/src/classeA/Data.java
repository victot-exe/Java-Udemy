package src.classeA;

public class Data {

	int dia;
	int mes;
	int ano;

//	Criar metodo construtor
	Data() {// metodo padr�o com a data padr�o
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		// ex do this(), onde voc� chama um m�todo construtor dentro do outro
		this(1, 1, 1970);// aqui ele pega o outro m�todo construtor e j� seta os valores usa como m�todo,
							// s� pode ser usado dentro de um construtor para chamar outro construtor

	}

	Data(int dia, int mes, int ano) {//parametros s�o vari�veis locais
//		this(); //n�o pode chamar um metodo construtor que j� chamou o outro
		// exemplo de conflito de nomes
		this.dia = dia;// this faz selecionar o Data.dia, caso n�o fosse utilizado e colocasse dia =
						// dia estaria mexendo na vari�vel local do metodo e dando o valor dela para ela
						// mesma
		this.mes = mes;// this � usado para refer�nciar quando existe um conflito de nomes.
		this.ano = ano;
	}// metodos static n�o s�o compat�veis com this, this � um metodo de instancia e
		// n�o funciona em metodos de classe0

	String obterDataFormatada() {

		final String formato = "%d/%d/%d"; //constante (var que nao muda) local criada apenas dentro do metodo
		// vari�veis locais n�o s�o acessiveis fora do escopo em que s�o criadas
//		return dia.toString() + "/" + mes + "/" + ano.toString();
		return String.format(formato, dia, mes, ano);
	}

	void imprimirDataFormatada() {// s� funciona dentro do terminal, fora dele n�o funciona em nenhuma outra
									// plataforma
		System.out.println(this.obterDataFormatada());
	}

//	String formato = "%d/%d/%d";// definida como vari�vel de toda a classe, podendo ser acessada de qualquer
								// lugar, mesmo sendo linhas para cima ou para baixo, o indicado � colocar todas
								// as variaveis no come�o da classe para que p c�digo fique mais organizado
}
