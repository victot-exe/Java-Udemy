package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCLiente = new DAO<>(Cliente.class);

        Cliente cliente = daoCLiente.obterPorID(3L);

        System.out.println(cliente);
        System.out.println("###########");
        System.out.println(cliente.getAssento().getCliente().getNome());

        daoCLiente.fechar();
        DAO<Assento> daoAssento = new DAO<>(Assento.class);

        Assento assento = daoAssento.obterPorID(2L);
        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();

    }
}
