package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("8C");
        Cliente cliente = new Cliente("Carlos", assento);

        DAO<Object> dao = new DAO<>();//Como não é para consulta apenas uma instancia de DAO com object para aceitar tanto assento quanto cliente

        dao.abriTransacao()//incluindo, prestar atenção na ordem, já que para incluir o assento em cliente o assento precisa existir primeiro
                .incluir(cliente)//pro caso de inverter a ordem na mesma transação ele mesmo resolve o erro, fazendo um update na table clients
                .incluir(assento)//deixei na ordem errada apenas para exemplo, o certo seria na ordem correta mesmo
                .fecharTransacao()
                .fechar();
    }
}
