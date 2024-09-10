package src.ooA.composicao.exemploCompraUmN;

import java.util.ArrayList;

public class Compra {

	String cliente;// num sistema normal cliente seria um objeto
	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(String nome, int quantidade, double preco) {// metodo que permite que vc possa tanto criar o item
																	// antes ou durante a adição do mesmo a compra
		this.adicionarItem(new Item(nome, quantidade, preco));// usa o outro método para adicionar
	}

	void adicionarItem(Item item) {// Bidirecional
		this.itens.add(item);// adicionando o Item a lista.
		item.compra = this;// adicionando a compra referente ao item.
		// this neste caso diz o nome da classe
	}

//	Método para saber o valor total
	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += (item.preco * item.quantidade);
		}
		return total;
	}
}
