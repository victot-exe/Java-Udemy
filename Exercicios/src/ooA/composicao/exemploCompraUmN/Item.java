package src.ooA.composicao.exemploCompraUmN;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	Compra compra;//Bidirecional, deixar um item associado a uma compra
	
	Item(String nome, int quantidade, double preco){//metodo construtor que já pede todos os dados
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
