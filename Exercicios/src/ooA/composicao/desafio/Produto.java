package src.ooA.composicao.desafio;

public class Produto {
	
	String nome;
	double preco;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	Produto(){
	}
	
	public String toString() {
		return nome;
	}
}
