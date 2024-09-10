package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);
        Pedido p = dao.obterPorID(1L);

        for(ItemPedido item : p.getItens()){
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto());
        }

        dao.fechar();
    }
}
