package br.com.victot.exerciciossb.model.repositories;

import br.com.victot.exerciciossb.model.entitys.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {


}
