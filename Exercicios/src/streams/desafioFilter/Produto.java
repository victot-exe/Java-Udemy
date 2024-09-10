
package src.streams.desafioFilter;

public class Produto {
	
	final String nome;
	final double preco;
	final boolean vaiNaGeladeira;
	
	public Produto(String nome, double preco, boolean perecivel) {
		this.nome = nome;
		this.preco = preco;
		this.vaiNaGeladeira = perecivel;
	}
}
