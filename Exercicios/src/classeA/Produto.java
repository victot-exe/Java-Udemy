package src.classeA;
// Criação de um tipo "Produto" 
public class Produto {
//	vai ter 3 atributos
	String nome;
	double preco;
	static double desconto = 0.25;//atributo de classe
//	criando o construtor padrão para que ele tambem seja acessado
	Produto(){
	}
//	criando o metodo construtor
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	
	double precoComDesconto() {//como a classe já tem tudo que precisa dentro do objeto não precisa de parâmetros
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {//aqui vemos a assinatura do metodo, que se da por o nome do metodo + os parametros
		return preco * (1 - desconto + descontoDoGerente);// mesmo com o nome igual por essa ter parametro e a outra nao, nao temos um erro
	}
	
}
