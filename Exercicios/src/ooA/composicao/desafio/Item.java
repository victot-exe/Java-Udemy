package src.ooA.composicao.desafio;

public class Item {
	
	int quantidade;
	Produto produto;
	
	Item(int quantidade, Produto produto){
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	double getItemValue() {//retorna o valor total do item
		double total = produto.preco * this.quantidade;
		return total;
	}
	
	void getItem() {
		System.out.println(quantidade + "......" + produto + "...... r$ " + produto.preco);
	}
}
