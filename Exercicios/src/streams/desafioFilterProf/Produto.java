package src.streams.desafioFilterProf;

public class Produto {
	
	final String nome;
	final double preco;
	double desconto;
	double precoFrete = 0.00;
	
	public Produto(String nome, double preco, double desconto, double precoFrete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.precoFrete = precoFrete;
	}
	
	final boolean freteGratis = precoFrete == 0;
	
	double valorComDesconto() {
		return this.preco * (1 - this.desconto);
	}
	
}
