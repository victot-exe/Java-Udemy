package src.lambdasA;

public class Produto extends Object{//toda a classe extende Object de forma implicita
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {//como foi implementado o método toString o print puxa ele
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$ " + precoFinal;
	}
}
