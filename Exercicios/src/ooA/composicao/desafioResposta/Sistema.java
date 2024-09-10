package src.ooA.composicao.desafioResposta;

public class Sistema {
	public static void main(String[] args) {
		

		Compra compraUm = new Compra();
		compraUm.adicionarItem("Caneta", 9.67, 100);
		compraUm.adcionarItem(new Produto("Notebook", 1897.88), 2);
		
		Compra compraDois = new Compra();
		compraDois.adicionarItem("Caderno", 10, 10);
		compraDois.adcionarItem(new Produto("Impressora", 998.90), 1);
	
		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.adicionarCompra(compraUm);
		cliente.compras.add(compraDois);
		
		System.out.println(cliente.obterValorTotal());
	}
}
