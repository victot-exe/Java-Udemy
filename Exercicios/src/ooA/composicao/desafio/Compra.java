package src.ooA.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
//	Cliente cliente;
	List<Item> itens = new ArrayList<>();//Lista de itens
	
	void adicionarItem(int quantidade, Produto produto) {
		this.addItem(new Item(quantidade, produto));
	}
	
	void addItem(int quantidade, Produto produto) {
		this.addItem(new Item(quantidade, produto));
	}
	
	void addItem(Item item) {
		this.itens.add(item);
	}
	
	double getCompraValue() {
		double total = 0;
		for (Item item : itens) {
			total += item.getItemValue();
		}
		return total;
	}
	
	void getItens() {
//		int quantidade = 0;
//		String nome = "";
		for (Item qtde : itens) {
			qtde.getItem();
//			quantidade = qtde.quantidade;
//			for (Item item : itens) {
//				nome = item.produto.nome;
				
//			}
			//System.out.println(nome + "......" + quantidade);
		}
	}
}
