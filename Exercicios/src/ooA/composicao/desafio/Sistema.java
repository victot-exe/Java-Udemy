package src.ooA.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Nicole");
		
//		Compra compraUm = new Compra();
		cliente.adicionarCompras(new Compra());
		cliente.adicionarCompras(new Compra());
		
		cliente.compras.get(0).addItem(12, new Produto("lápis", 0.56));
		cliente.compras.get(0).addItem(4, new Produto("borracha", 3.52));
		cliente.compras.get(1).addItem(6, new Produto("pacote de papel", 5.56));
		cliente.compras.get(1).addItem(3, new Produto("caderno", 18.86));
		
		cliente.getResume();
		
//		cliente.getCompras();
//		System.out.println(cliente.getTotalCompras());
		
//		for(Compra c: cliente.compras) {
//			System.out.println(c.itens.get(0).quantidade);
//		}
	}
}
