package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Monitor 23", 789.98);

        DAO<Produto> dao = new DAO<>(Produto.class);

//        dao.abriTransacao().incluir(produto).fecharTransacao().fechar();
        dao.incluirAtomico(produto).fechar();

        System.out.println(produto.getId());

    }
}
