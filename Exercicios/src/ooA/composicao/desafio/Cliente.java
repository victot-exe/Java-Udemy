package src.ooA.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompras(Compra compra) {
		this.compras.add(compra);
//		compra.cliente = this;
	}
	
	String getTotalCompras() {//metodo que vai percorrer a List e vai retornar o total de todas as compras somando-as
		double total = 0;
		for (Compra compra : compras) {
			total += compra.getCompraValue();
		}
		return "Total .... r$" + total;
	}
	
	void getCompras() {
		for (Compra compra : compras) {
			compra.getItens();
		}
	}
	
	void getResume() {
		System.out.println(this.nome);
		this.getCompras();
		System.out.println(this.getTotalCompras());
	}
	
	public String toString() {
		return nome;
	}
}
