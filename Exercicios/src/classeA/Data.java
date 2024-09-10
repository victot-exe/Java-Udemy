package src.classeA;

public class Data {

	int dia;
	int mes;
	int ano;

//	Criar metodo construtor
	Data() {// metodo padrão com a data padrão
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		// ex do this(), onde você chama um método construtor dentro do outro
		this(1, 1, 1970);// aqui ele pega o outro método construtor e já seta os valores usa como método,
							// só pode ser usado dentro de um construtor para chamar outro construtor

	}

	Data(int dia, int mes, int ano) {//parametros são variáveis locais
//		this(); //não pode chamar um metodo construtor que já chamou o outro
		// exemplo de conflito de nomes
		this.dia = dia;// this faz selecionar o Data.dia, caso não fosse utilizado e colocasse dia =
						// dia estaria mexendo na variável local do metodo e dando o valor dela para ela
						// mesma
		this.mes = mes;// this é usado para referênciar quando existe um conflito de nomes.
		this.ano = ano;
	}// metodos static não são compatíveis com this, this é um metodo de instancia e
		// não funciona em metodos de classe0

	String obterDataFormatada() {

		final String formato = "%d/%d/%d"; //constante (var que nao muda) local criada apenas dentro do metodo
		// variáveis locais não são acessiveis fora do escopo em que são criadas
//		return dia.toString() + "/" + mes + "/" + ano.toString();
		return String.format(formato, dia, mes, ano);
	}

	void imprimirDataFormatada() {// só funciona dentro do terminal, fora dele não funciona em nenhuma outra
									// plataforma
		System.out.println(this.obterDataFormatada());
	}

//	String formato = "%d/%d/%d";// definida como variável de toda a classe, podendo ser acessada de qualquer
								// lugar, mesmo sendo linhas para cima ou para baixo, o indicado é colocar todas
								// as variaveis no começo da classe para que p código fique mais organizado
}
