package src.ooA.composicao.exemploCompraUmN;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Jo�o Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);//feito apenas ap�s a cria��o da segunda parte do m�todo adicionarItem();
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());//return o n de itens da array
		System.out.println(compra1.obterValorTotal());
		
		//s� pra mostrar a rela��o biderecional, na pratica n�o usa.
		double total = (compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal());//esse caminho torto s� � possivel pois essas classes s�o bidirecionais
		System.out.println("O total �: r$ " + total);
	}
}
