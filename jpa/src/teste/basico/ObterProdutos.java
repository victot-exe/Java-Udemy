package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        produtos.forEach(System.out::println);

        double precoTotal = produtos
                .stream()
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);

        System.out.println(precoTotal);

        dao.fechar();
    }
}
