package src.classeA;

public class ProdutoTeste {
//	como produto e ProdutoTeste est�o no mesmo pacote eu nao preciso importar produto para utilizar
//	o que est� em Java.lang tamb�m n�o precisa ser importado
	public static void main(String[] args) {
//		primeira criação de objeto proposital
//		classname name = new (metodo construtor) classname();
		Produto p1 = new Produto("Notebook", 4356.89);
//		usamos a notação ponto para acessar os atributos ou membros/metodos da instancia
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;

//		outro jeito de instanciar
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.5;
//		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precofinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precofinal1 + precofinal2) / 2;
		
		System.out.printf("Media do carrinho = r$ %.2f.", mediaCarrinho);
		
	}

}
