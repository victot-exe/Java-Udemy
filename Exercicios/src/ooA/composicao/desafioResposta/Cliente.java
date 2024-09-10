package src.ooA.composicao.desafioResposta;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;//coloca o final pois n�o � algo que vai ser alterado
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
