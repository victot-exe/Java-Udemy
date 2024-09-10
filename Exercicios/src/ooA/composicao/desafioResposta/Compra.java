package src.ooA.composicao.desafioResposta;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, double preco, int quantidade) {
		
		Produto produto = new  Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
		
	}
	void adcionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	
	double obterValorTotal() {
		
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
